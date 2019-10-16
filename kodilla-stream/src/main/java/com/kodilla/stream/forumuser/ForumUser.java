package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.Stream;

public class ForumUser {

    private int idUser;
    private String userName;
    private char gender;
    private LocalDate birthDate;
    private final int amountOfPublishedPosts;

    public ForumUser(int idUser, String userName, char gender, LocalDate birthDate, int amountOfPublishedPosts) {
        this.idUser = idUser;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.amountOfPublishedPosts = amountOfPublishedPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAmountOfPublishedPosts() {
        return amountOfPublishedPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getIdUser() == forumUser.getIdUser() &&
                getGender() == forumUser.getGender() &&
                getAmountOfPublishedPosts() == forumUser.getAmountOfPublishedPosts() &&
                Objects.equals(getUserName(), forumUser.getUserName()) &&
                Objects.equals(getBirthDate(), forumUser.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdUser(), getUserName(), getGender(), getBirthDate(), getAmountOfPublishedPosts());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", amountOfPublishedPosts=" + amountOfPublishedPosts +
                '}';
    }
}
