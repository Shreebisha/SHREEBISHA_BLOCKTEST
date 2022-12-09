package models;

import java.util.ArrayList;

public class Users {
    String name;
    String contact;
    String address;
    ArrayList<Orders> orders;

    public Users(String name, String contact, String address, ArrayList<Orders> orders) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }
}

