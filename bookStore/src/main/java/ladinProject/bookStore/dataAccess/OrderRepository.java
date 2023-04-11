package ladinProject.bookStore.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<ladinProject.bookStore.entities.concretes.Order, Integer> {

}
