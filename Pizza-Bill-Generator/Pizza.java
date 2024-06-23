public class Pizza {

    private int price;
    private boolean veg;

    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 150;
    private final int backPackPrice = 20;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedTakeAway = false;

    private int basePizzePrice;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzePrice = this.price;
    }

    public void getPizza() {
        System.out.println(this.price);
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedTakeAway = true;
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza " + basePizzePrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
        }
        if (isOptedTakeAway) {
            bill += "Take Away: " + backPackPrice + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }

}