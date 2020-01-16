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
    InvoiceDao invoiceDao;



    @Test
    public void testInvoiceDaoSave() {
        Product product1 = new Product("Milk");
        Item item = new Item(product1, new BigDecimal("25"), 2);
        Invoice invoice = new Invoice("123");
        invoice.getItems().add(item);
        item.setInvoices(invoice);
        invoiceDao.save(invoice);

        Assert.assertEquals(1, invoice.getItems().size());
    }
}
