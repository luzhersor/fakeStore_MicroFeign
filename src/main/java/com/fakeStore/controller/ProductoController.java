package com.fakeStore.controller;

import com.fakeStore.dto.ProductoDTO;
import com.fakeStore.repository.FakeStoreAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private FakeStoreAPI fakeStoreAPI;

    @GetMapping("/products/{id}")
    public ProductoDTO getProductoInfo (@PathVariable("id") int id){
        return fakeStoreAPI.getProductoInfo(id);
    }

    @GetMapping("/products")
    public List<ProductoDTO> getAllProducts() {
        return fakeStoreAPI.getAllProducts();
    }


}
