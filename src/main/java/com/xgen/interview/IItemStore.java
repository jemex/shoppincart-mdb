package com.xgen.interview;

import java.util.List;

/**
 * Interface for the ItemStore to add individual Items
 */

/**
 * IItemStore
 */
public interface IItemStore {

    /**
     * Adds scanned item to the store
     * @param item - Scanned item
     */
    void addItem(Item item);
    
    /**
     * Delete item by id
     * @param id - UUID of item
     */
    void deleteItem(String id);

    /**
     * Get all items of itemstore
     * @return list of items
     */
    List<Item> getAll();
}