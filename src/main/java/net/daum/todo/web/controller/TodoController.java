package net.daum.todo.web.controller;

import net.daum.todo.domain.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class TodoController {
    private final TodoService todoService;
    private final MessageSource messageSource;


    @Autowired
    public TodoController(MessageSource messageSource, TodoService todoService) {
        this.messageSource = messageSource;
        this.todoService = todoService;
    }
}
