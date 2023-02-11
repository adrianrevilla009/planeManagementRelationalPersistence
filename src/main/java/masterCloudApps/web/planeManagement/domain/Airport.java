package masterCloudApps.web.planeManagement.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String iataCode;
    private String name;
    private String city;
    private String country;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="origin")
    private Set<Flight> originFlightSet;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="destination")
    private Set<Flight> destinationFlightSet;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="airport")
    private Set<Review> reviewSet;

    public Airport(String iataCode, String name, String city, String country) {
        this.iataCode = iataCode;
        this.name = name;
        this.city = city;
        this.country = country;
    }
}
