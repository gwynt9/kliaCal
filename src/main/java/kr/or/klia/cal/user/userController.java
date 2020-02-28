package kr.or.klia.cal.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController{

    @Autowired
    public userController(userService userService) {
        userService.getName();
    }

    @GetMapping("/user")
    public ModelAndView user(ModelAndView mav){
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("user",userService.getName());
        mav.addObject("name","jhw");
        mav.setViewName("/user/user");

        return mav;
    }
}

