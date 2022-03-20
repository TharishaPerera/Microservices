package com.example.suppliermicroservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    @Query("select s from Supplier s where s.supplierName like lower(concat('%', :supplierName,'%') )")
    List<Supplier> getSupplierByName(@Param("supplierName") String supplierName);

    @Query("select s from Supplier s where s.industry=?1")
    List<Supplier> getSupplierByIndustry(String industry);

    @Query("select s from Supplier s where s.city like lower(concat('%', :city, '%') )")
    List<Supplier> getSupplierByCity(@Param("city") String city);

    @Query("select s from Supplier s where s.country=?1")
    List<Supplier> getSupplierByCountry(String country);

    @Query("select s from Supplier s where s.postalCode like lower(concat('%', :postalCode, '%')) ")
    List<Supplier> getSupplierByPostalCode(@Param("postalCode") String postalCode);
}
