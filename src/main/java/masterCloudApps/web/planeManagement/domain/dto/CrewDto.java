package masterCloudApps.web.planeManagement.domain.dto;

public class CrewDto {
    private String name;
    private String surname;
    private String city;

    public CrewDto() {
    }

    public CrewDto(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
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
}
