package com.sj;

import java.util.Scanner;

public class AdminUser {
public static void main(String[] args) {
	int choice;
	Scanner sc= new Scanner(System.in);
	Database db=new Database();
	char cr;
	do {
		System.out.println("Press 1 to view all books");
		System.out.println("Press 2 to search book by title");
		System.out.println("Press 3 to insert a book");
		System.out.println("Press 4 to delete the book");
		System.out.println("Press 5 to update the book");
		System.out.println("Press 6 to exit");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			db.showDetails();
			break;
			
		case 2:
			System.out.println("Enter the title of the book");
			String name=sc.next();
			db.viewByName(name);
			break;
			
		case 3:
			System.out.println("Enter the book id");
			int id1=sc.nextInt();
			System.out.println("Enter the book name");
			String name1=sc.next();
			System.out.println("Enter the book id");
			String author=sc.next();
			System.out.println("Enter the book price");
			double price= sc.nextDouble();
			Book ib= new Book(id1,name1,author,price);
			System.out.println("Book added successfully");
			break;
			
		case 4:
			System.out.println("Enter the id of the book you want to delete ");
			int id2=sc.nextInt();
			db.delete(id2);
			System.out.println("Book deleted successfully");
			break;
			
		case 5:
			System.out.println("enter the id of the book you want to update");
			int id3=sc.nextInt();
			System.out.println("Enter the new price");
			int price1= sc.nextInt();
			db.update(id3, price1);
			System.out.println("Updated successfully");
			
		case 6:
			default: System.out.println("Thank you,visit again");
			break;
		}
			System.out.println("press y for main menu");
			cr=sc.next().charAt(0);
		}while(cr== 'Y'||cr == 'y');

	}
	
	
}


	


