/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tharishaperera.Products;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author THARISHA
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get All Product
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get Product By Id
    public Product getProductByID(int productId) {
        Optional<Product> product = productRepository.findById(productId);
        if (product.isPresent()) {
            return product.get();
        }
        return null;
    }

    //Get Product By Availability
    public List<Product> getProductByAvailability(String isAvailable){
        return productRepository.getProductByAvailability(isAvailable);
    }

    // Get Product By Type
    public List<Product> getProductByType(String productType) {
        return productRepository.getProductByType(productType);
    }

        // Get Product By Supplier
        public List<Product> getProductBySupplier(int supplierId) {
            return productRepository.getProductBySupplier(supplierId);
        }

    // Create Product
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    // Update Product
    public void updateProduct(int productId, Product productBody) {
        Optional<Product> productCollection = productRepository.findById(productId);

        if (productCollection.isPresent()) {
            Product product = productCollection.get();

            if (productBody.getProductName() != null) {
                product.setProductName(productBody.getProductName());
            }

            if (productBody.getProductDescription() != null) {
                product.setProductDescription(productBody.getProductDescription());
            }

            if (productBody.getProductType() != null) {
                product.setProductType(productBody.getProductType());
            }

            if (productBody.getUnitPrice() != 0) {
                product.setUnitPrice(productBody.getUnitPrice());
            }

            if (productBody.getIsAvailable() != null) {
                product.setIsAvailable(productBody.getIsAvailable());
            }

            if (productBody.getAvailableQuantity() != 0) {
                product.setAvailableQuantity(productBody.getAvailableQuantity());
            }

            if (productBody.getSupplierId() != 0) {
                product.setSupplierId(productBody.getSupplierId());
            }

            productRepository.save(product);
        }
    }

    // Delete Product By Id
    public void deleteProductById(int productId) {
        productRepository.deleteById(productId);
    }

    // Delete All Products
    public void deleteAllProducts() {
        productRepository.deleteAll();
    }
}
