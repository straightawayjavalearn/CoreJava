package com.test.collectionframework;

import java.util.*;

class Book2 {
	int id;
	String name, author, publisher;
	int quantity;

	public Book2(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class MapExample {
public static void main(String[] args) {
//Creating map of Book2s
Map<Integer,Book2> map= new HashMap<Integer,Book2>();
//Creating Book2s
Book2 b1= new Book2( 101 , "Let us C" , "Yashwant Kanetkar" , "BPB" , 8 );
Book2 b2= new Book2( 102 , "Data Communications & Networking" , "Forouzan" , "Mc Graw Hill" , 4 );
Book2 b3= new Book2( 103 , "Operating System" , "Galvin" , "Wiley" , 6 );
//Adding Book2s to map
map.put( 1 ,b1);
map.put( 2 ,b2);
map.put( 3 ,b3);
//Traversing map
for (Map.Entry<Integer, Book2> entry:map.entrySet()){
int key=entry.getKey();
Book2 b=entry.getValue();
System.out.println(key+ " Details:" );
System.out.println(b.id+ " " +b.name+ " " +b.author+ " " +b.publisher+ " " +b.quantity);
}
}
}