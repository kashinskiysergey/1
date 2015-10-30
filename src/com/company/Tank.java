package com.company;

public final class Tank extends Auto {
    int GunLenght;
    int distance;
    int distanceShut;
    int heightBarrier;

    public void methodBreakBarrier() {
        if ((height) >= (heightBarrier)) {
            System.out.println(brand + " can break this barrier!");
        } else {
            System.out.println(brand+" can NOT break this barrier!");

        }

    }

    public void methodTTH() {
        System.out.println("brand-"+brand+" powerMotor-"+powerMotor+" speed-"+speed+" weigh-"+weight+
                " height-"+height+" color-"+color+" GunLengh-"+GunLenght+" distance move-"+distance+" distanceShut-"+distanceShut );

    }
}

