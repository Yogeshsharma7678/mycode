/*program to print a pattern like:

*
**
***
****
*****

*/
import java.util.*;

class pattern {

public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("----enter no of lines----");

int n = sc.nextInt();

for(int i=1; i<=n; i++){

for(int j=1; j<=i; j++){

System.out.print("*");

   }
System.out.println();   /*for next line after 
                          completing the inner loop */
  }
sc.close();   //for close the scanner object
 } 
}