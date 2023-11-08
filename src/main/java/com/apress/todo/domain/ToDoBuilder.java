package com.apress.todo.domain;

public class ToDoBuilder {
    private static final ToDoBuilder instance = new ToDoBuilder();

    private String id = null;
    private String description = "";

    public static ToDoBuilder create() {
        return instance;
    }

    public ToDoBuilder withDescription(String description) {
        this.description = description;

        return instance;
    }

    public ToDoBuilder withId(String id) {
        this.id = id;

        return instance;
    }

    public ToDo build() {
        ToDo result = new ToDo();
        result.setId(id);
        result.setDescription(description);

        return result;
    }
}
