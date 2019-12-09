package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(@Qualifier("getToDoList") TaskList toDoList,
                 @Qualifier("getInProgressList") TaskList inProgressList,
                 @Qualifier("getDoneList") TaskList doneList) {
        this.toDoList=toDoList;
        this.inProgressList=inProgressList;
        this.doneList=doneList;
    }


    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

}
