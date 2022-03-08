package com.casetrue.super_keyword_36;

public class Main {
    public static void main(String[] args) {
        /**
         * super = keyword refer to the superclass (parent) of an object
         * very similar to the "this" keyword
         */

        Hero hero = new Hero("Batman", 42, "$$$");

        System.out.println(hero.toString());
    }
}
