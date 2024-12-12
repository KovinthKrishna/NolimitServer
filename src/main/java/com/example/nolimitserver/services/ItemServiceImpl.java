package com.example.nolimitserver.services;

import com.example.nolimitserver.entities.Item;
import com.example.nolimitserver.repositories.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public String addItem(Item item) {
        if (!itemRepository.existsById(item.getId())) {
            itemRepository.save(item);
            return "Item added successfully.";
        }
        return "Already in cart!";
    }

    @Override
    public String updateItem(Item item) {
        if (itemRepository.existsById(item.getId())) {
            itemRepository.save(item);
            return "Item updated successfully.";
        }
        return "Item not found.";
    }

    @Override
    public String deleteItem(long id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return "Item deleted successfully.";
        }
        return "Item not found.";
    }
}
