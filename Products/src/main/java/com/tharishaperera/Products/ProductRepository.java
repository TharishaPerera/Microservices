/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tharishaperera.Products;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author THARISHA
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query("select s from Products s where s.product_name like lower(concat('%', :productName,'%') )")
//    List<Product> getProductByName(@Param("product_name") String productName);

    @Query("SELECT p FROM Product p WHERE p.productType=?1")
    List<Product> getProductByType(String productType);

    @Query("SELECT p FROM Product p WHERE p.isAvailable=?1")
    List<Product> getProductByAvailability(String isAvailable);

    @Query("SELECT p FROM Product p WHERE p.supplierId=?1")
    List<Product> getProductBySupplier(int supplierId);
}
