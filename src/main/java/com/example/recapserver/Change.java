package com.example.recapserver;

import java.util.UUID;

public class Change {

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

    public Change( String description, String status) {
        this.description = description;
        this.status = status;
    }

    public void undo() {
    }
}
