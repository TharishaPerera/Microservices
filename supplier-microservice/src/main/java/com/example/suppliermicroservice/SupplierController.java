package com.example.suppliermicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping(path = "/suppliers")
    public List<Supplier> getAllSuppliers(){
        return supplierService.getAllSuppliers();
    }

    @GetMapping(path = "/suppliers/{supplierId}")
    public Supplier getSupplierById(@PathVariable int supplierId) throws RecordNotFoundException{
        return supplierService.getSupplierById(supplierId);
    }

    @GetMapping(path = "/suppliers/names")
    public List<Supplier> getSupplierByName(@RequestParam String supplierName){
        return supplierService.getSupplierByName(supplierName);
    }

    @GetMapping(path = "/suppliers/industries")
    public List<Supplier> getSupplierByIndustry(@RequestParam String industry){
        return supplierService.getSupplierByIndustry(industry);
    }

    @GetMapping(path = "/suppliers/cities")
    public List<Supplier> getSupplierByCity(@RequestParam String city){
        return supplierService.getSupplierByCity(city);
    }

    @GetMapping(path = "/suppliers/countries")
    public List<Supplier> getSupplierByCountry(@RequestParam String country){
        return supplierService.getSupplierByCountry(country);
    }

    @GetMapping(path = "/suppliers/postalCodes")
    public List<Supplier> getSupplierByPostalCodes(@RequestParam String postalCode){
        return supplierService.getSupplierByPostalCode(postalCode);
    }

    @PostMapping(path = "/suppliers")
    public void createSupplier(@RequestBody Supplier supplier){
        supplierService.createSupplier(supplier);
    }

    @PutMapping(path = "/suppliers/{supplierId}")
    public void editSupplierById(@RequestBody Supplier supplier, @PathVariable int supplierId){
        supplierService.editSupplierById(supplier, supplierId);
    }

    @DeleteMapping(path = "/suppliers/{supplierId}")
    public void deleteSupplierById(@PathVariable int supplierId){
        supplierService.deleteSupplierById(supplierId);
    }
}
