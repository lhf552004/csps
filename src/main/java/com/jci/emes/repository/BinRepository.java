package com.jci.emes.repository;

import com.jci.emes.models.Bin;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface BinRepository extends MongoRepository<Bin, UUID> {
}
