package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private Map<String, String> taskCompleted = new HashMap<>();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName(){
        return taskName;
    }

    @Override
    public Map<String, String> executeTask() {

        taskCompleted.put(taskName, where);

        return taskCompleted;
    }

    @Override
    public boolean isTaskExecuted () {

       return taskCompleted.entrySet()
                .stream()
                .anyMatch(e -> e.getKey().equals(getTaskName()));
    }

}
