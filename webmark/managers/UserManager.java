package com.zell.webmark.managers;

import com.zell.webmark.categories.User;
import com.zell.webmark.dao.UserDao;

/*
 * Manages User information
 */
public class UserManager {
    private static UserManager instance = new UserManager();
    private static UserDao dao = new UserDao(); // Creates an instance of the user dao

    private UserManager(){ }

    public  static UserManager getInstance(){
        return instance;
    }

    // creates an instance of user
    public User createUser(long id, String email, String password, String firstName,
                           String lastName, int gender, String userType){
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);

        return user;

    }

    public User[] getUsers(){
        return dao.getUsers();
    }
}
