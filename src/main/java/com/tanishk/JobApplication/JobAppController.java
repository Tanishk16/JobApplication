package com.tanishk.JobApplication;

import com.tanishk.JobApplication.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobAppController {

    @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }
    // Learning this

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }
}
