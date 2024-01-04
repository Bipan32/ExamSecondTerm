package model;
import java.util.Arrays;

public class order {
    public String name;
    public String phoneNumber;
    public String[]itemCodes;
    public int[] itemPrices;
    public double price;

    public order(String name, String phoneNumber, String[] itemCodes, int[] itemPrices, double price) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.itemCodes = itemCodes;
        this.itemPrices = itemPrices;
        this.price = price;
    }

    public void describeOrder() {
        double vat = price * 0.13;
        double totalPrice = price + vat;
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Items: " + Arrays.toString(itemCodes));
        System.out.println("Price: " + price);
        System.out.println("VAT 13%: " + vat);
        System.out.println("Total Price: " + totalPrice);
    }
}
