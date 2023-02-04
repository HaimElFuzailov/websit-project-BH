package com.websiteBService.controller;


import com.websiteBService.model.Item;
import com.websiteBService.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RequestMapping("/item")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;



    @DeleteMapping(value = "/{id}/delete")
    public void deleteItemById(@PathVariable Long id) throws Exception {
        itemService.deleteItemById(id);
    }

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }
}
