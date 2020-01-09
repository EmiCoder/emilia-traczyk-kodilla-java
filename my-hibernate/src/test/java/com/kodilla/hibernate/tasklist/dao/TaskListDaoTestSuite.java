package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private String listName = "ListName";

    @Test
    public void testFindByListName(){
        TaskList taskList = new TaskList(listName, "toysList");
        taskListDao.save(taskList);

        List<TaskList> byListName = taskListDao.findByListName(listName);

        byListName.stream().forEach(list -> Assert.assertEquals(list.getListName(), listName));

        taskListDao.deleteAll();
    }
}
