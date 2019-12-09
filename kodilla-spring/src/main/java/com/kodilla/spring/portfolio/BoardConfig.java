package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("getToDoList")
    TaskList taskList;

    @Bean
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean(name = "getToDoList")
    public TaskList getToDoList() {
        TaskList list = new TaskList();
        list.tasks.add("shopping");
        list.tasks.add("homework");
        return list;
    }

    @Bean(name = "getInProgressList")
    public TaskList getInProgressList() {
        TaskList list = new TaskList();
        list.tasks.add("project");
        list.tasks.add("holiday's spots searching");
        return list;
    }

    @Bean(name = "getDoneList" )
    public TaskList getDoneList() {
        TaskList list = new TaskList();
        list.tasks.add("hotel");
        list.tasks.add("party");
        return list;
    }

}
