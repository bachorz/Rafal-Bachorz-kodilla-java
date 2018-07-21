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
    public void testInvoiceDaoSave(){

        //Given

        Product product1 = new Product("Tire for a truck");
        Product product2  = new Product("Bulb");
        Product product3 = new Product("Wiper");
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(product1, new BigDecimal("8.25"), 6, new BigDecimal("49.5"));
        Item item2 = new Item(product2, new BigDecimal("0.50"), 10, new BigDecimal("5.00"));
        Item item3 = new Item(product3, new BigDecimal("1.00"), 3, new BigDecimal("3.00"));
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);


        Invoice invoice = new Invoice("2018/07/01");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
       invoiceDao.delete(id);

    }



}
