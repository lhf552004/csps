package com.jci.csps.repository;

import com.jci.csps.models.CspsDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface DocumentRepository extends MongoRepository<CspsDocument, UUID> {
}
