package com.jci.emes.api;

import com.jci.emes.models.CspsDocument;
import com.jci.emes.models.Job;
import com.jci.emes.repository.DocumentRepository;
import com.jci.emes.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/jobs")
@RestController
public class JobsController {

    private JobRepository jobRepository;

    public JobsController(@Autowired JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @PostMapping
    public void createJob(@RequestBody Job job){
        job.setId(UUID.randomUUID());
        jobRepository.insert(job);
    }

    @GetMapping
    public ResponseEntity<?> getJobs() {
        return ResponseEntity.ok(jobRepository.findAll());
    }

    @GetMapping(path = "{id}")
    public Optional<Job> getJob(@PathVariable UUID id){
        return jobRepository.findById(id);
    }

    @PutMapping(path = "{id}")
    public void updateJob(@PathVariable UUID id, @RequestBody Job job){
        jobRepository.save(job);
    }

    @DeleteMapping(path = "{id}")
    public void deleteJob(@PathVariable UUID id){
        jobRepository.deleteById(id);
    }
}
