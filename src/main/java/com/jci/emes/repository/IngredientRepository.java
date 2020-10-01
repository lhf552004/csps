package com.jci.emes.repository;

import com.jci.emes.models.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface IngredientRepository extends MongoRepository<Ingredient, UUID> {
}
