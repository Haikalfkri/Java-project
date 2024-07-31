public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currenDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currenDirection = 0;
    }

    public void steer(int direction) {
        this.currenDirection += direction;
        System.out.println("Steer method called: Steering at " + currenDirection + " degrees.");
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currenDirection = direction;
        System.out.println("Move method called: Moving at: " + currentSpeed + " in direction " + currenDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrenDirection() {
        return currenDirection;
    }

    public void setCurrenDirection(int currenDirection) {
        this.currenDirection = currenDirection;
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("Vehicle is stopped");
    }
}
