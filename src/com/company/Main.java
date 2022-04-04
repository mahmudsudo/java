package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here#

        int low = 1;
        int hi= 1;
        System.out.println(hi);
        while (low < 50){
            hi = low +hi;
            low =hi -low;
            System.out.println(low);
        }
    }
}
