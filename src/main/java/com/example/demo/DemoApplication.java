package com.example.demo;

import com.example.demo.model.Country;
import com.example.demo.model.CountryRepository;
import com.example.demo.model.State;
import com.example.demo.model.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.State;
import com.example.demo.model.Country;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}



