package com.gradle.tasks.todo.repository;

import com.gradle.tasks.todo.model.ToDoItem;

import java.util.List;

public class InMemoryToDoRepository implements ToDoRepository {
    @Override
    public List<ToDoItem> findAll() {
        return null;
    }

    @Override
    public ToDoItem findById(Long id) {
        return null;
    }

    @Override
    public Long insert(ToDoItem toDoItem) {
        return null;
    }

    @Override
    public void update(ToDoItem toDoItem) {

    }

    @Override
    public void delete(ToDoItem toDoItem) {

    }
}
