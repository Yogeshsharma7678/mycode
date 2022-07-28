/*program to print series:
11
21
31
41
51
61
71
81
91
101
111
121
*/
class Series {
  public static void main(String[]args){
   
  for(int i=1;i<=121;i++){
    
   if(i==1){
   System.out.println(i);
   }
   else{
   i=i+10;
   System.out.println(i);
   }
  }
 } 
}