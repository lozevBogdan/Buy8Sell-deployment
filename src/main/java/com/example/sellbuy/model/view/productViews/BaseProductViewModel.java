package com.example.sellbuy.model.view.productViews;

import com.example.sellbuy.model.entity.CategoryEntity;
import com.example.sellbuy.model.entity.LocationEntity;
import com.example.sellbuy.model.entity.UserEntity;
import com.example.sellbuy.model.entity.enums.ConditionEnum;

import java.math.BigDecimal;

public abstract class BaseProductViewModel {

    private String title;
    private ConditionEnum condition;
    private CategoryEntity category;
    private String description;
    private BigDecimal price;
    private LocationEntity location;
    private Long id;
    private UserEntity seller;
    private boolean isPromo;
    private boolean isProductIsFavorInCurrentUser = false;

    public Long getId() {
        return id;
    }

    public BaseProductViewModel setId(Long id) {
        this.id = id;
        return this;
    }

    public ConditionEnum getCondition() {
        return condition;
    }

    public BaseProductViewModel setCondition(ConditionEnum condition) {
        this.condition = condition;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BaseProductViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BaseProductViewModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BaseProductViewModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public BaseProductViewModel setLocation(LocationEntity location) {
        this.location = location;
        return this;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public BaseProductViewModel setSeller(UserEntity seller) {
        this.seller = seller;
        return this;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public BaseProductViewModel setCategory(CategoryEntity category) {
        this.category = category;
        return this;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public BaseProductViewModel setPromo(boolean promo) {
        isPromo = promo;
        return this;
    }

    public boolean isProductIsFavorInCurrentUser() {
        return isProductIsFavorInCurrentUser;
    }

    public BaseProductViewModel setProductIsFavorInCurrentUser(boolean productIsFavorInCurrentUser) {
        isProductIsFavorInCurrentUser = productIsFavorInCurrentUser;
        return this;
    }

    @Override
    public String toString() {
        return "BaseProductViewModel{" +
                "title='" + title + '\'' +
                ", condition=" + condition +
                ", category=" + category +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", location=" + location +
                ", id=" + id +
                ", isPromo=" + isPromo +
                ", isProductIsFavorInCurrentUser=" + isProductIsFavorInCurrentUser +
                '}';
    }
}
