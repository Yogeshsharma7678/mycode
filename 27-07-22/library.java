/*program to illustrate Library managment System
  we can add books in this program
  by giving some details about bookName
*/

import java.util.*;

class library 
{
  
  public static void main(String[]args)
   {
    //create a scanner object for taking details from user
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter number of Book.....");
    
    int BookNum = sc.nextInt();      //to take book number from user
    
    System.out.println("Enter name of Book.....");
      
    String BookName = sc.next();    //to ask book name from user

    System.out.println("Enter price of Book.....");

    int BookPrice=sc.nextInt();     //to ask book price from user

    bookShell b1=new bookShell();   //creating object to call bookshell class

	b1.setBook(BookNum,BookName,BookPrice);  //calling set method using b1

    b1.getBook();	            //calling get method using b1
   
    sc.close();       //closing of scanner object
	
   }
}
    
   class bookShell
{
  /*Taking instance variable for details  
    so that we can easily use/call them in 
	any other class
	
   */
	
   int bookNum;
   int bookPrice;
   String bookName;
  
  public void setBook(int bnum,String bname,int bprice)        /*creating method & passing parameters to 
                                                                   input details  and add book*/
                                                                    
  {
  
   bookNum=bnum;
    
	
   bookName=bname;
    
   bookPrice=bprice;
  
  }
  public void getBook()                                        //creating method to print details
  {
  
    System.out.println(bookNum+" is the bookNumber of " + bookName +" it's price is "+bookPrice);
	
  } 
  
}
