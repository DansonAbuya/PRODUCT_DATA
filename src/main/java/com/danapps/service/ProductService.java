package com.danapps.service;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.danapps.MyBatisConfig;
//import com.danapps.mapper.ProductMapper;
import com.danapps.model.Product;

@Service
public class ProductService {

    

  

    public List<Product> getAllProducts() {
    	SqlSession session = MyBatisConfig.returnsessionFactory().openSession();
    	List<Product> products = session.selectList("getAllProducts");
    	   session.close();
    	   return products;
     
    }

    public double calculateTotalPrice() {
        List<Product> products = getAllProducts();
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    
   
    
}