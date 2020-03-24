package com.asbsolutionsusers.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// @RestController
@RequestMapping("/")
@Controller
public class HomeController {
    @Autowired UserRepository userRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model)
    {
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String ShowUsers(@PathVariable Integer id, Model model)
    {
        model.addAttribute("users", userRepo.getOne(id));
        return "index";
    }



}
