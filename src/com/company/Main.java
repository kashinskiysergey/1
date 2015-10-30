package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Tank tank1 = new Tank();
        tank1.height = 20;
        tank1.setSpeed(10);
        tank1.setPowerMotor(980);
        tank1.setBrand("T-34/1");
        tank1.setWeight(100);
        tank1.setColor("Green");
        tank1.distance = 10;
        tank1.distanceShut = 980;
        tank1.GunLenght = 75;
        tank1.heightBarrier = 25;

        Tank tank2 = new Tank();
        tank2.height = 34;
        tank2.setSpeed(20);
        tank2.setPowerMotor(1035);
        tank2.setBrand("T-34/2");
        tank2.setWeight(90);
        tank2.setColor("Green");
        tank2.distance = 30;
        tank2.distanceShut = 1100;
        tank2.GunLenght = 90;
        tank2.heightBarrier = 35;

        Tank tank3 = new Tank();
        tank3.height = 37;
        tank3.setSpeed(45);
        tank3.setPowerMotor(1140);
        tank3.setBrand("T-34/3");
        tank3.setWeight(85);
        tank3.setColor("Green");
        tank3.distance = 60;
        tank3.distanceShut = 1800;
        tank3.GunLenght = 110;
        tank3.heightBarrier = 35;

        Tank tank4 = new Tank();
        tank4.height = 40;
        tank4.setSpeed(60);
        tank4.setPowerMotor(1300);
        tank4.setBrand("T-34/4");
        tank4.setWeight(75);
        tank4.setColor("Green");
        tank4.distance = 80;
        tank4.distanceShut = 2000;
        tank4.GunLenght = 110;
        tank4.heightBarrier = 35;

        Tank tank5 = new Tank();
        tank5.height = 45;
        tank5.setSpeed(80);
        tank5.setPowerMotor(1500);
        tank5.setBrand("T-34/5");
        tank5.setWeight(70);
        tank5.setColor("Green");
        tank5.distance = 100;
        tank5.distanceShut = 2500;
        tank5.GunLenght = 125;
        tank5.heightBarrier = 35;




        SportCar F = new SportCar();
        F.setSpeed(19);
        F.setBrand("Ferrary");
        F.methodMove();

            int[] ArreyTanksSpeed = new int[4];
                ArreyTanksSpeed[0] = tank1.speed ;
                ArreyTanksSpeed[1] = tank2.speed ;
                ArreyTanksSpeed[2] = tank3.speed ;
                ArreyTanksSpeed[3] = tank4.speed ;
            System.out.println(Arrays.toString(ArreyTanksSpeed));

        tank2.methodMove();
        tank3.methodMove();
        tank1.methodBreakBarrier();
        tank2.methodBreakBarrier();
        tank5.methodBreakBarrier();
        tank5.methodTTH();


    }


}