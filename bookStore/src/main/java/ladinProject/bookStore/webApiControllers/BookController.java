package ladinProject.bookStore.webApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ladinProject.bookStore.business.abstracts.BookService;
import ladinProject.bookStore.business.response.ListAllBooksByCustomerResponse;

@RestController
@RequestMapping("/api/book")
public class BookController {
	
	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@GetMapping("/listallbooksbycustomer")
	public List<ListAllBooksByCustomerResponse> listAllBooksByCustomerResponses(){
		return bookService.listAllBooksByCustomerResponses();
	}

}
