package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private Map<String, String> taskCompleted = new HashMap<>();

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName(){
        return taskName;
    }

    @Override
    public Map<String, String> executeTask() {

        taskCompleted.put(taskName, whatToBuy);

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
