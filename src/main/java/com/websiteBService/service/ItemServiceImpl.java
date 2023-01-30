package com.websiteBService.service;

import com.websiteBService.model.Item;
import com.websiteBService.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;

    @Override
    public void createItem(Item item) throws Exception {
        if(itemRepository.getItemById(item.getId()) != null) {
            itemRepository.createItem(item);
        }
        else {
            throw new Exception("problem with the service");
        }
    }

    @Override
    public void updateItemById(Long id, Item item) throws Exception {
        itemRepository.updateItemById(id, item);
    }

    @Override
    public void deleteItemById(Long id) throws Exception {
        itemRepository.deleteItemById(id);
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.getItemById(id);
    }
    @Override
    public List<Item> getAllItems() { return itemRepository.getAllItems(); }

}
