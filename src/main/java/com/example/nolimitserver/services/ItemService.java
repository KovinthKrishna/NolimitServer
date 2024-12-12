package com.example.nolimitserver.services;

import com.example.nolimitserver.entities.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems();

    String addItem(Item item);

    String updateItem(Item item);

    String deleteItem(long id);
}
