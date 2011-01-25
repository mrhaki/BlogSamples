package com.mrhaki.app.services;

import java.util.ArrayList;
import java.util.List;

import com.mrhaki.app.domain.User;

public class UserServiceImpl implements UserService {

    public String findUsername(String name) {
        List<User> users = new ArrayList<User>();
        users.add(new User("Hubert A. Klein Ikkink", "mrhaki"));
        
        String foundUsername = "";
        for (User user: users) {
            if (user.getName().equals(name)) {
                foundUsername = user.getUsername();
                break;
            }
        }
        
        return foundUsername;
    }

}
