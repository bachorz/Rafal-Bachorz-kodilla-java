package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TaskQueue implements ObservableStudent {

    private final List<ObserverMentor> observerMentors;
    private final Queue<Task> tasks;
    private final String studentName;


    public TaskQueue(String studentName) {
        tasks = new ArrayDeque<>();
        observerMentors = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTaskToVerification (Task task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverMentor observerMentor) {
        observerMentors.add(observerMentor);
    }

    @Override
    public void notifyObservers() {
        for (ObserverMentor observerMentor: observerMentors) {
            observerMentor.updateTask(this);
        }
    }

    @Override
    public void removeObserver(ObserverMentor observerMentor) {
        observerMentors.remove(observerMentor);
    }

    public List<ObserverMentor> getObserverMentors() {
        return observerMentors;
    }

    public Queue<Task> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
