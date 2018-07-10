package com.kodilla.patterns.factory.tasks;

import java.util.Map;

public interface Task {

    Map<String, String> executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
