package com.jci.emes.repository;

import com.jci.emes.models.LogisticUnit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface LogisticUnitRepository extends MongoRepository<LogisticUnit, UUID> {
}
