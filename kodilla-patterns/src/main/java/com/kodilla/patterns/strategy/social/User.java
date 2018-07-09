package com.kodilla.patterns.strategy.social;

public class User {

    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getNameUser() {
        return userName;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void sharePublisher (SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
