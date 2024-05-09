package com.sai.oop.polymorphism;

import java.lang.Override;
import com.sai.oop.upcastingDowncastingInheritance.UIControl;

public class RadioButton extends UIControl {
    @Override
    public void render(){
        System.out.println("Rendering RadioButton...");
    }
}
