package com.jci.emes.repository;

import com.jci.emes.models.CspsDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface DocumentRepository extends MongoRepository<CspsDocument, UUID> {
}
