package masterCloudApps.web.planeManagement.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Crew {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String code;
    private String firstName;
    private String lastName;
    private Position position;
    private String company;

    @ManyToMany(mappedBy = "crewSet")
    private Set<Flight> flightSet;

    public Crew(String code, String firstName, String lastName, Position position, String company) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.company = company;
    }
}
