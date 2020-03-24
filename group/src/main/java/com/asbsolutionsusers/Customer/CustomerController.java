package com.asbsolutionsusers.customer;

import com.asbsolutionsusers.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class customerController {

    @Autowired
    UserRepository customerRepository;

    @RequestMapping("/customers")
    public String home(Model model)
    {
        model.addAttribute("customers", customerRepository.findAll());
        return "index";
    }



}
