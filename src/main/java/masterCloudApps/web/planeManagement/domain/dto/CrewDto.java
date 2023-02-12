package masterCloudApps.web.planeManagement.domain.dto;

public class CrewDto {
    private String name;
    private String surname;
    private String city;
    private Integer numberFlights;
    private Integer sumFlightTime;

    public CrewDto() {
    }

    public CrewDto(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public CrewDto(String name, String surname, Integer numberFlights, Integer sumFlightTime) {
        this.name = name;
        this.surname = surname;
        this.numberFlights = numberFlights;
        this.sumFlightTime = sumFlightTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNumberFlights() {
        return numberFlights;
    }

    public void setNumberFlights(Integer numberFlights) {
        this.numberFlights = numberFlights;
    }

    public Integer getSumFlightTime() {
        return sumFlightTime;
    }

    public void setSumFlightTime(Integer sumFlightTime) {
        this.sumFlightTime = sumFlightTime;
    }

    @Override
    public String toString() {
        return "CrewDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", numberFlights=" + numberFlights +
                ", sumFlightTime=" + sumFlightTime +
                '}';
    }
}
