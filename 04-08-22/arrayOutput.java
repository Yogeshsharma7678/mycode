/*program to  Read array of integers and a target from the user
and the return indexes of the two numbers such they add upto the target
(create a seprate method to perform operation)
*/
import java.util.*;      //importing the package 

class arrayOutput {    //main class

   public static void main(String []args)    //main method
   {  
     Scanner sc = new Scanner(System.in);   //scanner t take inputs from user
	 
	 System.out.println("enter the length of array:");
      
	 int len=sc.nextInt(); 
	  
     int ar[]=new int[len];          //object to read array
	 
	  System.out.println("enter the element of array:");
	 
	 for(int i=0; i<len;i++)  //loop to read input 
	 {
		ar[i]=sc.nextInt(); 
		
	 }
	 
	 for(int i=0; i<len;i++)  //loop to print input
	 {
     	 System.out.print(ar[i]+" ");
     }
	  System.out.println("");
	  
	  System.out.println("whats ur target :");
	  
	  int target=sc.nextInt();  //object to ask target
	  
	  Target(len,ar);   // calling the Target method
	  
	  sc.close();
   }
   
   public static void Target (int len, int ar[])   //another method to check operations for target
   {
	  
	   for(int i=0;i<len;i++)     //loop to check addition operation
	   {
		 for(int j =i+1;j<len;j++)
		 {
	      if(ar[i]+ar[j]==target)
		  {
			  System.out.println("adding "+ar[i]+" & "+ar[j]);  //printing the operands
		  }
	     }   
	   }
	   for(int i=0;i<len;i++)  //loop to check multiplication operation
	   {
		 for(int j =i+1;j<len;j++)
		 {
	      if(ar[i]*ar[j]==target)
		  {
			  System.out.println("multiplying "+ar[i]+" & "+ar[j]); //printing the operands
		  }
	     }   
	   }
   }
}  