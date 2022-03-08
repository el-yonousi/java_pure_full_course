package com.casetrue.object_passing_32;

public class Main {
    public static void main(String[] args) {
        /**
         * Class as data type
         * passing object in method
         */
        Garage garage = new Garage();
        Car car = new Car("BMW");

        garage.park(car);
    }
}