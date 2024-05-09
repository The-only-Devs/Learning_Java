package com.sai.oop.polymorphism;

import java.lang.Override;
import com.sai.oop.upcastingDowncastingInheritance.UIControl;

public class CheckBox extends UIControl {
    @Override
    public void render(){
        System.out.println("Rendering CheckBox...");
    }
}
