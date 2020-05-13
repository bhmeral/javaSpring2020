package day38_Constructors;

public class Item {

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost() {
        return quantity * unitPrice;
    }

    public String toString() {
        return "Name: " + name + " UnitPrice: " + unitPrice + " Quantity: " + quantity
                + " Total Cost Of Item: $" + calcCost();
    }

}
