package ladinProject.bookStore.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ladinProject.bookStore.entities.concretes.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

}
