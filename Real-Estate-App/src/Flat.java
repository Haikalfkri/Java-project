public class Flat {
    private int squareFeet;
    private int pricePerSquareFeet;
    private int floorNumber;
    private int numberOfRooms;

    public Flat(int _squareFeet, int _pricePerSquareFeet, int _floorNumber, int _numberOfRooms) {
        squareFeet = _squareFeet;
        pricePerSquareFeet = _pricePerSquareFeet;
        floorNumber = _floorNumber;
        numberOfRooms = _numberOfRooms;
    }

    public int getFlatPrice() {
        return squareFeet * pricePerSquareFeet;
    }

    public void printAllValues() {
        System.out.println("Square feet : " + squareFeet);
        System.out.println("Price per square feet : " + pricePerSquareFeet);
        System.out.println("Floor number : " + floorNumber);
        System.out.println("Number of Rooms : " + numberOfRooms);
    }
}
