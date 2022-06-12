package back.demo.repositories;


import back.demo.classes.Tankrecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TankRepository extends JpaRepository<Tankrecords, Long> {
}
