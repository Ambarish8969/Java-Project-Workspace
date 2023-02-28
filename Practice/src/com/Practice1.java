package com;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparator<Book>{
	
	private String name;
	private int id;
	private Integer year;
	
	public Book(String name, int id, int year) {
		super();
		this.name = name;
		this.id = id;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", year=" + year + "]";
	}

	@Override
	public int compare(Book b1,Book b2) {
		return b1.year.compareTo(b2.year);
	}
	
}

public class Practice1{
	
	public static void main(String[] args) {
		Book b1=new Book("a",1,2000);
		Book b2=new Book("c",3,2003);
		Book b3=new Book("b",2,2001);
		
		Set<Book> s1=new TreeSet<Book>(b1);
		s1.add(b1);
		s1.add(b2);
		s1.add(b3);
		
//		ArrayList<Book> list=new ArrayList<Book>();
//		list.add(b1);
//		list.add(b2);
//		list.add(b3);
		
		for(Book l:s1) {
			System.out.println(l);
		}
	}
}
