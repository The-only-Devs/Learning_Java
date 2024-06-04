package com.sai.oop.interfaceExample;

public class CustomCar {
    private Engine engine;
    private Engine powerEngine = new PowerEngine();
    private Engine electricEngine = new ElectircEngine();
    private Media music = new CDPlayer();

    CustomCar(){
        this.engine = powerEngine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.accelerate();
    }
    public void changeEngine(){
        if(engine instanceof PowerEngine){
            engine = electricEngine;
            System.out.println("Engine changed to ELECTRIC ENGINE");
        }
        else if(engine instanceof ElectircEngine){
            engine = powerEngine;
            System.out.println("Engine changed to POWER ENGINE");
        }
    }

    public void startMusic(){
        music.start();
    }
    public void stopMusic(){
        music.stop();
    }
}
