package com.casetrue.access_modifier_38.package_2;

import com.casetrue.access_modifier_38.package_1.A;

public class Asub extends A {
    public static void main(String[] args) {
        /**
         * Modifier     Class   Package     Subclass    World
         * publlic      yes     yes         yes         yes
         * protected    yes     yes         yes         no
         * no midifier  yes     yes         no          no
         * private      yes     no          no          no
         */

        C c = new C();

        //System.out.println(c.no_deString); // no access modifier
        System.out.println(c.p_deString);
    }
}
