package session1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		
		
//		List<Integer> list = new ArrayList<>(Arrays.asList(5,7,1,-78));
//		
//		Collections.sort(list);
//		
//		System.out.println(list);
//		
//		
//		List<Book> booksList = new ArrayList<>(Arrays.asList( new Book(13,  "Java"), new Book(54,  "Clean Code")));
//		Collections.sort(booksList);
			
	}
}


class Book implements Comparable<Book>{
	private int price;
	private String title;
	public Book(int price, String title) {
		super();
		this.price = price;
		this.title = title;
	}
	@Override
	public int compareTo(Book o) {
		if (this.price > o.price) {
			return -1;
		}else {
			return 1;
		}
	}
	
}