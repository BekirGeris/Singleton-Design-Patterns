package com.begers.singletondesignpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelpar.INSTANCE;
    }

    private static class SingletonHelpar {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void singletonTest(){
        System.out.println("BillPughSingleton metot running");
    }
}
