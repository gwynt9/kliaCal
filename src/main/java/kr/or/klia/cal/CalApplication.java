package kr.or.klia.cal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalApplication.class, args);
        System.out.println("init");
    }

}
