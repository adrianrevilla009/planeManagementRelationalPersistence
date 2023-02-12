package masterCloudApps.web.planeManagement.repository;

import masterCloudApps.web.planeManagement.domain.Flight;
import masterCloudApps.web.planeManagement.domain.dto.IFlightDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query(value = "select f.code as code, f.company as company, a.name as originAirport, a2.name as destinationAirport, " +
            "f.departure_time as departureTime, f.flight_hours as flightHours from flight f " +
            "inner join airport a on f.origin_id = a.id " +
            "inner join airport a2 on f.destination_id = a2.id " +
            "where a.name = :cityName and f.departure_time = :departureTime " +
            "order by f.departure_time asc", nativeQuery = true)
    List<IFlightDto> findFlightByOriginAndDateProjectionInterface(@Param("cityName") String cityName,
                                                                  @Param("departureTime") LocalDateTime departureTime);
    @Query(value = "select f.* from flight f " +
            "inner join airport a on f.origin_id = a.id " +
            "where a.name = :cityName and f.departure_time = :departureTime " +
            "order by f.departure_time asc", nativeQuery = true)
    List<Flight> findFlightByOriginAndDate(@Param("cityName") String cityName, @Param("departureTime") LocalDateTime departureTime);
}
