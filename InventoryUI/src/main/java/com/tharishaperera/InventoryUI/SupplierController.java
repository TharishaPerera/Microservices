package com.tharishaperera.InventoryUI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class SupplierController {

    @GetMapping(path = "/search-supplier")
    public String getAllSearchedUsers(Model model){
        model.addAttribute("supplier", new Supplier());
        return "supplier";
    }

    @PostMapping(path = "/search-supplier")
    public String searchSupplierById(Model model, @ModelAttribute Supplier supplier){
        RestTemplate restTemplate = new RestTemplate();
        Supplier searchedSupplier = restTemplate.getForObject("http://localhost:8080/suppliers/" + supplier.getSupplierId(), Supplier.class);
        model.addAttribute("searchedSupplier", searchedSupplier);
        return "supplier";
    }

}
