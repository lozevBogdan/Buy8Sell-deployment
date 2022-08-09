package com.example.sellbuy.model.entity;

import com.example.sellbuy.model.entity.enums.CategoryEnum;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "categories")
public class CategoryEntity extends BaseEntity {


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoryEnum category;

    @Column(nullable = false)
    private String description;

    public CategoryEntity() {
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public CategoryEntity setCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryEntity setDescription(String description) {
        this.description = description;
        return this;
    }

}
