package com.jci.emes.repository;

import com.jci.emes.models.Equipment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface EquipmentRepository extends MongoRepository<Equipment, UUID> {
}
