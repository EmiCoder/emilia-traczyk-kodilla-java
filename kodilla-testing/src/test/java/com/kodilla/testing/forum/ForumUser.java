package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {

    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        ForumPost thePost = new ForumPost(postBody, author);
        this.posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody){
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        this.comments.add(theComment);
    }

    public int getPostsQuantity(){
        return this.posts.size();
    }

    public int getCommentsQuantity(){
        return this.comments.size();
    }

    public ForumPost getPost(int postNumber){
        return (postNumber >= 0 && postNumber < posts.size()) ? posts.get(postNumber) : null;
    }

    public ForumComment getComment(int commentNumber){
        return (commentNumber >= 0 && commentNumber < comments.size()) ? comments.get(commentNumber) : null;
    }

    public boolean removePost(ForumPost thePost){
        boolean result = false;
        if (posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment){
        boolean result = false;
        if (comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

}
