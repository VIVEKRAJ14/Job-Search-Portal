package com.example.Job.Search.Portal.controller;

import com.example.Job.Search.Portal.model.Job;
import com.example.Job.Search.Portal.model.JobType;
import com.example.Job.Search.Portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/job")
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping(value = "/InbuildMethod/add")
    public String addUsingInbuildtMethod(@Valid @RequestBody List<Job> job)
    {
        return jobService.addUsingInbuildtMethod(job);
    }

    @GetMapping(value = "/InbuildMethod/get")
    public Iterable<Job> getUsingInbuildtMethod()
    {
        return jobService.getUsingInbuildMethod();
    }


    @DeleteMapping(value = "/InbuildMethod/{id}")
    public void deleteJobById(@PathVariable Long id)
    {
        jobService.removeJobById(id);
    }


    @GetMapping(value = "/customFinder/all/{title}")
    public List<Job> getallUsingCustomFinder(@PathVariable String title){
        return jobService.getallUsingCustomFinder(title);
    }

    @GetMapping(value = "/customFinder/salary/{salary}")
    public List<Job> getBySalary(@PathVariable Double salary){
        return jobService.getBySalary(salary);
    }

    @GetMapping(value = "/customFinder/jobType/{jobType}/salary/{Salary}")
    public List<Job> JobTypeAndSalaryGreaterThan(@PathVariable JobType jobType,@PathVariable Double Salary){
       return jobService.JobTypeAndSalaryGreaterThan(jobType,Salary);
    }


    @GetMapping(value = "/JobSort")
    public List<Job> getOrderedJobs()
    {
        return jobService.getAllJobSorted();
    }

    @GetMapping(value = "/searchByTitle/{title}")
    public List<Job> searchBy(@PathVariable String title){
       return jobService.searchBy(title);
    }

    @PutMapping(value = "/update/id/{id}/salary/{salary}")
    public void updateSalary(@PathVariable Long id,@PathVariable Double salary){
        jobService.updateSalary(id,salary);
    }

    @DeleteMapping(value = "/delete/salary/{salary}")
    public void deleteLowSalary(@PathVariable Double salary){
        jobService.deleteLowSalary(salary);
    }
}