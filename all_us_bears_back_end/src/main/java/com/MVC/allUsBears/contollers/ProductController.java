package com.MVC.allUsBears.contollers;

import com.MVC.allUsBears.models.Product;
import com.MVC.allUsBears.models.data.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("add")
    public String processAddProductFormTestConnection(@RequestBody Product product){
        productRepository.save(product);
        return "product add.";
    }

}
