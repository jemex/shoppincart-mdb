package com.xgen.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * RegularReceiptFormat
 */
public class RegularReceiptFormat implements IReceiptFormat {

    @Override
    public String getReceipt(List<Item> items) {
        try {
            List<String> itemList = new ArrayList<String>();
            for (Item item : items) {
                itemList.add(item.getItemType() + " - " + item.getNumber() + " - " + String.format("€%.2f", item.getPrice()));
            }
            itemList.add("Total Price: " + String.format("€%.2f", this.totalPrice(items)));
            // Will join our list and use newline as seperator
            String receiptString = String.join("\r\n", itemList); 
            return receiptString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Float totalPrice(List<Item> items) {
        try {
            Float sum = 0F;
            for (Item item : items) {
                sum += item.getPrice();
            }
            return sum;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}