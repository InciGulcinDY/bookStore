package ladinProject.bookStore.business.abstracts;

import java.util.List;

import ladinProject.bookStore.business.response.ListAllBooksByCustomerResponse;

public interface BookService {
	
	public List<ListAllBooksByCustomerResponse> listAllBooksByCustomerResponses();

}
