package com.itemdata.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.itemdata.models.ItemModels;
import com.itemdata.repos.ItemRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ItemService {
    
    @Autowired
    private ItemRepo itemRepo;

    public ItemModels findOne(Long id){
        Optional<ItemModels> itemModels = itemRepo.findById(id);
        if (!itemModels.isPresent()) {
            return null;
        }
        return itemRepo.findById(id).get();
    }
    public Iterable<ItemModels> findAll(){
        return itemRepo.findAll();
    }
    public Iterable<ItemModels> findByName(String itemName){
        return itemRepo.findByName(itemName);
    }
    public Iterable<ItemModels> findByPrice(Double lowest, Double highest){
        return itemRepo.findByPrice(lowest,highest);
    }
    public Iterable<ItemModels> findByAllCategory(String itemName, Double lowest, Double highest){
        return itemRepo.findByAllCategory(itemName,lowest,highest);
    }
}
