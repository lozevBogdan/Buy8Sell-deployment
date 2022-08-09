package com.example.sellbuy.model.view.productViews;

import com.example.sellbuy.model.entity.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ProductDetailsViewDto extends BaseProductViewModel {

    private PictureEntity picture;
    private Set<CommentEntity> comments= new HashSet<>();
    private Set<UserEntity> fans= new HashSet<>();
    private int views;
    private LocalDateTime created;
    private LocalDateTime modified;


    public PictureEntity getPicture() {
        return picture;
    }

    public ProductDetailsViewDto setPicture(PictureEntity picture) {
        this.picture = picture;
        return this;
    }

    public Set<CommentEntity> getComments() {
        return comments;
    }

    public ProductDetailsViewDto setComments(Set<CommentEntity> comments) {
        this.comments = comments;
        return this;
    }

    public Set<UserEntity> getFans() {
        return fans;
    }

    public ProductDetailsViewDto setFans(Set<UserEntity> fans) {
        this.fans = fans;
        return this;
    }

    public int getViews() {
        return views;
    }

    public ProductDetailsViewDto setViews(int views) {
        this.views = views;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public ProductDetailsViewDto setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public ProductDetailsViewDto setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
