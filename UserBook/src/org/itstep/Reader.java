package org.itstep;

public class Reader extends User {
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void PrintInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Favorite book: " + this.book.getTitle());
		System.out.println("Author: " + this.book.getAuthor());
	}
}
