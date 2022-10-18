package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Vector;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.entities.Book;



public class BookDAOImpl implements BookDAO {
	
	private EntityManager em;
	
	public BookDAOImpl() {
		em = JUtil.getEntityManager();
	}

	
	public Book getBookById(int id) {
		
		Book book = em.find(Book.class, id);
		return book;
	}

	
	public List<Book> getBookByTitle(String title) {
		
		String s = "Select book from Book book where book.title LIKE :ptitle";
		TypedQuery<Book> query = em.createQuery(s, Book.class);
		query.setParameter("ptitle","%"+ title+ "%");
		return query.getResultList();
	}

	
	public Long getBookCount() {
		
		String s = "Select COUNT(book.id) from Book book";
		TypedQuery<Long> query = em.createQuery(s,Long.class); 
		Long count = query.getSingleResult();
		return count;
	}
	
	
	public List<Book> getAuthorBooks(String author) {
		
		String s = "Select book from Book book where book.author = :pAuthor";
		TypedQuery<Book> query = em.createQuery(s, Book.class);
		query.setParameter("pAuthor", author);
		List<Book> b =query.getResultList();
		return b;
	}

	
	public List<Book> getAllBooks() {
		
		Query query = em.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	
	public List<Book> getBooksInPriceRange(double low, double high) {
		
		String s = "Select book from Book book  where book.price between :low and :high";
		TypedQuery<Book> query = em.createQuery(s, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		Stream <Book> ss=bookList.stream();
		OptionalDouble od=bookList.stream().filter((b) -> b.getPrice()<50).mapToDouble(Book::getPrice).average();
		System.out.println("average"+od);
		//bookList.contains(od);
		return bookList;
	}


	@Override
	public void commitTranscation() {
		
		em.getTransaction().commit();
	}


	@Override
	public void beginTranscation() {
		
		em.getTransaction().begin();
	}


	@Override
	public void addBook(Book book) {
		
		em.persist(book);
	}

}
