package org.hello;

public class HelloTest {

    public static void main(String[] args) {

        Hello reference = new Hello();
        String sentTo = reference.sayHello("Emre ");
        String nullValue = reference.sayHello("");
        System.out.println(sentTo);
        System.out.println(nullValue);
    }
}

