package com.rohit;

import java.util.Objects;

public class Car{

    private int doors;
    private int wheels;
    public String model;

    public static void main( String args[]){
        System.out.println("car created");


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors &&
                wheels == car.wheels &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doors, wheels, model);
    }

    public Car(){
        System.out.println("car created");
    }

    //getter
    public String getModel(){
        return this.model;
    }


    //setter
    public void setModel(String model){
        this.model = model;
    }



}
