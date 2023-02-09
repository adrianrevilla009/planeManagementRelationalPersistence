package masterCloudApps.web.planeManagement.repository;

import masterCloudApps.web.planeManagement.domain.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
}
