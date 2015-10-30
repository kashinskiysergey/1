package com.company;


public class SportCar extends Auto {


    public int methodMove(){
        for (int i = 1; i <=speed; i++){
            int r = i * i;
            if (i == speed){
                System.out.println("Max Speed this " + brand + " - " + r + "km/h");
            }
        }
        return speed;
    }
}
