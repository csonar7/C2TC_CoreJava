package com.client;

import com.entities.Book;
import com.service.BookService;
import com.service.BookServiceImpl;

public class Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bs  = new BookServiceImpl();
		Book b = new Book();
		b.setAuthor("chetan");
		b.setPrice(50.0);
		b.setTitle("java");
		bs.addBook(b);
		
		Book b1 = new Book();
		b1.setAuthor("chetan");
		b1.setPrice(50.0);
		b1.setTitle("java");
		bs.addBook(b1);
		
		Book b2 = new Book();
		b2.setAuthor("chetan");
		b2.setPrice(50.0);
		b2.setTitle("java");
		bs.addBook(b2);
		
		Book b3 = new Book();
		b3.setAuthor("chetan");
		b3.setPrice(50.0);
		b3.setTitle("java");
		bs.addBook(b3);
		
		
		System.out.println("Row Inserted");
		
		//Count Query
		System.out.println("Total Number of Books:" +bs.getBookCount());
		
		//Fetch Table Query
		for(Book book: bs.getAllBooks()) {
			System.out.println(book);
		}
		
		//Fetch Single Row query
	//	System.out.println("Book with Id 2 " + bs.getBookById(2));
		
		//Fetch  by author using setParameter
	/*	for(Book book1: bs.getAuthorBooks("Sonar")){
			System.out.println(book1);
		}
		
		for(Book book2: bs.getBookByTitle("PHP")){
			System.out.println(book2);
		}
		for(Book book3: bs.getBooksInPriceRange(10, 60)){
			System.out.println(book3);
		}*/
	}

}
