package com.example.Demolog4j;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demolog4jApplication {



    public static void main(String[] args) {
        DOMConfigurator.configure("src/main/log4j.xml");
        SpringApplication.run(Demolog4jApplication.class, args);
    }

}
