package com.book.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.app.entity.model.Book;
import com.book.app.entity.service.IBookService;

@RestController
@CrossOrigin(origins = "http://localhost:8100")
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@GetMapping("/book")
	public List<Book> getAll() {
		return bookService.getAll();
	}
	
	@GetMapping("/book/{idbook}")
	public Book get(@PathVariable(value = "idbook") long idbook) {
		return bookService.get(idbook);
	}
	
	@PostMapping("/book")
	public void post(Book book) {
		bookService.post(book);
	}
	
	
	@PutMapping("/book/{idbook}")
	public void put(Book book, @PathVariable(value = "idbook") long idbook) {
		bookService.put(book, idbook);
	}
	
	@DeleteMapping("/book/{idbook}")
	public void delete(@PathVariable(value = "idbook") long idbook) {
		bookService.delete(idbook);
	}

	
}
