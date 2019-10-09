package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DonationController {

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

//    @("/form")
//    public String form() {
//        return "form";
//    }
}
