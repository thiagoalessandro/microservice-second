package br.com.intelector.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/microserviceSecond")
public class TraceController {

    @GetMapping(value = "/trace")
    public String get(){
        return "ok";
    }


}
