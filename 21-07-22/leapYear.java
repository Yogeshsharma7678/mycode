/* program to print leap year b/w 1947 to 2022*/

class leapYear {

public static void main(String[]args){

for(int i=1947; i<=2022; i++){

//formulae for finding a leap year is a%b==0

if(i % 4 == 0) {

System.out.println(i);

   }
 } 
}
}