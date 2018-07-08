package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfing.class);
        Board board = context.getBean(Board.class);
        List<String> tasks = new ArrayList<>();

        //When
        String task1 = "Task to do";
        String task2 = "Task in progress";
        String task3 = "Task done";
        board.getToDoList().addTask(task1);
        tasks.add((board.getToDoList().getTasks().get(0)));
        board.getInProgressList().addTask(task2);
        tasks.add(board.getInProgressList().getTasks().get(0));
        board.getDoneList().addTask(task3);
        tasks.add(board.getDoneList().getTasks().get(0));

        //Then
        Assert.assertEquals(task1, board.getToDoList().getTasks().get(0));
        Assert.assertEquals(task2, board.getInProgressList().getTasks().get(0));
        Assert.assertEquals(task3, board.getDoneList().getTasks().get(0));

        tasks.stream()
                .forEach(System.out::println);

    }
}
