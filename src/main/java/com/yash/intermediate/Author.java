package com.yash.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Author {
	
	public static List createBook() {
	
	List<Book> list= new ArrayList<Book>();  
      
    Book b1=new Book("Let us C",430.7,"Yashwant","BVP");  
    Book b2=new Book("Java",400.7,"BPB","MGH");  
    Book b3=new Book("Operating System",700.7,"BVP","MGH");  
    list.add(b1);
    list.add(b2);
    list.add(b3);
    
   return list;
}
	 public  int totalbookswrittenByAuthor(String author) {
	    	
	    int count =0;	
		 List<Book> books = createBook();
	    	if(books.size()>0) {
	    		for(Book book :books) {
	    			if(book.getAuthor()==author)
	    				count++;
	    		}
	    		return count;
	    	}
	    	else 
	    	return	count;
	    }
	
}

