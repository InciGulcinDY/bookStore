package ladinProject.bookStore.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ladinProject.bookStore.entities.concretes.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	

}
