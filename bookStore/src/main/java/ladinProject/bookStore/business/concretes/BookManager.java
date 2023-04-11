package ladinProject.bookStore.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ladinProject.bookStore.business.abstracts.BookService;
import ladinProject.bookStore.business.response.ListAllBooksByCustomerResponse;
import ladinProject.bookStore.dataAccess.AuthorRepository;
import ladinProject.bookStore.dataAccess.BookRepository;
import ladinProject.bookStore.dataAccess.PublisherRepository;
import ladinProject.bookStore.entities.concretes.Author;
import ladinProject.bookStore.entities.concretes.Book;
import ladinProject.bookStore.entities.concretes.Publisher;

@Service
public class BookManager implements BookService{
	
	private BookRepository bookRepository;
	
	private AuthorRepository authorRepository;
	private PublisherRepository publisherRepository;
	

	@Autowired
	public BookManager(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@Override
	public List<ListAllBooksByCustomerResponse> listAllBooksByCustomerResponses() {
		// Business Rules:
		List<Book> books = bookRepository.findAll();
		ArrayList<ListAllBooksByCustomerResponse> listAllBooksByCustomerResponses = new ArrayList<ListAllBooksByCustomerResponse>();
		
		for (Book book : books) {
			ListAllBooksByCustomerResponse responseItem = new ListAllBooksByCustomerResponse();

			responseItem.setBookName(book.getBookName());
			responseItem.setUnitPrice(book.getUnitPrice());
			
			Optional<Author> author = Optional.of(new Author());
			int i=book.getBookId();
			author = authorRepository.findById(i);
			//responseItem.setAuthorName(0);
			
			//responseItem.setBookCategory(book.getBookCategory());
			
			
			
			listAllBooksByCustomerResponses.add(responseItem);
		}
		
		return listAllBooksByCustomerResponses;
	}



}
