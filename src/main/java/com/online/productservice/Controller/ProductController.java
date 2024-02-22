package com.online.productservice.Controller;

import com.online.productservice.model.product;
import com.online.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController
{


    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }


    @GetMapping()
    public List<product> getAllProducts()
    {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public product getSingleProduct(@PathVariable("id") Long id)
    {
        return productService.getSingleProduct(id);
    }

    @PostMapping()
    public product addNewProduct(@RequestBody product product)
    {
        product p = new product();
        p.setTitle("A new product");
        return p;
    }

    @PatchMapping("/{id}")
    public product updateproduct(@PathVariable("/id") Long id,@RequestBody product product)
    {
        return new product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id)
    {

    }

    @PutMapping("/{id}")
    public product replaceProduct(@PathVariable("/id") Long id,@RequestBody product product)
    {
        return new product();
    }
}
