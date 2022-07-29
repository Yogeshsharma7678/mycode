/*program to print a multi dimentional
  array through user input
  */
import java.util.*;      //importing package for Scanner Class
class multiDimensArray 
{
   public static void main(String []args)
  {
   
   int i,j,rows,cols;
   
   Scanner sc=new Scanner(System.in);   //creating new scanner object
   
   System.out.println("---enter no of rows---");
   
   //to take no of rows from user
   rows=sc.nextInt();          
   
   System.out.println("---enter no of cols---");
   
   //to take no of columns from user
   cols=sc.nextInt();
   
   System.out.println("enter elements of array by column:");  
   
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
  
  //loop to print inputs
   for(i=0;i<rows;i++)
   {
     for(j=0;j<cols;j++)
	 {
	   
	   System.out.print(ar[i][j]+" ");
		
	 }
	 System.out.println("");
   }
   
   
  }
}