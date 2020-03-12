package kr.or.klia.cal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalApplication.class, args);
        System.out.println("init");
    }

    //todo: 일정추가, 수정, 삭제
    //todo: 일정조회(개인별,부서별|일간,주간,월간)
    //todo: 담당자조회(이름, 업무, 회사)

}
