public class Mobile {
    private int screenSize;
    private String companyName;
    private String operationSystem;
    private int batteryPercent;

    public Mobile(int _screenSize, String _companyName, String _operationSystem) {
        screenSize = _screenSize;
        companyName = _companyName;
        operationSystem = _operationSystem;
        batteryPercent = 100;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getBatteryPercent() {
        return batteryPercent;
    }

    public void takePicture() {
        if (batteryPercent <= 0) {
            System.out.println("Cannot take picture. Battery is not sufficient");
        } else {
            System.out.println("Picture is taken");
            batteryPercent -= 10;
        }
    }

    public void recordVideo() {
        if (batteryPercent < 30) {
            System.out.println("Cannot record video. Battery is not sufficient");
        } else {
            System.out.println("Video is recorded");
            batteryPercent -= 30;
        }
    }

    public void playGame() {
        if (batteryPercent < 60) {
            System.out.println("Cannot play game. Battery is not sufficient");
        } else {
            System.out.println("Playing video game");
            batteryPercent -= 60;
        }
    }

    public void charge() {
        batteryPercent = 100;
        System.out.println("Battery is charge 100%");
    }
}
