package com.tanishk.JobApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobAppController {

    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob(){
        return "addjob";
    }
    // Learning this

    @RequestMapping("handleForm")
    public String handleForm(){
        return "success";
    }
}
