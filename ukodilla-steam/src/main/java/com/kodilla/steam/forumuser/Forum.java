package com.kodilla.steam.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
   private final List<ForumUser> users = new ArrayList<>();

   public Forum () {
       users.add(new ForumUser("Makarov", 001, 'M', 1978, 10, 01, 20));
       users.add(new ForumUser("Jagoda", 002, 'F', 2000, 05, 20, 1));
       users.add(new ForumUser("Robson", 003, 'M', 1998, 03, 17, 0));
       users.add(new ForumUser("Hermenegilda", 004, 'M', 1985, 12, 12, 0));
       users.add(new ForumUser("Cichosza", 005, 'F', 2005, 01, 01, 17));
   }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(users);
       }
}
