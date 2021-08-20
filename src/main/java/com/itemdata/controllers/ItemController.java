package com.itemdata.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itemdata.dto.SearchItem;
import com.itemdata.models.ItemModels;
import com.itemdata.services.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/item")
public class ItemController {

    @Autowired
    private ItemService itemService;
    
    @GetMapping("/{id}")
    public ItemModels findOne(@PathVariable("id") Long id) {
        return itemService.findOne(id);
    }
    
    @GetMapping
    public Iterable<ItemModels> findAll(){
        return itemService.findAll();
    }

    @PostMapping("/search/name")
    public Iterable<ItemModels> findByName(@RequestBody SearchItem searchItem){
        return itemService.findByName(searchItem.getSearchName());
    }

    @PostMapping("/search/price")
    public Iterable<ItemModels> findByPrice(@RequestBody SearchItem searchItem){
        return itemService.findByPrice(searchItem.getSearchLowPrice(),searchItem.getSearchHighPrice());
    }

    @PostMapping("/search/all")
    public Iterable<ItemModels> findByAllCategory(@RequestBody SearchItem searchItem){
        return itemService.findByAllCategory(searchItem.getSearchName(),searchItem.getSearchLowPrice(),searchItem.getSearchHighPrice());
    }
}
