package com.sopan.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopan.api.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
