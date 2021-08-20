package com.itemdata.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_item")
public class ItemModels implements Serializable {

    @Id
    private Long id;

    private String name;

    private String description;

    private Double Price;

    public ItemModels() {
    }

    public ItemModels(Long id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        Price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    
}
