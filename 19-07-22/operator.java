/* Use of conditional Operator */
class Conditional {
    
     public static void main(String args[]){
        
     byte a=10, b=13, c=9, d=15;
     
     byte X=(a>b)?(a>c?a:c):(b>c?b:c);
      
     byte Y=(a>b && b>c)?(b>d?b:d):(a>c?a:c):(c>d?c:d);//compare using conditional operator
     
     System.out.println(X);
   }
}