package com.company;

public class Vehicle {
    float cur_speed;
    double deg;
   String own_name;
    Vehicle(float cur_sp,double ideg, String name){
        this();
        deg = ideg;
       cur_speed =cur_sp;
        own_name =name;
    }

    public Vehicle() {

    }

    public static void main(String[] args) {
        Vehicle veh1 = new Vehicle();
        veh1.cur_speed = 4.7f;
        veh1.deg = 89.5;
        veh1.own_name = "mahmud";
        System.out.println(veh1.deg+ " "+ veh1.own_name );

    }
}
