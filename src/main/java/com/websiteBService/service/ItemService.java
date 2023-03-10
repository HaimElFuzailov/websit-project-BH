package com.websiteBService.service;

import com.websiteBService.model.Item;

import java.util.List;


public interface ItemService {
    void updateItemById(Long id, Item item) throws Exception;

    void deleteItemById(Long id) throws Exception;

    Item getItemById(Long id);

    void createItem(Item item)throws Exception;

    List<Item> getAllItems();


}
