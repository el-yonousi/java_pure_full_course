package com.casetrue.dynamic_polymorphism_43;

import javax.swing.JOptionPane;

public class Cat extends Animal {
    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "cat goes meow");
    }
}
