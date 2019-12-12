package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTaskFactory() {
        TaskFactory factory = new TaskFactory();
        Task task = factory.makeTask(TaskFactory.SHOPPING);
        task.executeTask();
        Assert.assertEquals("buy", task.getTaskName());
        Assert.assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testPaintingTaskFactory() {
        TaskFactory factory = new TaskFactory();
        Task task = factory.makeTask(TaskFactory.PAINTING);
        task.executeTask();
        Assert.assertEquals("paint", task.getTaskName());
        Assert.assertEquals(printTheTask(), task.executeTask());
        Assert.assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testDrivingTaskFactory() {
        TaskFactory factory = new TaskFactory();
        Task task = factory.makeTask(TaskFactory.DRIVING);
        task.executeTask();
        Assert.assertEquals("drive", task.getTaskName());
        Assert.assertEquals(true, task.isTaskExecuted());
    }

    private String printTheTask() {
        return "paint is executing. " + "\n" +
                "Color: pink" + "\n" +
                "What to paint: portrait";
    }
}
