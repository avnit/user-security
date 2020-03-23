package com.asbsolutionsusers.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    private User getEmployeesCollection()
    {
        User user_1 = new User();
        user_1.setName("test");
        return user_1;
    }

    @RequestMapping(value = "/api")
    public String getAllEmployeesJson(Model model)
    {
        model.addAttribute("employees", getEmployeesCollection());
        return "jsonTemplate";
    }


}
