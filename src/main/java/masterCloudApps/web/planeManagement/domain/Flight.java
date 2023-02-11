package masterCloudApps.web.planeManagement.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String code;
    private String company;
    @ManyToOne
    private Plane plane;
    @ManyToOne
    private Airport origin;
    @ManyToOne
    private Airport destination;
    private LocalDateTime departureTime;
    private Double flightHours;
    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(name = "flight_crew",
            joinColumns = @JoinColumn(name = "flight_id"),
            inverseJoinColumns = @JoinColumn(name = "crew_id") )
    private Set<Crew> crewSet;

    public Flight(String code, String company, Plane plane, Airport origin, Airport destination, LocalDateTime departureTime, Double flightHours) {
        this.code = code;
        this.company = company;
        this.plane = plane;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.flightHours = flightHours;
    }
}
