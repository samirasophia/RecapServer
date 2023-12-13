package com.example.recapserver;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Stack;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {
  /*  private final UndoService uService;*/

    private static Stack<Change> changes = new Stack<>();

        @PostMapping("/undo")
        public String undo() {
            if (changes.isEmpty()) {
                return "No changes to undo";
            } else {
                Change lastChange = changes.pop();
                lastChange.undo();
                return "Change undone";
            }
        }
/*
    @PostMapping("/undo")
    public ResponseEntity<String> undoLastChange() {
        boolean undone = uService.undoLastChange();

        if (undone) {
            return ResponseEntity.ok("Last change undone successfully");
        } else {
            return ResponseEntity.badRequest().body("No change to undo");
        }
    }*/

    private final ToDoService service;
    @GetMapping ("/todo")
    public List<Task> get (){
        return service.findAll();
    }
    @PostMapping("/todo")
    public void add (@RequestBody Task task){
        service.add(task);
    }
    @GetMapping("/todo/{id}")
    public Task getter (@PathVariable String id){
       return service.getter(id);
    }

    @PutMapping ("/todo/{id}")
    public void edit (@PathVariable String id, @RequestBody Task task){
       service.edit(task);
    }
    /*@DeleteMapping ("/todo/{id}")
    public void delete (@PathVariable String id, @RequestBody Task task){
        service.deleteById(task);
    } */
    @DeleteMapping("/todo/{id}")
    public void delete(@PathVariable String id)
    {
        service.deleteById(id); }
    @PostMapping("/meow")
    public void makeChange (@RequestBody Task task){

    }
}

