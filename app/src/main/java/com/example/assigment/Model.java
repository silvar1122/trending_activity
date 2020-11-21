package com.example.assigment;

public class Model {
    private int itemPicture;
    private String itemName;
    private  String itemFrom;
    private String itemPrice;

    //Constructor
    public Model(int itemPicture, String itemName, String itemPrice,String itemFrom) {
        this.itemPicture = itemPicture;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemFrom=itemFrom;
    }

    //Getters

    public String getItemFrom() {
        return itemFrom;
    }

    public int getItemPicture() {
        return itemPicture;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    //Setters


    public void setItemFrom(String itemFrom) {
        this.itemFrom = itemFrom;
    }

    public void setItemPicture(int itemPicture) {
        this.itemPicture = itemPicture;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }
}
