package masterCloudApps.web.planeManagement.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Plane plane;
    private Date startDate;
    private Date endDate;
    private Double workHours;
    @ManyToOne(cascade = CascadeType.ALL)
    private Mechanic mechanic;
    private ReviewType reviewType;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    private Airport airport;

    public Review(Plane plane, Date startDate, Date endDate, Double workHours, Mechanic mechanic, ReviewType reviewType, String description, Airport airport) {
        this.plane = plane;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workHours = workHours;
        this.mechanic = mechanic;
        this.reviewType = reviewType;
        this.description = description;
        this.airport = airport;
    }
}
