package com.websiteBService.repository;

import com.websiteBService.model.Item;

import java.util.List;


public interface ItemRepository {

    void createItem(Item item);


    void updateItemById(Long id, Item item) throws Exception;

    void deleteItemById(Long id) throws Exception;

    Item getItemById(Long id);

    List<Item> getAllItems();
}
