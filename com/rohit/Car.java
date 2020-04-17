package com.rohit;

public class Car{

    private int doors;
    private int wheels;
    public String model;

    public static void main( String args[]){
        System.out.println("car created");


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
