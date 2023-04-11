package ladinProject.bookStore.business.response;

import ladinProject.bookStore.entities.concretes.Author;
import ladinProject.bookStore.entities.concretes.BookCategory;
import ladinProject.bookStore.entities.concretes.Publisher;
import lombok.Data;

@Data
public class ListAllBooksByCustomerResponse {
	private String bookName;
	private Publisher publisher;
	private Author authorName;
	private BookCategory bookCategory;
	private int unitPrice;

}
