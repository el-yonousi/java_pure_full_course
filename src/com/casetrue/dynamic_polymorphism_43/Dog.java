package com.casetrue.dynamic_polymorphism_43;

import javax.swing.JOptionPane;

public class Dog extends Animal {
    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "dog goes bark");
    }
}
