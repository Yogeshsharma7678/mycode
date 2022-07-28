/*program to print reverse of right 
  angled triangle
****
***
**
* 

*/
import java.util.*;

class pattern2 {

public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("----enter no of lines----");

int n = sc.nextInt();

for(int i=n; i>=1; i--){

for(int j=1; j<=i; j++){

System.out.print("*");

   }
System.out.println();
  }

sc.close();
 } 
}