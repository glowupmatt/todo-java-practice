package com.solo.demo.Todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private TodoDao service;


    @PostMapping("/addTask")
    public ResponseEntity<Todo> addTask(@RequestBody Todo todo) {
        Todo savedTodo = service.addTask(todo);
        return ResponseEntity.ok(savedTodo);
    }

    @GetMapping("/getTask/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable int id) {
        Todo todo = service.getTodoById(id);
        return ResponseEntity.ok(todo);
    }

    @GetMapping("/getAllTasks")
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> todos = service.getAllTodos();
        return ResponseEntity.ok(todos);
    }

}
