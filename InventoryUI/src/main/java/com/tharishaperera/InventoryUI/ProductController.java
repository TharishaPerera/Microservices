/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tharishaperera.InventoryUI;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author THARISHA
 */
@Controller
public class ProductController {

    private final static String BASE_URL = "http://localhost:8081";

    @GetMapping(path = "/products")
    public String productsView(Model model) {
        model.addAttribute("product", new Product());
        return "product_home";
    }

    @GetMapping(path = "/all-products")
    public String allProductsView(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Product[]> response = restTemplate.getForEntity(BASE_URL + "/products", Product[].class);
        Product[] products = response.getBody();
        model.addAttribute("products", products);
        return "all_products";
    }

    @GetMapping(path = "/search-product")
    public String searchProductView(Model model) {
        model.addAttribute("product", new Product());
        return "search_product";
    }

    @PostMapping(path = "/search-product")
    public String searchProductById(Model model, @ModelAttribute Product product) {
        RestTemplate restTemplate = new RestTemplate();
        Product searchedProduct = restTemplate.getForObject(BASE_URL + "/products/" + product.getProductId(), Product.class);
        model.addAttribute("searchedProduct", searchedProduct);
        return "search_product";
    }

    @GetMapping(path = "/new-product")
    public String newProductView(Model model) {
        model.addAttribute("product", new Product());
        return "new_product";
    }

    @PostMapping(path = "/new-product")
    public String newProductById(Model model, @ModelAttribute Product product) {

        return "new_product";
    }
}
