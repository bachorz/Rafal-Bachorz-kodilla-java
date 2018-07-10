package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private Map<String, String> taskCompleted = new HashMap<>();

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public Map<String, String> executeTask() {

        taskCompleted.put(taskName, whatToPaint);

        return taskCompleted;
    }


    @Override
    public boolean isTaskExecuted () {

        for (Map.Entry<String, String> entry : taskCompleted.entrySet()) {
            if (entry.getKey().equals(getTaskName())) {
                return true;
            }
        }
        return false;
    }
}
