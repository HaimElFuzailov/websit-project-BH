package com.websiteBService.repository;

import com.websiteBService.model.Item;


public interface ItemRepository {

    void createItem(Item item);


    void updateItemById(Long id, Item item) throws Exception;

    void deleteItemById(Long id) throws Exception;

    Item getItemById(Long id);
}
