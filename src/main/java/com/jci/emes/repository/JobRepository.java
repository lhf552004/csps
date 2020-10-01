package com.jci.emes.repository;

import com.jci.emes.models.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface JobRepository extends MongoRepository<Job, UUID> {
}
