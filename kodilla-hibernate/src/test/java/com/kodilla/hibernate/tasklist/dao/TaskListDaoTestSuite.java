package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "First test";
    private static final String DESCRIPTION = "We test entering data into the database";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readLists = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readLists.size());
        Assert.assertEquals("First test", readLists.get(0).getListName());

        //CleanUp
        int id = readLists.get(0).getId();
        taskListDao.delete(id);

    }

}
