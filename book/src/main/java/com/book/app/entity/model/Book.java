package com.book.app.entity.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="book")
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private long idbook;
	
	
	public Book(long idbook, String title, String volume, String author, String genre,String photo) {
		super();
		this.idbook = idbook;
		
		this.title = title;
		this.volume = volume;
		this.author = author;
		this.genre = genre;
		this.photo = photo;
	}
	
	

	public Book() {
		super();
	}



	private String title;
	
	private String volume;
	
	private String author;
	
	private String genre;
	
	private String photo;

	public long getIdbook() {
		return idbook;
	}

	public void setIdbook(long idbook) {
		this.idbook = idbook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}



	public String getVolume() {
		return volume;
	}



	public void setVolume(String volume) {
		this.volume = volume;
	}


	
	
}