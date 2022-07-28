/*program to print array 
  through input of user
*/

import java.util.*;
class Array3 {

public static void main(String[]args){

  int i,len;

  Scanner sc=new Scanner(System.in);

  System.out.println("---enter length/size of array---");

  len=sc.nextInt();                 
// for taking lenght of array from user

  int ar[]=new int[len];

  System.out.println("---enter elements of array---");

  for(i=0;i<len;i++)   /* loop for taking input of
                         elements of array from user*/
  {
  ar[i]=sc.nextInt();
  }
  System.out.println("elements of array are:");  
  
  for(int j=0;j<len;j++)     //loop to print the array
  {
  System.out.println(ar[j]);
  }
 sc.close();
 }
}