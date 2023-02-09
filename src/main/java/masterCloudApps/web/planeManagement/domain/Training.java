package masterCloudApps.web.planeManagement.domain;

public enum Training {
    DEGREE(1, "DEGREE"),
    FP(2, "FP"),
    DIPLOMA(3, "DIPLOMA");

    private int code;
    private String name;

    private Training(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
