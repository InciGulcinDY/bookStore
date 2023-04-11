package ladinProject.bookStore.entities.concretes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ladinProject.bookStore.entities.abstracts.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Author_List")

@AllArgsConstructor
@NoArgsConstructor

public class Author extends Person{
	@Id
	@SequenceGenerator(name = "author_id_generator", sequenceName = "author_id_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_generator")
	@Getter
	private int authorId;

	@Setter
	@Getter
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private Set<Book> books;

	// Constructor
	public Author(String firstname, String lastname, int authorId, Set<Book> books) {
		super(firstname, lastname);
		this.authorId = authorId;
		this.books = books;
	}


	
	

}
