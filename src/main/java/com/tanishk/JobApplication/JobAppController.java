package com.tanishk.JobApplication;

import com.tanishk.JobApplication.model.JobPost;
import com.tanishk.JobApplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobAppController {

    @Autowired
    private JobService jobService ;

    @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }


    // Controller taking to -> Service is talking to -> Repo Layer

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }
    // Learning this

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }
    @GetMapping("viewalljobs")
    // How jsp receive the data . Not directly we have to use the Model
    // And add that data in model as m.addAttribute as (jobPosts) it means that JSP is now
    // access the data in with the name jobPosts.
    public String viewJobs(Model m){
        List<JobPost> jobPostList = jobService.getAllJobs();
        m.addAttribute("jobPosts", jobPostList);
        return "viewalljobs";
    }
}
