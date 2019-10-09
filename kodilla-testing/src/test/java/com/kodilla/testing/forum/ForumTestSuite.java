package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {

    @Before
    public void before(){
        System.out.println(" BEFOR: Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("AFTER: Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BEFERCLASS: Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AFTERCLASS: Test Suite: end");
    }

    @Test
    public void testCaseUsername(){
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        System.out.println("Testing " + simpleUser.getUsername());
        Assert.assertEquals("theForumUser", simpleUser.getUsername());
    }
    @Test
    public void testCaseRealName(){
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        System.out.println("Testing " + simpleUser.getRealName());
        Assert.assertEquals("John Smith", simpleUser.getRealName());
    }
}
