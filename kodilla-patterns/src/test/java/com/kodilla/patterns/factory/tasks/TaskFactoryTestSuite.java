package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {


    @Test
    public void testFactoryDriving (){

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("Long journey", drivingTask.getTaskName());
        Assert.assertFalse(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting () {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        drivingTask.executeTask();

        //Then
        Assert.assertEquals("Painting with coal", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping () {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        drivingTask.executeTask();

        //Then
        Assert.assertEquals("Big shopping", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

}
