package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        Product product = new Product("Milk");
        productDao.save(product);
        Item item = new Item(new BigDecimal("25"), 2);
        item.getProducts().add(product);
        product.setItem(item);
        itemDao.save(item);
        Invoice invoice = new Invoice("123");
        invoice.getItems().add(item);
        item.setInvoices(invoice);
        invoiceDao.save(invoice);

        String number=invoice.getNumber();
        Assert.assertEquals("123", number);
    }
}
