package com.milorad.app;


/*

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
*/


public class Main {

}/*
@SpringBootApplication()
@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@ImportResource("classpath:app-config.xml")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("http://localhost:8777/ping?testCase=someTestCase");
        System.out.println("http://localhost:8777/getLog");
        System.out.println("http://localhost:8777/clearLog");


    }


    @Bean
    public EmbeddedServletContainerFactory servletContainer() {

        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();

       // TomcatContextCustomizer contextCustomizer = context -> context.addWelcomeFile("index.gs4tr");
       // factory.addContextCustomizers(contextCustomizer);

        return factory;
    }

}*/
