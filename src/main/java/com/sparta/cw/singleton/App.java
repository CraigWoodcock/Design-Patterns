package com.sparta.cw.singleton;

public class App {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getSingleton();
        SingletonExample singletonExample1 = SingletonExample.getSingleton();
        SingletonExample singletonExample2 = SingletonExample.getSingleton();
        SingletonExample singletonExample3 = SingletonExample.getSingleton();
        SingletonExample singletonExample4 = SingletonExample.getSingleton();

        System.out.println(singletonExample.hashCode());
        System.out.println(singletonExample1.hashCode());
        System.out.println(singletonExample2.hashCode());
        System.out.println(singletonExample3.hashCode());
        System.out.println(singletonExample4.hashCode());
    }
}
