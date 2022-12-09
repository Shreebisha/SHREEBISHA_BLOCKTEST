package models;

import java.util.ArrayList;

public class Orders {
    int productCode;
    int userid;
    int price;
    int quantity;

    ArrayList<Items> items;

    public Orders(int productCode, int userid, int price, int quantity, ArrayList<Items> items) {
        this.productCode = productCode;
        this.userid = userid;
        this.price = price;
        this.quantity = quantity;
        this.items = items;
    }

    public int getProductCode() {
        return productCode;
    }

    public int getUserid() {
        return userid;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}

