package org.hello;

public class Hello {

    String word = "guys";

    public String sayHello(String who){

        String sentence;
        String statusCheck = "";

        if(!who.equals(statusCheck)){

            sentence = "Hello " + who;
        }else{

            sentence = "Hello " + word;

        }
        return sentence;
    }
}

