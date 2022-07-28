/* program to print maximum element
   of he array
*/
import java.util.*;
class arrayMaxElement {

public static void main(String[]args){

  int i,len;

  Scanner sc=new Scanner(System.in);

  System.out.println("---enter length/size of array---");

  len=sc.nextInt();           //taking length of array from the user
  int ar[]=new int[len];

  System.out.println("---enter elements of array---");

  for(i=0;i<len;i++)
  {
  ar[i]=sc.nextInt();
  }
  System.out.println("elements of array are:");
  for(int j=0;j<len;j++)
  {
  System.out.println(ar[j]);
  }
  int res=findMax(len,ar);   //call of method using res variable
 
  sc.close();
}
public static int findMax(int len,int ar[])    // creating another method to find maximum of array
 {
   int max=ar[0];  //suppose ar[0] is maximum
   for(int i=0;i<len;i++)
   { 
    if(max<ar[i])
     {
      max=ar[i];
       }
   }
   System.out.println("Maximum element of array is:"+max);
return max;
}

}