/*program to print transpose of 
  given matrix by user
  */
import java.util.*;
class transposeMatrix 
{
   public static void main (String[]args)   
  {
   
   int i,j,rows,cols;
   
   Scanner sc=new Scanner(System.in);   //creating new scanner object
   
   System.out.println("---enter no of rows---");
   
   //to take no of rows from user
   rows=sc.nextInt();          
   
   System.out.println("---enter no of cols---");
   
   //to take no of columns from user
   cols=sc.nextInt();
   
   System.out.println("enter elements of matrix by column:");  
   
   //declaration of array 
   int ar[][]=new int[rows][cols];   
   
   //loop to read inputs
   for(i=0;i<rows;i++)
   {
     for(j=0;j<cols;j++)
	 {
	   ar[i][j]=sc.nextInt();
		
	 }
	 System.out.println("");
   }
   
   System.out.println("---Original matrix is :---");
   
  //loop to print inputs
   for(i=0;i<rows;i++)
   {
     for(j=0;j<cols;j++)
	 {
	   
	   System.out.print(ar[i][j]+" ");
		
	 }
	 System.out.println("");
   }
   System.out.println("Transpose of this matrix is:");

   transpose(rows, cols, ar);
   
 }
  public static void transpose(int rows, int cols, int ar[][])
 {
   for(int i=0;i<rows;i++)
   {
    for(int j=0;j<cols;j++)
	 {
	   System.out.print(ar[j][i]+" ");
		
	 }
	 System.out.println("");
   }
  
 }
}