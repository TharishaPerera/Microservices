/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tharishaperera.InventoryUI;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @GetMapping(path = "/search-by-category")
    public String searchProductByCategoryView(Model model) {
        model.addAttribute("product", new Product());
        return "search_by_category";
    }

//    @PostMapping(path = "/search-by-category")
//    public String searchProductByCategory(Model model, @ModelAttribute Product product) {
//        RestTemplate restTemplate = new RestTemplate();
//        Product searchedProduct = restTemplate.getForObject(BASE_URL + "/products/" + product.getProductId(), Product.class);
//        model.addAttribute("searchedProduct", searchedProduct);
//        return "search_by_category";
//    }

    @GetMapping(path = "/new-product")
    public String newProductView(Model model) {
        model.addAttribute("product", new Product());
        return "new_product";
    }

    @PostMapping(path = "/newProduct")
    public String createNewProduct(Model model, @ModelAttribute Product product) {
        RestTemplate restTemplate = new RestTemplate();
//        Product newProduct = restTemplate.postForObject(BASE_URL + "/products", product, responseType)
        return "new_product";
    }

    @GetMapping(path = "/edit-product")
    public String editProductView(Model model) {
        model.addAttribute("product", new Product());
        return "edit_product";
    }

    @PostMapping(path = "/edit-product")
    public String editProductById(Model model, @ModelAttribute Product product) {
        RestTemplate restTemplate = new RestTemplate();
        Product editProduct = restTemplate.getForObject(BASE_URL + "/products/" + product.getProductId(), Product.class);
        model.addAttribute("editProduct", editProduct);
        return "edit_product";
    }

    @GetMapping(path = "/delete-product")
    public String deleteProductView(Model model) {
        model.addAttribute("product", new Product());
        return "delete_product";
    }

    @DeleteMapping(path = "/delete-all-products")
    public String deleteAllProducts(Model model, @ModelAttribute Product product) {
        RestTemplate restTemplate = new RestTemplate();
        Product deleteAllProduct = restTemplate.getForObject(BASE_URL + "/products", Product.class);
        model.addAttribute("deleteAllProduct", deleteAllProduct);
        return "product_home";
    }

}
