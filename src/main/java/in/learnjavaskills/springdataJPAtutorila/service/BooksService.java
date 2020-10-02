package in.learnjavaskills.springdataJPAtutorila.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.learnjavaskills.springdataJPAtutorila.dto.Books;

@Service
public interface BooksService 
{
	public List<Books> getAllBooks();
	public Books addBook(Books Book);
	public void deleteBookByID(Long id);
	public Books updateBookById(Long id, Books book);
}
