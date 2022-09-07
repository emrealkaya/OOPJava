package org.ch2;

public class CarTest {


    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Volkswagen";
        car1.model="Golf";
        car1.year = "2020";
        car1.speed = 120;
        car1.distance = 1000;
        car1.accelerate(150);
        System.out.println(car1.getInfo());

        Car car2 = new Car();
        car2.make= "Renault";
        car2.model = "Clio";
        car2.year = "2021";
        car2.distance = 0;
        car2.speed = 100;
        car2.accelerate(120);
        System.out.println(car2.getInfo());

        double timeToGo = car1.go(1000);
        System.out.println("Time to go "+ car1.qDistance + " For Golf : " + timeToGo + " hour.");
        double timeToGoOther = car2.go(1000);
        System.out.println("Time to go "+ car2.qDistance+ " For Clio : " + timeToGoOther + " hour.");




    }

}
