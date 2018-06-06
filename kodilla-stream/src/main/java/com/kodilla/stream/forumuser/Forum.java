package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;


public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum (){
        userList.add(new ForumUser(0,"Zenon",'M',2000, 11, 22, 1));
        userList.add(new ForumUser(1,"Staszek",'M',1952, 10, 1, 12));
        userList.add(new ForumUser(2,"Pelagia",'W',1900, 01, 03, 2));
        userList.add(new ForumUser(3,"Genowefa",'W',2012, 05, 22, 0));
        userList.add(new ForumUser(4,"Dionizy",'M',1983, 06, 22, 100));
        userList.add(new ForumUser(5,"Alfred",'M',1815, 05, 22, 13));
        userList.add(new ForumUser(6,"Matylda",'W',2015, 07, 22, 4));
        userList.add(new ForumUser(7,"Hermenegilda",'W',1977, 03, 01, 1000));
    }

    public List<ForumUser> getUserList (){

        return new ArrayList<>(userList);
    }
}
