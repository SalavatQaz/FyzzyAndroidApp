package com.example.fyzzyandroidapp;

import java.util.ArrayList;

public class Fuzzifier {

    public static ArrayList<Double>  fuzzy(ArrayList<Rules> rules,double xDR,double  xAP){
        ArrayList<Double> b = new ArrayList();
        int i = 0;
        while (i<144){
            b.add(rules.get(i).DR_is(xDR));
            b.add(rules.get(i).AP_is(xAP));
            i++;
        }
        return b;
    }
}
