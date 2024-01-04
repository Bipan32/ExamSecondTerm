package model;

import java.util.Arrays;

public class T_shirt {
    public String name;
    public String productCode;
    public double price;
    public String brand;
    public String description;
    public String[] availableSizes;

    public T_shirt(String name, String productCode, double price, String brand, String description, String[] availableSizes) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.availableSizes = availableSizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }

    public String describeTShirt() {
        return "Name: " + name + "\nProduct Code: " + productCode + "\nPrice: " + price + "\nBrand: " + brand + "\nDescription: " + description + "\nAvailable Sizes: " + Arrays.toString(availableSizes);
    }
}

