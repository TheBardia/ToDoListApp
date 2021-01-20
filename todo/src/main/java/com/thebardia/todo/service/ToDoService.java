package com.thebardia.todo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ToDoService implements ToDoServiceInterface{

    @Override
    public Collection<String> getToDoList() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Wash dishes");

        return list;
    }
}
