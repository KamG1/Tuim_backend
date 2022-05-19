package back.demo.gasstations;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GasStationRepository extends JpaRepository<Gasstation, Long> {
}
