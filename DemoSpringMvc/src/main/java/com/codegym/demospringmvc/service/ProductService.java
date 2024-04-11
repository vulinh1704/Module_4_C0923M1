package com.codegym.demospringmvc.service;

import com.codegym.demospringmvc.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> list = new ArrayList<>();

    public ProductService() {
        list.add(new Product(1, "Bánh mì"));
        list.add(new Product(2, "Bánh cáy"));
    }

    public List<Product> showAll() {
        return this.list;
    }
}
