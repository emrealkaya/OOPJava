package Hello;

public class HelloTest {

    public static void main(String[] args) {

        Hello referance = new Hello();
        String sentTo = referance.sayHello("Emre ");
        String nullValue = referance.sayHello("");
        System.out.println(sentTo);
        System.out.println(nullValue);
    }
}

