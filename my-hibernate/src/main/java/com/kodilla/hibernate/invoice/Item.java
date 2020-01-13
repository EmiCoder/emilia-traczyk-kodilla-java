package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ITEMS")
public final class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private List<Product> products = new ArrayList<>();


    public Item() {
    }

    public Item(BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ITEM_ID", unique=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }



    @Column(name="ITEM_PRICE")
    @NotNull
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price=price;
    }

    @Column(name="ITEM_QUANTITY")
    @NotNull
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }

    @Column(name="ITEM_VALUE")
    @NotNull
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value=value;
    }

    @OneToMany(
            targetEntity=Product.class,
            mappedBy="item",
            cascade=CascadeType.ALL,
            fetch=FetchType.LAZY
    )
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products=products;
    }
}
