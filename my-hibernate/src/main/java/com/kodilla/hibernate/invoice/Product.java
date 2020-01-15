package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;

@Entity
@Table(name="PRODUCTS")
public final class Product {

    private int id;
    private String name;
    private Item item;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="PRODUCT_ID", unique=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    @NotNull
    @Column(name="PRODUCT_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }


    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item=item;
    }
}