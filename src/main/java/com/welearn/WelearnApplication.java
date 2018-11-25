package com.welearn;

import com.welearn.Constants.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelearnApplication.class, args);
        Constants.initData();
    }
}
