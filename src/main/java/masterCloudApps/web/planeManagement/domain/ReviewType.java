package masterCloudApps.web.planeManagement.domain;

public enum ReviewType {
    PERIODIC(1, "PERIODIC"),
    REPAIR(2, "REPAIR");

    private int code;
    private String name;

    private ReviewType(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
