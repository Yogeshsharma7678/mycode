/*program to illustrate Movietheatre managment System
  we can add books in this program
  by giving some details about bookName
*/

import java.util.*;

class movieTheatre {
  
  public static void main(String[]args)
   {
    //create a scanner object for taking details from user
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter name of movie.....");
    
        String MovieName = sc.next();      //to take book number from user
    
	System.out.println("Enter starting time of movie.....");
      
        float MovieStart = sc.nextFloat();
	
	System.out.println("Enter end time of movie.....");
      
        float MovieEnd = sc.nextFloat();    //to ask movie name from user

    System.out.println("Enter price of movie.....");

    int MoviePrice=sc.nextInt();     //to ask book price from user

    movie m1=new movie();   //creating object to call bookshell class

	m1.setMovie(MovieName,MovieStart,MovieEnd,MoviePrice);  //calling set method using b1

    m1.getMovie();	            //calling get method using b1
   
    sc.close();       //closing of scanner object
	
   }
}
    
   class movie
{
  /*Taking instance variable for details  
    so that we can easily use/call them in 
	any other class
	
   */
	
   String movieName;
   float movieStart;
   float movieEnd;
   int  moviePrice;
  
  public void setMovie(String mName, float mStart, float mEnd, int mPrice)        /*creating method & passing parameters to 
                                                                   input details  and add book*/
                                                                    
  {
  
   movieName=mName;
	
   movieStart=mStart;
   
   movieEnd=mEnd;
    
   moviePrice=mPrice;
  
  }
  public void getMovie()                                        //creating method to print details
  {
  
    System.out.println(movieName + " is the movie name " + " which starts at " + movieStart +"ends at " + movieEnd + " it's price is "+ moviePrice);
	
  } 
  
}
