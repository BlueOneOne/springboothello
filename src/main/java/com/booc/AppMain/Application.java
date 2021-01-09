package com.booc.AppMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this is dev
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/hi")
    public String home(){
        return "hello";
    }
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
