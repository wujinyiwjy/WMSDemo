package controller;

import domain.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    
    @RequestMapping("/login")
    @ResponseBody
    public void adminLogin(Administrator administrator)
    {
        adminService.adminLogin(administrator);
    }
}
