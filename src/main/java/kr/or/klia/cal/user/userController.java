package kr.or.klia.cal.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController{

    @GetMapping("/user/")
    public ModelAndView user(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("name","jhw");
        mav.setViewName("/user/user");

        return mav;
    }
}

