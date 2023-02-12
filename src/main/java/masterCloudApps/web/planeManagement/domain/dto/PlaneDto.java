package masterCloudApps.web.planeManagement.domain.dto;

import java.util.Set;

public class PlaneDto {
    private String name;
    private String mechanicName;
    private String mechanicSurname;

    public PlaneDto() {
    }

    public PlaneDto(String name, String mechanicName, String mechanicSurname) {
        this.name = name;
        this.mechanicName = mechanicName;
        this.mechanicSurname = mechanicSurname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public String getMechanicSurname() {
        return mechanicSurname;
    }

    public void setMechanicSurname(String mechanicSurname) {
        this.mechanicSurname = mechanicSurname;
    }
}
