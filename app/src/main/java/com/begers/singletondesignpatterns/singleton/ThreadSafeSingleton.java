package com.begers.singletondesignpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    public ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if (threadSafeSingleton == null){
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    public void singletonTest(){
        System.out.println("ThreadSafeSingleton metot running");
    }
}
