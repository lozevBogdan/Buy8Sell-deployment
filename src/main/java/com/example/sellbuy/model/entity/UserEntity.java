package com.example.sellbuy.model.entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String mobileNumber;

    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<UserRoleEntity> roles = new HashSet<>();

    @OneToMany(mappedBy = "seller",fetch = FetchType.EAGER)
    private Set<ProductEntity> products= new HashSet<>();

    @OneToMany(mappedBy = "sender",fetch = FetchType.EAGER)
    private Set<MessageEntity> sendMessages= new HashSet<>();

    @OneToMany(mappedBy = "receiver",fetch = FetchType.EAGER)
    private Set<MessageEntity> receiverMessages= new HashSet<>();

    @ManyToMany(mappedBy = "fans",fetch = FetchType.EAGER)
    private Set<ProductEntity> favoriteProducts = new HashSet<>();


    public UserEntity() {
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public String getMobileNumber() {
        return mobileNumber;
    }

    public UserEntity setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public Set<UserRoleEntity> getRoles() {
        return roles;
    }

    public UserEntity setRoles(Set<UserRoleEntity> roles) {
        this.roles = roles;
        return this;
    }

    public Set<ProductEntity> getProducts() {
        return products;
    }

    public UserEntity setProducts(Set<ProductEntity> products) {
        this.products = products;
        return this;
    }

    public Set<MessageEntity> getSendMessages() {
        return sendMessages;
    }

    public UserEntity setSendMessages(Set<MessageEntity> sendMessages) {
        this.sendMessages = sendMessages;
        return this;
    }

    public Set<MessageEntity> getReceiverMessages() {
        return receiverMessages;
    }

    public UserEntity setReceiverMessages(Set<MessageEntity> receiverMessages) {
        this.receiverMessages = receiverMessages;
        return this;
    }

    public Set<ProductEntity> getFavoriteProducts() {
        return favoriteProducts;
    }

    public UserEntity setFavoriteProducts(Set<ProductEntity> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        return getEmail() != null ? getEmail().equals(that.getEmail()) : that.getEmail() == null;
    }

    @Override
    public int hashCode() {
        return getEmail() != null ? getEmail().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
