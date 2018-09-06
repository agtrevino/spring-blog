package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    @ResponseBody
    private String sayHi(){
        return "Hi";
    }

    @GetMapping("/list")
    private String listOfNames(Model model) {

        List<String> names = new ArrayList<>();

        names.add("Aaron");
        names.add("Flippie Doowop");
        names.add("Skippy hop beep bop");

        model.addAttribute("listOfNames", names);
        model.addAttribute("role", "admin");

        return "lists";


    }
}
