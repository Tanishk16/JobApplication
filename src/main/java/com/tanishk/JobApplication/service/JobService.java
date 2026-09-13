package com.tanishk.JobApplication.service;

import com.tanishk.JobApplication.model.JobPost;
import com.tanishk.JobApplication.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {

     @Autowired
     private JobRepo repo;

     // JobPost is a DTO (Data Transfer Object) which is a object which is transferred from one layer to another without
     // Containing any business logics.
     public void addJob(JobPost jobPost){
          repo.addJob(jobPost);
     }

     public List<JobPost> getAllJobs(){
          return repo.getAllJobs();
     }
}
