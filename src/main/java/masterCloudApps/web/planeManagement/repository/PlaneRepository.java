package masterCloudApps.web.planeManagement.repository;

import masterCloudApps.web.planeManagement.domain.Plane;
import masterCloudApps.web.planeManagement.domain.dto.IPlaneDto;
import masterCloudApps.web.planeManagement.domain.dto.PlaneDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
    @Query(value = "select p.plate as name, m.first_name as mechanicName, m.surname as mechanicSurname from plane p " +
            "inner join review r on r.plane_id = p.id " +
            "inner join mechanic m on r.mechanic_id = m.id", nativeQuery = true)
    List<IPlaneDto> findPlaneMechanicsProjectionInterface();

    @Query(value = "select p.* from plane p " +
            "inner join review r on r.plane_id = p.id " +
            "inner join mechanic m on r.mechanic_id = m.id", nativeQuery = true)
    List<Plane> findPlaneMechanics();


}
