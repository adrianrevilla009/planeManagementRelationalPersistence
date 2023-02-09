package masterCloudApps.web.planeManagement.repository;

import masterCloudApps.web.planeManagement.domain.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
}
