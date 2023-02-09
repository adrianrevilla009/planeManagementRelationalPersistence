package masterCloudApps.web.planeManagement.repository;

import masterCloudApps.web.planeManagement.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
