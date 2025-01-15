package com.example.demo.service;

import com.example.demo.entity.Menus;
import com.example.demo.repository.ProductDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class ProductService {
    private ProductDao productDao;
    public List<Menus> findAll(){
        return productDao.findAll();
    }

}
