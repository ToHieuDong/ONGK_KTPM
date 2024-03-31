package com.example.gk_tohieudong.FrontEnd.controllers;

import com.example.gk_tohieudong.BackEnd.models.Customer;
import com.example.gk_tohieudong.BackEnd.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ClientController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/getListCus")
    public String getProducts(Model model) {
        List<Customer> lst = customerRepository.findAll();
        model.addAttribute("lst",lst );
        System.out.println(lst);
        return "cus";
    }
}
