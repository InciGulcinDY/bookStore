package ladinProject.bookStore.entities.concretes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BookList")

@Data
@NoArgsConstructor

public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;

	private String bookName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publisher_key")
	private Publisher publisher;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_key")
	private Author author;

	private int unitPrice;

	@ManyToMany(mappedBy = "books", cascade = CascadeType.ALL)
	private Set<Order> orders;

	@ManyToOne(targetEntity = BookCategory.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "bookCategory_key")
	private BookCategory bookCategory;

	// Constructor
	public Book(int bookId, String bookName, Publisher publisher, Author author, int unitPrice, Set<Order> orders,
			BookCategory bookCategory) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.publisher = publisher;
		this.author = author;
		this.unitPrice = unitPrice;
		this.orders = orders;
		this.bookCategory = bookCategory;
	}



}
