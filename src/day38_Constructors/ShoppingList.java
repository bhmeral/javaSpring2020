package day38_Constructors;

import org.omg.IOP.CodecPackage.InvalidTypeForEncoding;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        Item item1 = new Item("Tomatoes", 0.99, 12);
        System.out.println(item1.calcCost());
        System.out.println(item1);
        Item item2 = new Item("Potatoes", 1.3, 8);
        Item item3 = new Item("Milk", 4.99, 3);
        Item item4 = new Item("Cereal", 6.50, 1);
        Item item5 = new Item("Meat", 13, 2);


        ArrayList<Item> shoppingList = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5));

        double shoppingListCost = 0;
        for (Item eachItem : shoppingList) {
            shoppingListCost += eachItem.calcCost();
        }
        System.out.println(shoppingListCost + "$");

        double totalCost = 0;
        // solution 1

        for (int i = 0; i < shoppingList.size(); i++) {
            totalCost += shoppingList.get(i).calcCost();
        }
        System.out.println(totalCost + "$");
    }
}
