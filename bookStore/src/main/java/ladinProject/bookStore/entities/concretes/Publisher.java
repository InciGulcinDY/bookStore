package ladinProject.bookStore.entities.concretes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PublisherList")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int publisherId;

	private String publisherName;

	@OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
	private Set<Book> books;

}
