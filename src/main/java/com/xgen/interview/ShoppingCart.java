package com.xgen.interview;

import java.sql.Timestamp;
import java.util.*;


/**
 * This is the current implementation of ShoppingCart.
 * Please write a replacement
 */
public class ShoppingCart implements IShoppingCart {
    IItemStore itemStore;
    Pricer pricer;
    IReceiptFormat receiptFormat;

    public ShoppingCart(IItemStore itemStore, Pricer pricer, IReceiptFormat receiptFormat) {
        this.itemStore = itemStore;
        this.pricer = pricer;
        this.receiptFormat = receiptFormat;
    }

    public void addItem(String itemType, int number) {
        try {
            String id = UUID.randomUUID().toString();
            //Create Timestamp
            Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
            Item newItem = new Item(id, itemType, number, timeStamp, pricer);
            itemStore.addItem(newItem);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void printReceipt() {
        System.out.println(receiptFormat.getReceipt(itemStore.getAll()));
    }
}
