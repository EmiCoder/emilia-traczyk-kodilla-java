package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> list = new ArrayList<>();

    public Forum() {
        list.add(new ForumUser(1, "Ala", 'F', LocalDate.of(2010,12,24),
                                46));
        list.add(new ForumUser(2, "Franek", 'M', LocalDate.of(2012,02,12),
                2));
        list.add(new ForumUser(1, "Roman", 'M', LocalDate.of(1980,10,12),
                12));
        list.add(new ForumUser(1, "Antonina", 'F', LocalDate.of(2002,01,14),
                189));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(list);
    }
}
