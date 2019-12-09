package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList getToDoList = (TaskList) context.getBean("getToDoList");
        String[] toDo = new String[]{"shopping", "homework"};
        IntStream.range(0, getToDoList.tasks.size()).forEach(i -> Assert.assertEquals(toDo[i], getToDoList.tasks.get(i)));

        TaskList getInProgressList = (TaskList) context.getBean("getInProgressList");
        String[] inProgress = new String[] {"project", "holiday's spots searching"};
        IntStream.range(0, getInProgressList.tasks.size())
                .forEach(i -> Assert.assertEquals(inProgress[i], getInProgressList.tasks.get(i)));


        TaskList getDoneList = (TaskList) context.getBean("getDoneList");
        String[] doneList = new String[] {"hotel", "party"};
        IntStream.range(0, getDoneList.tasks.size()).forEach(i -> Assert.assertEquals(doneList[i], getDoneList.tasks.get(i)));
    }
}
