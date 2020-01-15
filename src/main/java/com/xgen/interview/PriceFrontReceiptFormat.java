package com.xgen.interview;

import java.util.List;

/**
 * PriceFrontReceiptFormat
 */
public class PriceFrontReceiptFormat implements IReceiptFormat {

    @Override
    public String getReceipt(List<Item> items) {
        try {
            String receipt = "";
            for (Item item : items) {
                receipt.concat(String.format("€%.2f", item.getPrice()) + " - " + item.getItemType() + " - " + item.getNumber());
            }
            receipt.concat("Total Price: " + "€" + String.format("€%.2f", this.totalPrice(items)));
            return receipt;
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