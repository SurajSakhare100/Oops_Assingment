//Problem Statement::

//Identify commonalities and differences between Publication, Book and Magazine classes. 
//Title, Price, Copies are common instance variables and saleCopy is common method.
//The differences are, Bookclass has author and orderCopies().
//Magazine Class has data members as orderQty, Current issue and method receiveNewissue().Write a program 
//to find how many copies of the given books are ordered and display total sale of publication.


// OUTPUT OF CODE
 
//************ welcome to store *************
//Enter title : RICH DAD POOR DAD
//Enter price:  300
//Enter copies: 500
//enter author book: A BC D
//*********** book data *************
//
//title of book: RICH DAD POOR DAD
//price of book: 300 RS
//copies of copies: 500 NOG
//Author name: A BC D
//
//*********** order copies *************
//order copies: 50
//total copies: 550
//
//*********** total sales *************
//total sale: 165000.0 RS


package book;
import java.util.*;
class publication {
	String title;
	int price;
	int copies;
      public void input() {
    	System.out.println("*********** welcome to store *************");
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter title : ");
    	title=sc.nextLine();
    	System.out.print("Enter price:  ");
    	price=sc.nextInt();
    	System.out.print("Enter copies: ");
    	copies=sc.nextInt();
    	}
	  public void display(){
		System.out.println("*********** book data *************");
		System.out.println("\ntitle of book: "+title);
		System.out.println("price of book: "+price+" RS");
		System.out.println("copies of copies: "+copies+" NOG");
	}	
}


class book extends publication {
	  String author;		 
	 void order() {		
		    System.out.println("\n*********** order copies *************");
			Scanner sc=new Scanner(System.in);
			System.out.print("order copies: ");
			int n=sc.nextInt();
			copies=copies+n;
			System.out.println("total copies: "+copies);
			}
	
	void  inp() {			
		Scanner sc=new Scanner(System.in);
		System.out.print("enter author book: ");
		author=sc.nextLine();
	}
	
	void display_book(){;
		display();
		System.out.println("Author name: "+author);
	}
	void sale_copy() {	
		System.out.println("\n*********** total sales *************");
		double sale=0;
		sale=price*copies;
		System.out.println("total sale: "+sale+" RS");
}
}

public class Book1 {
	public static void main(String[] args) {		
		book b=new book();
		b.input();
		b.inp();
		b.display_book();
		b.order();
		b.sale_copy();
	}}