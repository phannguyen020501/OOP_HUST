package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName) == true) return;
		else {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		authors.remove(authorName);
	}
	
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title,category);
	}
	public Book(String title, String category,List<String> authors) {
		super(title,category);
		this.authors=authors;
	}
	public Book(int id) {
		super(id);
	}
 } 
