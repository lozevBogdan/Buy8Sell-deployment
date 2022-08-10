package com.example.sellbuy.model.entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
@Transactional
@Entity
@Table(name = "pictures")
public class PictureEntity extends BaseEntity {


    @Lob
    @Column
    private String url;

    @OneToOne(mappedBy = "picture",cascade = CascadeType.ALL, orphanRemoval = true)
    private ProductEntity product;

    public PictureEntity() {
    }

    public String getUrl() {
        return url;
    }

    public PictureEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public PictureEntity setProduct(ProductEntity product) {
        this.product = product;
        return this;
    }
}
