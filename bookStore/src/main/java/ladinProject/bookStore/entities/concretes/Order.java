package ladinProject.bookStore.entities.concretes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "OrderList")

public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_key")
	private Customer customer;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "book_order_list", joinColumns = {
			@JoinColumn(referencedColumnName = "orderId") }, inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "bookId") })
	private Set<Book> books;

	private int totalCost;

}
