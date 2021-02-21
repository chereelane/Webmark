package com.zell.webmark;

/*
    This class randomly assigns webmarks containing preinstalled movies, books
    and weblinks to each user
    Prints the information to the screen
 */

import com.zell.webmark.categories.User;
import com.zell.webmark.categories.Webmark;
import com.zell.webmark.managers.UserManager;
import com.zell.webmark.managers.WebmarkManager;

public class Launch {

    // Creates an instance of Users
    private static User[] users;
    private static Webmark[][] webmarks;


    // Loads data from the data store
    private static void loadData() {
        System.out.println("1. Loading data ...");
        DataStore.loadData();

        users = UserManager.getInstance().getUsers();
        webmarks = WebmarkManager.getInstance().getWebmarks();

        System.out.println("Printing data...");

        printUserData();
        printWebmarkData();

    }


    private static void printUserData() {
        for (User user : users){
            System.out.println(user);
        }

    }

    private static void printWebmarkData() {
        for (Webmark[] webmarkList  :webmarks) {
            for (Webmark webmark : webmarkList) {
                System.out.println(webmark);
            }
        }
    }

    private static void startWebmarking() {
        System.out.println("\n2. Webmarking ...");
        for(User user : users) {
            View.webmark(user, webmarks);

        }
    }

    /*-----------------------Main Method---------------------------------------*/
    public static void main(String[] args) {
        loadData();
        startWebmarking();
        
    }



}
