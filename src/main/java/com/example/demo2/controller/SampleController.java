package com.example.demo2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    @GetMapping("/ex1")
    public String[] ex1() {

        log.info("-----==========ex1==========-----");
        return new String[]{"AAA", "BBB", "CCC"};

    }

}
