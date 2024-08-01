public class Main {
    public static void main(String[] args) {

        Mobile myMobile = new Mobile(6, "Apple", "IOS");
        myMobile.takePicture();
        myMobile.recordVideo();
        myMobile.playGame();
        myMobile.takePicture();
        System.out.println(myMobile.getBatteryPercent());
        myMobile.charge();
        System.out.println(myMobile.getBatteryPercent());

    }
}