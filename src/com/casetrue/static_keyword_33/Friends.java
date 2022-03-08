package com.casetrue.static_keyword_33;

public class Friends {
    String name;
    static int numberOfFriends;

    Friends(String name) {
        this.name = name;

        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
