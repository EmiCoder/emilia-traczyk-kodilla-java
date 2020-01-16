package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name="ITEMS")
public class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoices;


    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
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


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product=product;
    }

    @ManyToOne
    @JoinColumn(name="INVOICE_ID")
    public Invoice getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice invoices) {
        this.invoices=invoices;
    }
}
