package ladinProject.bookStore.entities.concretes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "book_category_list")

@Data
public class BookCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String categoryName;
	
	@OneToMany(mappedBy = "bookCategory" , cascade = CascadeType.ALL)
	private Set<Book> books;

}
