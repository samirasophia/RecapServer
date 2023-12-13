package com.example.recapserver;

import lombok.With;
import org.bson.types.ObjectId;

import java.util.UUID;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ToDo")

public class Task  {
    String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String description;
    String status;

    public Task( String description, String status) {
        this.description = description;
        this.status = status;
    }
    public Task (){
    }
}
