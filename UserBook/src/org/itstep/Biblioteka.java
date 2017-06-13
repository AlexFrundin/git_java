package org.itstep;

import java.util.ArrayList;


public class Biblioteka {

	public static void main(String[] args) {
		// create library
		ArrayList<Book> library = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			library.add(new Book());
		}
		// filling thelibrary
		library.get(0).setAuthor("Schopenhauer");
		library.get(0).setTitle("The Vanity of Existence");
		library.get(1).setAuthor("Bernard Werber");
		library.get(1).setTitle("Empire of angels");
		library.get(2).setAuthor("Frederic Beigbeder");
		library.get(2).setTitle("99 Francs");
		library.get(3).setAuthor("Mark Lutz");
		library.get(3).setTitle("Learning Python");
		library.get(4).setAuthor("Bulgakov");
		library.get(4).setTitle("The Master and Margarita");
		// create list of Readers
		ArrayList<Reader> listOfReader = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			listOfReader.add(new Reader());
		}
		listOfReader.get(0).setName("Anna");
		listOfReader.get(0).setAge(18);
		listOfReader.get(0).setBook(library.get(0));
		listOfReader.get(1).setName("Lev");
		listOfReader.get(1).setAge(28);
		listOfReader.get(1).setBook(library.get(1));
		listOfReader.get(2).setName("Alex");
		listOfReader.get(2).setAge(21);
		listOfReader.get(2).setBook(library.get(2));
		listOfReader.get(3).setName("Dima");
		listOfReader.get(3).setAge(18);
		listOfReader.get(3).setBook(library.get(3));
		listOfReader.get(4).setName("Maria");
		listOfReader.get(4).setAge(23);
		listOfReader.get(4).setBook(library.get(4));
		// print info
		for (Reader reader : listOfReader) {
			reader.PrintInfo();
		}

	}

}
