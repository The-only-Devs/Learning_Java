package com.sai.oop.interfaceExample;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.start();
//        c.stop(); //We can not decide to call the method of Media or Engine. Hence, we implement their class

        CustomCar c = new CustomCar();
        c.start();
        c.accelerate();
        c.startMusic();
        c.stopMusic();
        c.changeEngine();
    }
}
