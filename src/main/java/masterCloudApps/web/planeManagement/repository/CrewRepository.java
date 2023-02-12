package masterCloudApps.web.planeManagement.repository;

import masterCloudApps.web.planeManagement.domain.Crew;
import masterCloudApps.web.planeManagement.domain.Flight;
import masterCloudApps.web.planeManagement.domain.dto.ICrewDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrewRepository extends JpaRepository<Crew, Long> {

    @Query(value = "select c.first_name as name, c.last_name as surname, a.city as city from crew c " +
            "inner join flight_crew fc on fc.crew_id = c.id " +
            "inner join flight f on fc.flight_id = f.id " +
            "inner join airport a on f.origin_id = a.id " +
            "where c.code = :code", nativeQuery = true)
    List<ICrewDto> findCrewOriginCitiesInterfaceProjection(@Param("code") String code);

    @Query(value = "select c.* from crew c " +
            "inner join flight_crew fc on fc.crew_id = c.id " +
            "inner join flight f on fc.flight_id = f.id " +
            "inner join airport a on f.origin_id = a.id " +
            "where c.code = :code", nativeQuery = true)
    List<Crew> findCrewOriginCities(@Param("code") String code);

}
