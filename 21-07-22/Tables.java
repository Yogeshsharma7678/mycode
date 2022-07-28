import java.util.*;
/* program to print tables:
*/

class Tables {

public static void main(String[]args){
int mul=1;

Scanner sc= new Scanner(System.in);  

System.out.println("----enter no of table which you want to print----");

int n = sc.nextInt();  // to take input from user

for(int j=1; j<=10; j++){

mul=n*j;

System.out.println(n+"*"+j+"="+mul);

  }
 }
 sc.close(); //closing of the scanner object
 
}