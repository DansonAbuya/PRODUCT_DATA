package com.danapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.danapps.model.Product;
import com.danapps.service.ProductService;

@Controller
public class ProductController {

    

    @Autowired
   ProductService productService;

    @RequestMapping("/listproduct")
    @ResponseBody
    public List<Product> getAllProducts() {
    	List<Product> products =   productService.getAllProducts();
    
        return products;
    }
    
    @RequestMapping( value ="/findtotal" ,method=RequestMethod.GET)
    @ResponseBody
    public double CalctotalPrice() {
    	double totalPrice =productService.calculateTotalPrice();
		return totalPrice;
    }
    
    
    
}