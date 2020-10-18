package com.sj;

import java.util.Iterator;
import java.util.TreeSet;

public class Database {
TreeSet<Book> bookSet= new TreeSet<Book>();
public Database() {
	Book b1= new Book(1,"spacerace","leonardo",600);
	Book b2= new Book(2,"adventure","donald",200);
	Book b3= new Book(3,"homemaker","peter",800);
	Book b4= new Book(4,"spacerace","peer shah",900);
	
	
	bookSet.add(b1);
	bookSet.add(b2);
    bookSet.add(b3);
    bookSet.add(b4);
	
}
public void showDetails() {
	Iterator<Book>itr= bookSet.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
	
	public void viewByName(String name) {
		for(Book b:bookSet) {
			if(b.title.equals(name)) {
				System.out.println(b);
			}
		}
	}
public void insert(Book b)	{
	bookSet.add(b);
}
public void delete(int id2) {
	Iterator<Book>itr1= bookSet.iterator();
	if(id2==itr1.next().bookId) {
		itr1.remove();
	}else
	{
		System.out.println("Book not found");
	}
}
public void update(int id,double price) {
	TreeSet<Book> bookSet= new TreeSet<Book>();
	Iterator<Book>itr= bookSet.iterator();
	while(itr.hasNext()) {
		Book bTemp= itr.next();
		if(bTemp.bookId==id) {
			String title=bTemp.title;
			String author=bTemp.author;
			itr.remove();
			Book b=new Book(id,title,author,price);
			bookSet.add(b);
			System.out.println("Details updated sucessfully");
			
		}
	}
	}
}
	
