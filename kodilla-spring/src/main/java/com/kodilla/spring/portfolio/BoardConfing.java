package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfing {

    @Bean("to do  list")
    public TaskList getToDoList(){
        return new TaskList();
    }

    @Bean("in progress list")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean("done list")
    public TaskList getDoneList(){
        return new TaskList();
    }

    @Bean
    public Board getBoard(){
        return new Board(getToDoList(),getInProgressList(),getDoneList());
    }
}
