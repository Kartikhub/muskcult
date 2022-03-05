import java.util.Scanner;

class OaklandMatrix
{
 public static void main(String args[])
 {
 int i, j;
 int matrix1[][] = new int [3][3];
 int matrix2[][] = new int [3][3];
 int result[][] = new int [3][3];

 Scanner sc = new Scanner(System.in);

 System.out.println( "Enter the elements of first matrix" );

 for(i = 0; i < 3; i++ )
 {
  for( j = 0; j < 3; j++ )
  {
   matrix1[i][j] = sc.nextInt();
  }
  System.out.println();
 }

 System.out.println("Enter the elements of second matrix");

 for( i = 0; i < 3; i++ )
 {
  for( j = 0; j < 3; j++ )
  {
   matrix2[i][j] = sc.nextInt();
  }
  System.out.println();
 }

 for( i = 0; i < 3; i++ )
 {
  for( j = 0; j < 3 ; j++)
  {
   result[i][j] = matrix1[i][j] + matrix2[i][j] ;
  }
 }
 
 System.out.println("Sum of matrices:-");
 for( i = 0; i < 3; i++ )
 {
  for( j = 0; j < 3; j++)
  {
   System.out.print(result[i][j]+"\t");
  }
  System.out.println();
 }
 }
}
