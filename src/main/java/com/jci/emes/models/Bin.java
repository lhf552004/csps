package com.jci.emes.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;
@Document(collection = "Bin" )
public class Bin {
    @Id
    private UUID id;
    public void setId(UUID id) {
        this.id = id;
    }
}
