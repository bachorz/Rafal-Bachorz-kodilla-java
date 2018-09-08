package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverMentor {

    private final String mentorName;
    private int updateCount;

    public Mentor (String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void updateTask(TaskQueue taskQueue) {
        System.out.println(mentorName + ": New task to verification " + taskQueue.getTasks()
                + "\n" + " (total: " + taskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
