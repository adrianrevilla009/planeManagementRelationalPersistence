package masterCloudApps.web.planeManagement.domain;

public enum Position {
    COMMANDER(1, "COMMANDER"),
    COPILOT(2, "COPILOT"),
    CABIN(3, "CABIN");

    private int code;
    private String name;

    private Position(int code, String name) {
        this.code = code;
        this.name = name;
    }

}
