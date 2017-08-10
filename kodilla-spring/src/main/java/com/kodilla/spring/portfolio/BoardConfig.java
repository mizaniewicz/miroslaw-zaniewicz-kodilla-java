package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Bean
    public TaskList taskList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public Board toDoList() {
        return new Board();
    }

    @Bean
    @Scope("prototype")
    public Board inProgressList() {
        return new Board();
    }

    @Bean
    @Scope("prototype")
    public Board doneList() {
        return new Board();
    }
}
