package com.welearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.welearn.Constants.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WelearnApplicationTests {

    @Test
    public void contextLoads() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Constants.initData();
        System.out.println(objectMapper.writeValueAsString(Constants.exercises));
    }

}
