package back.demo.repositories;


import back.demo.classes.Gasstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GasStationRepository extends JpaRepository<Gasstation, Long> {
}
