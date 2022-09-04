package Hello;

public class Hello {

    String word = "guys";

    public String sayHello(String who){

        String sentence;

        if(who != ""){

            sentence = "Hello " + who;
        }else{

            sentence = "Hello " + word;

        }
        return sentence;
    }
}

