package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdateTask () {

        //Given
        TaskQueue zenon = new TaskQueue("Zenon Krawczyk");
        TaskQueue franek = new TaskQueue("Franciszek Wazny");
        TaskQueue zbyszek = new TaskQueue("Zbyszek Jakis");
        TaskQueue mariola = new TaskQueue("Mariola Duda");

        Mentor kowalski = new Mentor("Kowalski");
        Mentor nowak = new Mentor ("Nowak");

        zenon.registerObserver(kowalski);
        franek.registerObserver(kowalski);
        zbyszek.registerObserver(nowak);
        mariola.registerObserver(nowak);

        //When
        zenon.addTaskToVerification(new Task(14.1, "Task sent to the repository"));
        franek.addTaskToVerification(new Task(13.4,":)"));
        zbyszek.addTaskToVerification(new Task(13.3,"Small problem"));
        mariola.addTaskToVerification(new Task(11.1,"Task to verification"));
        franek.addTaskToVerification(new Task(14.1,"easy"));

        //Then
        assertEquals(3, kowalski.getUpdateCount());
        assertEquals(2, nowak.getUpdateCount());
    }
}
