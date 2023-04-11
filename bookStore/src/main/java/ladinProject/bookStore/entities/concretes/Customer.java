package ladinProject.bookStore.entities.concretes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ladinProject.bookStore.entities.abstracts.Person;

@Entity
@Table(name = "CustomerList")

public class Customer extends Person{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	private String email;

	private String phoneNumber;

	private String nationalId;

	private int password;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Order> orders;
}
