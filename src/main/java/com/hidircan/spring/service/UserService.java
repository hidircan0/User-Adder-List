package com.hidircan.spring.service;

import com.hidircan.spring.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        User first=(new User(1, "Hıdırcan Aslan",138486L));
        users.add(first);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
    	int index = users.size() + 1;
    	user.setIndex(index);
    	users.add(user);
    }
    public void deleteById(long id) {
        users.removeIf(u -> u.getId() == id);
    }

}
