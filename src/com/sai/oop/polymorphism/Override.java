package com.sai.oop.polymorphism;

import com.sai.oop.upcastingDowncastingInheritance.UIControl;
import com.sai.oop.upcastingDowncastingInheritance.TextBox;

public class Override {
    public static void main(String[] args) {
        UIControl[] components = {new TextBox(), new CheckBox(), new RadioButton()};

        for(var component: components){
            component.render();
        }
    }
}
