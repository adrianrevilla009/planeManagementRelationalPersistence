package masterCloudApps.web.planeManagement.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String code;
    private String firstName;
    private String surname;
    private String company;
    private int jobStartYear;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="mechanic")
    private Set<Review> reviewSet;

    public Mechanic(String code, String firstName, String surname, String company, int jobStartYear) {
        this.code = code;
        this.firstName = firstName;
        this.surname = surname;
        this.company = company;
        this.jobStartYear = jobStartYear;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                ", jobStartYear=" + jobStartYear +
                '}';
    }
}
