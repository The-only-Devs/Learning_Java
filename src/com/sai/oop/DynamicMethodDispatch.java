package com.sai.oop;

class Phone{
    void pressButton(){
        System.out.println("Button is pressed");
    }

    void on(){
        System.out.println("Phone is on!!");
    }
}

class SmartPhone extends Phone{
    void touchScreen(){
        System.out.println("TouchScreen is enabled");
    }

    void on(){
        System.out.println("SmartPhone is on!!");
    }
}

class ModernPhone extends SmartPhone{
    void voiceCommand(){
        System.out.println("Your command is completed successfully");
    }

    void on(){
        System.out.println("ModernPhone is on!!");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone(); //Allowed
        obj.pressButton(); //Alllowed
        obj.on(); // Overrriden version of the run time object is called/executed. (This is called Dynamic Method Dispatch)
//        (Since the object is created at run-time and method shows a polymorphic behaviour,
//         hence it is called as Run Time Polymorphism)
//        obj.touchScreen(); //Not Allowed

//        SmartPhone obj = new Phone(); //Not Allowed
    }
}
