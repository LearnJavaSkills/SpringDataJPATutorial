package in.learnjavaskills.springdataJPAtutorila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.learnjavaskills.springdataJPAtutorila.dto.Books;
import in.learnjavaskills.springdataJPAtutorila.service.BooksService;

@RestController
public class BooksController 
{
	@Autowired
	private BooksService bookService;
	
	@GetMapping(path = "getAllBooks")
	private List<Books> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@DeleteMapping(path = "deleteBookById/{id}")
	private void deleteBookById(@PathVariable Long id)
	{
		bookService.deleteBookByID(id);
	}
	
	@PostMapping(path = "addBook")
	private Books addBook(@RequestBody Books book)
	{
		return bookService.addBook(book);
	}
	
	@PutMapping(path = "updateBookById/{id}")
	private Books updateBookById(@PathVariable Long id, @RequestBody Books book)
	{
		return bookService.updateBookById(id, book);
	}
}
