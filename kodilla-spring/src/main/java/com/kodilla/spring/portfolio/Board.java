package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public final class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList=toDoList;
        this.inProgressList=inProgressList;
        this.doneList=doneList;
    }

    public Board() {

    }

    public void printTheTaskList(TaskList list) {
        Stream.of(list).forEach(System.out::println);
    }
}
