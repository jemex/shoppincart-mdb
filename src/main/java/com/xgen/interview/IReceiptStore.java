package com.xgen.interview;

import java.util.List;

/**
 * IReceiptStore stores receipts
 */
public interface IReceiptStore {
    
    /**
     * 
     * @param receipt - Implemented as the Item list. Gives us extensibility in terms of formatting
     */
    void addReceipt(List<Item> receipt);

    
}