package com.begers.singletondesignpatterns.singleton;

public class Run {
    public static void main(String[] args){
        EagerInitializationSingleton.getInstance().singletonTest();

        StaticBlockSingleton.getInstance().singletonTest();
    }
}
