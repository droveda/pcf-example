package br.com.diegues.pcf.pcfexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("hello")
    public String index() {
        return "Hello World!";
    }

}
