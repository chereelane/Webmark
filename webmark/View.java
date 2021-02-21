package com.zell.webmark;

/*
    Shows 5 user bookmarks (5 is the max number to show)
    The bookmarks will be randomly selected
 */
import com.zell.webmark.categories.User;
import com.zell.webmark.categories.Webmark;
import com.zell.webmark.controllers.WebmarkController;

public class View {
    public static void webmark(User user, Webmark[][] webmarks){
    System.out.println("\n" + user.getEmail() + "is bookmarking");
    for(int i = 0; i < DataStore.USER_WEBMARK_LIMIT; i++) {

        // Randomly selects a bookmark

        int typeOffset = (int)(Math.random()* DataStore.WEBMARK_TYPES_COUNT);
        int webmarkOffset = (int)(Math.random()* DataStore.WEBMARK_COUNT_PER_TYPE);

        Webmark webmark = webmarks[typeOffset][webmarkOffset];

        WebmarkController.getInstance().saveUserWebmark(user, webmark);

        System.out.println(webmark);
        }
    }
}
