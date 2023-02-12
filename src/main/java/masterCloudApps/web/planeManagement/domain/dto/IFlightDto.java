package masterCloudApps.web.planeManagement.domain.dto;

import java.time.LocalDateTime;

public interface IFlightDto {
    String getCompany();
    String getOriginAirport();
    String getDestinationAirport();
    LocalDateTime getDepartureTime();
    Double getFlightHours();
}
