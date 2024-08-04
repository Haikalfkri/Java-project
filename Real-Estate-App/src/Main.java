public class Main {
    public static void main(String[] args) {

        Flat myFlat = new Flat(1000, 1850, 9, 2);
        System.out.println("Price of flat in Rp." + myFlat.getFlatPrice());
        myFlat.printAllValues();
    }
}