package masterCloudApps.web.planeManagement.data;

import masterCloudApps.web.planeManagement.domain.*;
import masterCloudApps.web.planeManagement.repository.AirportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public void run(String... args) {
        /** entities **/
        Airport airport1 = new Airport("MAD", "Airport 1 Madrid", "Madrid", "Spain");
        Airport airport2 = new Airport("BAR", "Airport 1 Barcelona", "Barcelona", "Spain");
        Airport airport3 = new Airport("SERV", "Airport 1 Sevilla", "Sevilla", "Spain");

        Plane plane1 = new Plane("1111111A", "Manufacturer 1", "Model 1", 40.0);
        Plane plane2 = new Plane("2222222A", "Manufacturer 2", "Model 2", 80.5);
        Plane plane3 = new Plane("3333333A", "Manufacturer 3", "Model 1", 2000.0);

        Crew crew1 = new Crew("EMP1", "Adrian", "Perez", Position.CABIN, "Iberia");
        Crew crew2 = new Crew("EMP2", "Juan", "Garcia", Position.CABIN, "Ryanair");
        Crew crew3 = new Crew("EMP3", "Pedro", "Rodriguez", Position.COPILOT, "Iberia");
        Crew crew4 = new Crew("EMP4", "Pepe", "Viyuela", Position.COMMANDER, "Ryanair");

        Flight flight1 = new Flight("FLI1", "Iberia", plane1, airport1, airport2,
                LocalDateTime.of(2023, Month.JANUARY, 12, 12, 0, 0), 2.5);
        Flight flight2 = new Flight("FLI2", "Ryanair", plane3, airport1, airport3,
                LocalDateTime.of(2023, Month.FEBRUARY, 21, 16, 40, 0), 4.0);

        Mechanic mechanic1 = new Mechanic("MEC1", "Iosu", "Rodriguez", "Iberia", 2015);
        Mechanic mechanic2 = new Mechanic("MEC2", "Juan", "Jimenez", "Ryanair", 2020);

        Review review1 = new Review(plane1, new Date(2023, 1, 12), new Date(2023, 1, 12),
                4.2, mechanic1, ReviewType.REPAIR, "Review repair 1", airport1);
        Review review2 = new Review(plane2, new Date(2023, 1, 23), new Date(2023, 1, 24),
                17.4, mechanic2, ReviewType.PERIODIC, "Review periodic 1", airport2);
        Review review3 = new Review(plane3, new Date(2023, 1, 6), new Date(2023, 1, 9),
                4.2, mechanic1, ReviewType.REPAIR, "Review repair 2", airport3);

        /** relations **/
        airport1.setOriginFlightSet(new HashSet<>(Arrays.asList(flight1, flight2)));
        airport2.setDestinationFlightSet(new HashSet<>(Arrays.asList(flight1)));
        airport3.setDestinationFlightSet(new HashSet<>(Arrays.asList(flight2)));
        airport1.setReviewSet(new HashSet<>(Arrays.asList(review1)));
        airport2.setReviewSet(new HashSet<>(Arrays.asList(review2)));
        airport3.setReviewSet(new HashSet<>(Arrays.asList(review3)));

        /*crew1.setFlightSet(new HashSet<>(Arrays.asList(flight1, flight2)));
        crew2.setFlightSet(new HashSet<>(Arrays.asList(flight1)));
        crew3.setFlightSet(new HashSet<>(Arrays.asList(flight2)));
        crew1.setFlightSet(new HashSet<>(Arrays.asList(flight1, flight2)));*/

        /*plane1.setFlightSet(new HashSet<>(Arrays.asList(flight1)));
        plane3.setFlightSet(new HashSet<>(Arrays.asList(flight2)));
        plane1.setReviewSet(new HashSet<>(Arrays.asList(review1)));
        plane2.setReviewSet(new HashSet<>(Arrays.asList(review2)));
        plane3.setReviewSet(new HashSet<>(Arrays.asList(review3)));*/

        /*flight1.setCrewSet(new HashSet<>(Arrays.asList(crew1, crew2, crew4)));
        flight2.setCrewSet(new HashSet<>(Arrays.asList(crew1, crew3, crew4)));*/

        /*mechanic1.setReviewSet(new HashSet<>(Arrays.asList(review1, review3)));
        mechanic2.setReviewSet(new HashSet<>(Arrays.asList(review2)));*/

        /** logs **/
        /*log.debug(airport1.toString());
        log.debug(airport2.toString());
        log.debug(airport3.toString());

        log.debug(plane1.toString());
        log.debug(plane2.toString());
        log.debug(plane3.toString());

        log.debug(crew1.toString());
        log.debug(crew2.toString());
        log.debug(crew3.toString());
        log.debug(crew4.toString());

        log.debug(flight1.toString());
        log.debug(flight1.toString());

        log.debug(mechanic1.toString());
        log.debug(mechanic1.toString());

        log.debug(review1.toString());
        log.debug(review2.toString());
        log.debug(review3.toString());*/

        /** operations **/
        /*this.airportRepository.save(airport1);
        this.airportRepository.save(airport2);
        this.airportRepository.save(airport3);*/
    }

}
