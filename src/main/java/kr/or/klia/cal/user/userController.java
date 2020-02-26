package kr.or.klia.cal.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    @Autowired


    @GetMapping("/user")
    public String user(){
        return "/user/userInfo";
    }
}

