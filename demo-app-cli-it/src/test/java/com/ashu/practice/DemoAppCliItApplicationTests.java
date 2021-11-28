package com.ashu.practice;

import com.ashu.practice.clr.DemoAppCLR;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoAppCliItApplicationTests {

    @Autowired
    private DemoAppCLR clr;

    @Test
    void contextLoads() throws Exception {
        clr.run();
    }

}
