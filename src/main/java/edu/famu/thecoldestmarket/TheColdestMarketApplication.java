package edu.famu.thecoldestmarket;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootApplication
public class TheColdestMarketApplication {

    public static void main(String[] args) throws FileNotFoundException {


        SpringApplication.run(TheColdestMarketApplication.class, args);
    }

}
