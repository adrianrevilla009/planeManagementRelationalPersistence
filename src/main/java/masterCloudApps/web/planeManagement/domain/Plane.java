package masterCloudApps.web.planeManagement.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String plate;
    private String manufacturer;
    private String model;
    private Double flightHours;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="plane")
    private Set<Flight> flightSet;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="plane")
    private Set<Review> reviewSet;

    public Plane(String plate, String manufacturer, String model, Double flightHours) {
        this.plate = plate;
        this.manufacturer = manufacturer;
        this.model = model;
        this.flightHours = flightHours;
    }
}
