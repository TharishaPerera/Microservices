package com.tharishaperera.InventoryUI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class SupplierController {

    private final static String BASE_URL = "http://localhost:8080";

    @GetMapping(path = "/all-suppliers")
    public String getAllSuppliers(Model model){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Supplier[]> response = restTemplate.getForEntity(BASE_URL + "/suppliers", Supplier[].class);
        Supplier[] suppliers = response.getBody();
        model.addAttribute("suppliers", suppliers);
        return "supplier";
    }

    @GetMapping(path = "/search-supplier")
    public String getSearchSupplier(Model model){
        model.addAttribute("supplier", new Supplier());
        return "search-supplier";
    }

    @GetMapping(path = "/add-supplier")
    public String getAddSupplier(Model model){
        model.addAttribute("supplier", new Supplier());
        return "add-supplier";
    }

    @GetMapping(path = "/edit-supplier")
    public String getEditSupplier(Model model){
        model.addAttribute("supplier", new Supplier());
        return "edit-supplier";
    }

    @GetMapping(path = "/delete-supplier")
    public String getDeleteSupplier(Model model){
        model.addAttribute("supplier", new Supplier());
        return "delete-supplier";
    }

    @PostMapping(path = "/search-supplier")
    public String searchSupplierById(Model model, @ModelAttribute Supplier supplier){
        RestTemplate restTemplate = new RestTemplate();
        Supplier searchedSupplier = restTemplate.getForObject(BASE_URL  +"/suppliers/" + supplier.getSupplierId(), Supplier.class);
        model.addAttribute("searchedSupplier", searchedSupplier);
        return "search-supplier";
    }

}
