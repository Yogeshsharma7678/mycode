class Array2 {
/* to change the value of element
       using index & print
  all the elements one by one */

public static void main(String []args){

int i,len;

int ar[]={15,45,65,32,12,87};  //initializing of array

ar[3]=66;

//to calculating the length of the array
len=ar.length;     

System.out.println(len);

for(i=0;i<len;i++)
   {
System.out.println(ar[i]);
   }
  }
}