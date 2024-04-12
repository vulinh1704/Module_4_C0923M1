package com.codegym.demospringmvc.controller;

import com.codegym.demospringmvc.model.Product;
import com.codegym.demospringmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public ModelAndView showAll() {
        List<Product> list = productService.showAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("list", list);
        return modelAndView;
    }
}
















