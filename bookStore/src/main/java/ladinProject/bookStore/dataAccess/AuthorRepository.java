package ladinProject.bookStore.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import ladinProject.bookStore.entities.concretes.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
	

}
