package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){

        //Given
        User zenek = new Millenials("Zenek Black");
        User stefan = new YGeneration("Stefan Yellow");
        User mirek = new ZGeneration("Miroslaw Pink");

        //When
        String zenekShare = zenek.sharePost();
        System.out.println("Zenka's favorite social networking site is: " + zenekShare);

        String stefanShare = stefan.sharePost();
        System.out.println("Stefan's favorite social networking site is: " + stefanShare);

        String mirekShare = mirek.sharePost();
        System.out.println("Mirek's favorite social networking site is: " + mirekShare);

        //Then
        Assert.assertEquals("Twitter",zenek.sharePost());
        Assert.assertEquals("Facebook",stefan.sharePost());
        Assert.assertEquals("Snapchat", mirek.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy(){

        //Given
        User stefan = new YGeneration("Stefan Yellow");

        //When
        String stefanShare = stefan.sharePost();
        System.out.println("Stefan's favorite social networking site is: " + stefanShare);
        stefan.sharePublisher(new SnapchatPublisher());
        stefanShare = stefan.sharePost();
        System.out.println("Stefan changed his favorite social network to: " +  stefanShare);

        //Then
        Assert.assertEquals("Snapchat", stefan.sharePost());
    }
}
