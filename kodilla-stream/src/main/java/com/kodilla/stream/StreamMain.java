package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.UniqueBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.Year;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

//        Forum forum = new Forum();
//        Map<Integer, ForumUser> mapOfForumUsers = forum.getUserList().stream().filter(forumUser -> forumUser.getGender() == 'M')
//                                                    .filter(forumUser -> (Year.now().getValue() - forumUser.getBirthDate().getYear()) >= 20)
//                                                    .filter(forumUser -> forumUser.getAmountOfPublishedPosts() >= 1)
//                                                    .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));
//
//        mapOfForumUsers.entrySet().stream()
//                                  .map(entry -> entry.getKey() + ": " + entry.getValue())
//                                  .forEach(System.out::println);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("mama i tata", String::toUpperCase));
        System.out.println(poemBeautifier.beautify("wielkość liter", textToBeautify -> textToBeautify.toUpperCase()));
        System.out.println(poemBeautifier.beautify("kolejneliteryosobno", UniqueBeautifier::separate));
        System.out.println(poemBeautifier.beautify("wakacje", UniqueBeautifier::changeBeginningEnd));
    }
}
