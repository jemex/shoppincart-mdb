package com.xgen.interview;

import java.sql.Timestamp;

public class Item {
    String id;
    String itemType;
    int number;
    Timestamp createdAt;
    Pricer pricer;

    public Item(String id, String itemType, int number, Timestamp createdAt, Pricer pricer) {
        this.id = id;
        this.itemType = itemType;
        this.number = number;
        this.createdAt = createdAt;
        this.pricer = pricer;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the createdAt
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        int price = pricer.getPrice(this.itemType) * this.number;
        return Float.valueOf(Float.valueOf(price) / 100);
    }

    
}