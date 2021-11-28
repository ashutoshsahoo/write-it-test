package com.ashu.it;

import com.ashu.practice.DemoAppCliApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class DemoAppCliItApplicationTests {

    private static ConfigurableApplicationContext context;

    @Test
    void contextLoads() throws Exception {
        context = new SpringApplicationBuilder(DemoAppCliApplication.class).run();
        context.stop();
    }

}
