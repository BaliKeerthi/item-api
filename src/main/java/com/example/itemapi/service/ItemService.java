package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();

    // Add item
    public Item addItem(Item item) {
        items.add(item);
        return item;
    }

    // Get item by ID
    public Item getItemById(int id) {
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // ✅ Get all items
    public List<Item> getAllItems() {
        return items;
    }
}

