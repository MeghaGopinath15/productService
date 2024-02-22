package com.online.productservice.services;

import com.online.productservice.dto.FakeStoreProductdto;
import com.online.productservice.model.Category;
import com.online.productservice.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService
{
    @Autowired
    private RestTemplate restTemplate;


    public FakeStoreProductService(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    private product convertFakeStoreProductToProduct(FakeStoreProductdto fakeStoreProductdto)
    {
        product p = new product();
        p.setTitle(fakeStoreProductdto.getTitle());
        p.setId(fakeStoreProductdto.getId());
        p.setPrice(fakeStoreProductdto.getPrice());
        p.setCategory(new Category());
        p.setDescription(fakeStoreProductdto.getDescription());
        p.setPrice(fakeStoreProductdto.getPrice());
        p.getCategory().setName(fakeStoreProductdto.getCategory());
        return p;
    }


    @Override
    public product getSingleProduct(Long id)
    {
        FakeStoreProductdto productdto=restTemplate.getForObject("https://fakestoreapi.com/products"+id,
                FakeStoreProductdto.class);
        return  convertFakeStoreProductToProduct(productdto);
    }
}
