package com.sai.oop.upcastingDowncastingInheritance;

public class UIControl {
    private boolean isEnable = true;

    public void enable(boolean flag){
        this.isEnable = flag;
    }

    public void disable(boolean flag){
        this.isEnable = flag;
    }

    public boolean getIsEnable(){
        return this.isEnable;
    }

    public void render(){
        System.out.println("Rendering Component...");
    }
}
