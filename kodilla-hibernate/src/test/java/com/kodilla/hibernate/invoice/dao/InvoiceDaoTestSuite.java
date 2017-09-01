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
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("apple");
        Item item1 = new Item(new BigDecimal("5"), 5);
        Item item2 = new Item(new BigDecimal("10"), 5);
        Invoice invoice = new Invoice("001");
        item1.setProduct(product);
        item2.setProduct(product);
        productDao.save(product);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        //When
        invoiceDao.save(invoice);
        //Then
        Assert.assertEquals(2, invoice.getItems().size());
        //CleanUp
        invoiceDao.deleteAll();
        productDao.deleteAll();
    }
}
