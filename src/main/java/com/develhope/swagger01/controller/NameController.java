package com.develhope.swagger01.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    @Operation ( description = "Returns a name")
    public String name(@RequestParam String nome){
        return nome;
    }
}
