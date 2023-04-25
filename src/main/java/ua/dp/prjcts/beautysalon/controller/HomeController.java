package ua.dp.prjcts.beautysalon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.dp.prjcts.beautysalon.service.UserService;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping({"/", "home"})
    public String home(Model model) {
        model.addAttribute("users", userService.getAll());
        return "home";
    }
}
