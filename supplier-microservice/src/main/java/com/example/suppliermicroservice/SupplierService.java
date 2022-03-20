package com.example.suppliermicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(int supplierId){
        Optional<Supplier> supplier = supplierRepository.findById(supplierId);
        if(supplier.isPresent())
            return supplier.get();
        else
            return null;
    }

    public List<Supplier> getSupplierByName(String supplierName){
        return supplierRepository.getSupplierByName(supplierName);
    }

    public List<Supplier> getSupplierByIndustry(String industry){
        return supplierRepository.getSupplierByIndustry(industry);
    }

    public List<Supplier> getSupplierByCity(String city){
        return supplierRepository.getSupplierByCity(city);
    }

    public List<Supplier> getSupplierByCountry(String country){
        return supplierRepository.getSupplierByCountry(country);
    }

    public List<Supplier> getSupplierByPostalCode(String postalCode){
        return supplierRepository.getSupplierByPostalCode(postalCode);
    }

    public void createSupplier(Supplier supplier){
        supplierRepository.save(supplier);
    }

    public void editSupplierById(Supplier newSupplier, int supplierId){
        Optional<Supplier> supplierCollection = supplierRepository.findById(supplierId);

        Supplier supplier = supplierCollection.get();

        if(newSupplier.getSupplierName() != null)
            supplier.setSupplierName(newSupplier.getSupplierName());
        if(newSupplier.getIndustry() != null)
            supplier.setIndustry(newSupplier.getIndustry());
        if(newSupplier.getSupplierEmail() != null)
            supplier.setSupplierEmail(newSupplier.getSupplierEmail());
        if(newSupplier.getSupplierTelephone() != 0)
            supplier.setSupplierTelephone(newSupplier.getSupplierTelephone());
        if(newSupplier.getStreet() != null)
            supplier.setStreet(newSupplier.getStreet());
        if(newSupplier.getCity() != null)
            supplier.setCity(newSupplier.getCity());
        if(newSupplier.getCountry() != null)
            supplier.setCountry(newSupplier.getCountry());
        if(newSupplier.getPostalCode() != null)
            supplier.setPostalCode(newSupplier.getPostalCode());

        supplierRepository.save(supplier);
    }

    public void deleteSupplierById(int supplierId){
        supplierRepository.deleteById(supplierId);
    }
}
