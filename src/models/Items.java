package models;

public class Items {
    String itemsName;
    int itemsCode;
    int price;
    String brand;
    String description;

    public Items(String itemsName, int itemsCode, int price, String brand, String description) {
        this.itemsName = itemsName;
        this.itemsCode = itemsCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    public String getItemsName() {
        return itemsName;
    }

    public int getItemsCode() {
        return itemsCode;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public void setItemsCode(int itemsCode) {
        this.itemsCode = itemsCode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
