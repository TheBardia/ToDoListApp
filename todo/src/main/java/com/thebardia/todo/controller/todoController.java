package com.thebardia.todo.controller;

import com.thebardia.todo.service.ToDoServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class todoController {

    private ToDoServiceInterface toDoService;

    public todoController(ToDoServiceInterface toDoService) {
        this.toDoService = toDoService;
    }

    // mapping a directory of port 8081 to a function
    @GetMapping ("/")
    public Collection<String> getName() {
        return this.toDoService.getToDoList();
    }
}