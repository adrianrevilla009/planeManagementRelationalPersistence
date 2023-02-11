package masterCloudApps.web.planeManagement.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Plane plane;
    private Date startDate;
    private Date endDate;
    private Double workHours;
    @ManyToOne
    private Mechanic mechanic;
    private ReviewType reviewType;
    private String description;
    @ManyToOne
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
