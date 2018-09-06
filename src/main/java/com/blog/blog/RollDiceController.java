package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    private String rollDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String returnResults(@PathVariable int n, Model model) {
        model.addAttribute("answer", randomNumber());
        model.addAttribute("userInput", n);

        return "roll-dice-results";
    }

    private int randomNumber(){
        Random random = new Random();
        return random.nextInt((6 -1) +1) +1;
    }

}
