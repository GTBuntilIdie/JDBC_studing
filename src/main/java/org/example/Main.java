package org.example;

import org.example.dao.ProductDao;
import org.example.entity.Product;

public class Main { ;

    public static void main(String[] args) {
        var productDao = ProductDao.getInstance();
        Product product = new Product();


        Product product1 = new Product();
        productDao.update(product1);

    }
}