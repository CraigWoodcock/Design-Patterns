package com.sparta.cw.singleton;

public class SingletonExample {
    private static SingletonExample example = new SingletonExample();
    private SingletonExample() {
    }

    public static SingletonExample getSingleton() {
        if (example==null){
            example = new SingletonExample();
        }
        return example;
    }
}