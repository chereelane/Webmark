package com.zell.webmark.dao;

/*
    Fetches data from the data store class
 */



import com.zell.webmark.DataStore;
import com.zell.webmark.categories.User;


public class UserDao {
    public User[] getUsers() {
        return DataStore.getUsers();
    }
}
