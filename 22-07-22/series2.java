import java.util.*;
/* program to print series:
11
12
13
21
22
23
31
32
33
*/

class series2 {

public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("----enter no of lines----");

int n = sc.nextInt(); /*to take input from user
                         to print the series till number*/

for(int i=1; i<=n; i++){

for(int j=1; j<=n; j++){

System.out.println(+i+j);

   }
  }
  sc.close();    //closing of Scanner Object
 } 
}