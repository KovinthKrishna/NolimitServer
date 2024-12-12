package com.example.nolimitserver.repositories;

import com.example.nolimitserver.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
