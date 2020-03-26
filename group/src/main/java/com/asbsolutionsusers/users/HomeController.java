package com.asbsolutionsusers.users;

import com.asbsolutionsusers.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

// @RestController
@RequestMapping("/")
@Controller
public class HomeController {
    @Autowired
    UserRepository userRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> home(Model model)
    {
        model.addAttribute("users", userRepo.findAll());
        return userRepo.findAll();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User ShowUsers(@PathVariable Integer id, Model model)
    {
        model.addAttribute("users", userRepo.getOne(id));
        return userRepo.getOne(id);
    }



}
