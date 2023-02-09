package masterCloudApps.web.planeManagement.repository;

import masterCloudApps.web.planeManagement.domain.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Long> {
}
