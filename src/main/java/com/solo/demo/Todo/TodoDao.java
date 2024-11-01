package com.solo.demo.Todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TodoDao {
    
    List<Todo> todos = new ArrayList<>();
    Integer id = 1;
    private Integer autoIncrement() {
        return id++;
    }

    {
        todos.add(new Todo(id, "Learn Spring", "Learn Spring Boot", false));
        todos.add(new Todo(autoIncrement(), "Learn Angular", "Learn Angular 8", false));
        todos.add(new Todo(autoIncrement(), "Learn Java", "Learn Java 8", false));
    }

    public Todo addTask(Todo todo) {
        todo.setId(autoIncrement());
        todos.add(todo);
        return todo;
    }

    public Todo getTodoById(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
    }

    public List<Todo> getAllTodos() {
        return todos;
    }
    
}
