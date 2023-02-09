package masterCloudApps.web.planeManagement.repository;

import masterCloudApps.web.planeManagement.domain.Crew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrewRepository extends JpaRepository<Crew, Long> {
}
