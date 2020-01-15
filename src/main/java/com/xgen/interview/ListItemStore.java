package com.xgen.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * ListItemStore
 */
public class ListItemStore implements IItemStore {

    List<Item> store = new ArrayList<Item>();

    @Override
    public void addItem(Item item) {
        try {
            Optional<Item> optionalItem = store.stream().filter(i -> i.getItemType().equals(item.getItemType())).findFirst();
            if(!optionalItem.isPresent()) {
                store.add(item);
                System.out.println("Added Item");
            } else {
                Item existing = optionalItem.get();
                existing.setNumber(existing.getNumber() + item.getNumber());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteItem(String id) {
        try {
            Optional<Item> optionalItem = store.stream().filter(i -> i.getId().equals(id)).findFirst();
            if(optionalItem.isPresent()) {
                Item existing = optionalItem.get();
                store.remove(existing);
            } else {
                throw new IllegalArgumentException("Item was not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Item> getAll() {
        return store;
    }

    
}