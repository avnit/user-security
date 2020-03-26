package com.asbsolutionsusers.Customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;

@Controller()
@RequestMapping(path= "/customer", method = RequestMethod.GET)
public class CustomerController {

    @RequestMapping(path = "/customer/{id}", method = RequestMethod.GET)
    public List<CatalogItem> getCatalog(@PathVariable String CustomerId){
        return Collections.singletonList( new CatalogItem(1,"Accenture", 17000.00, 69000.00));
    }
//    @Autowired
//    CustomerRepository CustomerRepository;
//
//    @RequestMapping("/customers")
//    public String home(Model model)
//    {
//        model.addAttribute("Customer", CustomerRepository.findAll());
//        return "index";
//    }



}
