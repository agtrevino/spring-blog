package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    private int addMessage(
            @PathVariable int num1,
            @PathVariable int num2
    ) {
        int message = num1 + num2;
        return message;

    }
    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    private int subMessage(
            @PathVariable int num1,
            @PathVariable int num2
    ) {
        int message = num1 - num2;
        return message;

    }
    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    private int multiplyMessage(
            @PathVariable int num1,
            @PathVariable int num2
    ) {
        int message = num1 * num2;
        return message;

    }
    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    private int divideMessage(
            @PathVariable int num1,
            @PathVariable int num2
    ) {
        int message = num1 / num2;
        return message;
    }
}

