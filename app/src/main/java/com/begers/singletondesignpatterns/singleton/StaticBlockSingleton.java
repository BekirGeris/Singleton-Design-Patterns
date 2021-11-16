package com.begers.singletondesignpatterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton staticBlockSingleton;

    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getInstance(){
        return staticBlockSingleton;
    }

    public void singletonTest(){
        System.out.println("StaticBlockSingleton metot running");
    }
}
