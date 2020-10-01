package com.jci.emes.repository;

import com.jci.emes.models.Bom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface BomRepository extends MongoRepository<Bom, UUID> {
}
