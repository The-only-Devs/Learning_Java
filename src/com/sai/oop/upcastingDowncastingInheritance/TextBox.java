package com.sai.oop.upcastingDowncastingInheritance;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox(){
    }

    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
}
