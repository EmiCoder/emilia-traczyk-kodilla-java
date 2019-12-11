package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void assignLog() {
        Logger.getInstance().log("Snoopy");
    }

    @Test
    public void testLastLog() {
        String lastLog = Logger.getInstance().getLastLog();
        Assert.assertEquals("Snoopy", lastLog);
    }
}
