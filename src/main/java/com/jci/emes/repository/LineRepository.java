package com.jci.emes.repository;

import com.jci.emes.models.Line;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface LineRepository extends MongoRepository<Line, UUID> {
}
