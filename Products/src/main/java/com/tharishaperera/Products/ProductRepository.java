/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tharishaperera.Products;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author THARISHA
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select * from Products s where s.product_name like lower(concat('%', :productName,'%') )")
    List<Product> getProductByName(@Param("productName") String productName);

    @Query("select s from Products s where s.product_type=?1")
    List<Product> getProductByType(String product_type);
}
