package com.jci.emes.repository;

import com.jci.emes.models.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface WarehouseRepository extends MongoRepository<Warehouse, UUID> {
}
