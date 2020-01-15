package com.xgen.interview;

import java.util.List;

/**
 * PriceFrontReceiptFormat
 */
public class PriceFrontReceiptFormat implements IReceiptFormat {

    @Override
    public String getReceipt(List<Item> items) {
        try {
            String receipt = "Item - Number - Price" + System.lineSeparator();
            for (Item item : items) {
                receipt.concat(item.getItemType() + '-' + item.getNumber() + '-' + item.getPrice().toString() + System.lineSeparator());
            }
            receipt.concat("Total Price: " + this.totalPrice(items).toString());
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