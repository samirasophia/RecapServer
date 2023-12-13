package com.example.recapserver;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ToDoService {
private final ToDoRepo repo;
    public List <Task> findAll() {
        return repo.findAll();
    }

    public Task add(Task task) {
        repo.save(task);
        return task;
    }
    public void edit(Task task) {
repo.save(task);
    }
    public Task getter(String id){
        for(Task task :repo.findAll()){
            if (task.getId().equals(id)){
                return task;

            }
        } return null;
    }

    public void deleteById(String id) {
        repo.deleteById(id);
    }
}
