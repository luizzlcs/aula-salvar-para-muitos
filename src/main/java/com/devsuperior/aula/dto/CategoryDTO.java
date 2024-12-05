package com.devsuperior.aula.dto;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.aula.entities.Category;

public class CategoryDTO {
    private Long id;
    private String name;

    private List<ProductDTO> products = new ArrayList<>();

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ProductDTO> getproducts() {
        return products;
    }

    
}
