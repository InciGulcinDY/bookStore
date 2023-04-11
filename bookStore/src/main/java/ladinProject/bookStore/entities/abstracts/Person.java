package ladinProject.bookStore.entities.abstracts;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {

	private String firstname;
	private String lastname;
	
	
	
}
