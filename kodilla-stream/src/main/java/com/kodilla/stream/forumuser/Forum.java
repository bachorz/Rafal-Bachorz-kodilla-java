package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;


public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum (){
        userList.add(new ForumUser(00,"Zenon",'M',2000, 11, 22, 01));
        userList.add(new ForumUser(01,"Staszek",'M',1952, 10, 1, 12));
        userList.add(new ForumUser(02,"Pelagia",'W',1900, 01, 03, 02));
        userList.add(new ForumUser(03,"Genowefa",'W',2012, 05, 22, 0));
        userList.add(new ForumUser(04,"Dionizy",'M',1983, 06, 22, 100));
        userList.add(new ForumUser(05,"Alfred",'M',1815, 05, 22, 13));
        userList.add(new ForumUser(06,"Matylda",'W',2015, 07, 22, 04));
        userList.add(new ForumUser(07,"Hermenegilda",'W',1977, 03, 01, 1000));
    }

    public List<ForumUser> getUserList (){

        return new ArrayList<>(userList);
    }
}
