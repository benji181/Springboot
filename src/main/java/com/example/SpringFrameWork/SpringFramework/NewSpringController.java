package com.example.SpringFrameWork.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class NewSpringController {

    @Autowired
    private NewSpringProductsRepository newSpringProductsRepository;

    @GetMapping
    public List<NewSpringProductsModel> getAllProducts() {
        return newSpringProductsRepository.findAll();  // Fetches all products
    }

    @PostMapping
    public NewSpringProductsModel createProduct(@RequestBody NewSpringProductsModel product) {
        return newSpringProductsRepository.save(product);  // Saves a new product
    }
}


