package in.learnjavaskills.springdataJPAtutorila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.learnjavaskills.springdataJPAtutorila.dao.BooksRepository;
import in.learnjavaskills.springdataJPAtutorila.dto.Books;

@Service
public class BooksServiceImpl implements BooksService 
{
	@Autowired
	private BooksRepository bookRepository;
	
	@Override
	public List<Books> getAllBooks()
	{
		return bookRepository.findAll();
	}

	@Override
	public Books addBook(Books book) 
	{
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookByID(Long id)
	{
		bookRepository.deleteById(id);
	}

	@Override
	public Books updateBookById(Long id, Books book)
	{
		book.setId(id);
		return bookRepository.save(book);
	}
}
