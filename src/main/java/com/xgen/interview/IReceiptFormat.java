package com.xgen.interview;

import java.util.List;

/**
 * IReceiptFormat
 */
public interface IReceiptFormat {

    /**
     * Return complete items as receipt
     * @param items - items (converted to list) from itemstore
     * 
     */
    String getReceipt(List<Item> items);
    
    /**
     * Returns totalPrice of all items as integer
     * @param items
     */
    Float totalPrice(List<Item> items);
}