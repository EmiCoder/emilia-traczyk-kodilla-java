package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        User user1 = new Millenials("Beatrice");
        User user2 = new YGeneration("John");

        SocialPublisher socialPublisherOfUser1 = user1.socialPublisher;
        SocialPublisher socialPublisherOfUser2 = user2.socialPublisher;

        Assert.assertEquals("Facebook", socialPublisherOfUser1.share());
        Assert.assertEquals("Snapchat", socialPublisherOfUser2.share());
    }

    @Test
    public void testIndividualSharingStrategy() {
        User user = new ZGeneration("Blanca");
        System.out.println("SocialPublisher of " + user.getUserName() + " is " + user.socialPublisher.share());

        user.setSocialPublisher(new FacebookPublisher());
        System.out.println("SocialPublisher of " + user.getUserName() + " is " + user.socialPublisher.share());
    }
}
