package com.example.sellbuy.model.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class MessageEntity extends BaseEntity{

    private boolean isSeen;

    @Column(nullable = false)
    private String message;

    @ManyToOne
    private UserEntity sender;

    @ManyToOne
    private UserEntity receiver;


    @ManyToOne(cascade = CascadeType.ALL)
    private ProductEntity product;

    public MessageEntity() {
    }

    public boolean isSeen() {
        return isSeen;
    }

    public MessageEntity setSeen(boolean seen) {
        isSeen = seen;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public MessageEntity setMessage(String message) {
        this.message = message;
        return this;
    }

    public UserEntity getSender() {
        return sender;
    }

    public MessageEntity setSender(UserEntity sender) {
        this.sender = sender;
        return this;
    }

    public UserEntity getReceiver() {
        return receiver;
    }

    public MessageEntity setReceiver(UserEntity receiver) {
        this.receiver = receiver;
        return this;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
