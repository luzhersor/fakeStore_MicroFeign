package com.fakeStore.repository;

import com.fakeStore.dto.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="fakeStore", url = "https://fakestoreapi.com")
public interface FakeStoreAPI {

    @GetMapping("/products/{id}")
    public ProductoDTO getProductoInfo(@PathVariable("id") int id);

    @GetMapping ("/products")
    public List<ProductoDTO> getAllProducts();
}
