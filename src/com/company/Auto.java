package com.company;

public class Auto {

    public int getPowerMotor() {
        return powerMotor;
    }

    public void setPowerMotor(int powerMotor) {
        this.powerMotor = powerMotor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int powerMotor;
    int speed;
    int weight;
    int height;
    String brand;
    String color;

    public int methodMove(){
        /**Enter
         *
         */
        for (int i = 0; i <=speed; i++){
            int r = i + i;

            if (i == speed) {
                System.out.println("Max Speed " + brand + " - " + r + "km/h");
            }

        }
        return this.speed;
    }
}
