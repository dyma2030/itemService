package com.itemdata.repos;

import com.itemdata.models.ItemModels;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<ItemModels,Long> {
    
    @Query("Select a FROM ItemModels a where name LIKE %:itemName% ")
    public Iterable<ItemModels> findByName(String itemName);

    @Query("Select a FROM ItemModels a where price between :lowest and :highest")
    public Iterable<ItemModels> findByPrice(Double lowest, Double highest);

    @Query("Select a FROM ItemModels a where name LIKE %:itemName% and price between :lowest and :highest")
    public Iterable<ItemModels> findByAllCategory(String itemName, Double lowest, Double highest);
}
