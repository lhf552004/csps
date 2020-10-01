package com.jci.emes.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
@Document(collection = "Equipment" )
public class Equipment {
    @Id
    private UUID id;
    public void setId(UUID id) {
        this.id = id;
    }
}
