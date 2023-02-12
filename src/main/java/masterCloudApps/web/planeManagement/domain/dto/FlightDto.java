package masterCloudApps.web.planeManagement.domain.dto;

import java.time.LocalDateTime;

public class FlightDto {
    private String code;
    private String company;
    // private Plane planeCode;
    private String originAirport;
    private String destinationAirport;
    private LocalDateTime departureTime;
    private Double flightHours;

    public FlightDto() {
    }

    public FlightDto(String code, String company, String originAirport, String destinationAirport, LocalDateTime departureTime, Double flightHours) {
        this.code = code;
        this.company = company;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.flightHours = flightHours;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Double getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(Double flightHours) {
        this.flightHours = flightHours;
    }

    @Override
    public String toString() {
        return "FlightDto{" +
                "code='" + code + '\'' +
                ", company='" + company + '\'' +
                ", originAirport='" + originAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", departureTime=" + departureTime +
                ", flightHours=" + flightHours +
                '}';
    }
}
