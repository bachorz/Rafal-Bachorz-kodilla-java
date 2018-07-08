package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTestSuite {

    @Before
    public void log(){
        Logger.getInstance().log("2018-07-08, change user settings");
    }

    @Test
    public void testGetLastLog(){

        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last record: " + lastLog);
        //Then
        Assert.assertEquals("2018-07-08, change user settings", lastLog);
    }
}
