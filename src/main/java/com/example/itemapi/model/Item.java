package com.example.itemapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Item {

    @Positive(message = "Id must be greater than 0")
    private int id;

    @NotBlank(message = "Item name is required")
    private String name;

    @NotBlank(message = "Item description is required")
    private String description;

    public Item() {}

    public Item(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}


