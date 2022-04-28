package com.example.fyzzyandroidapp;

public class Function {

    public static double left(double a, double b, double x){
        if (x<=a){
            return 1;}
        if (x>=b){
            return 0;}
        return ((double)(b-x)/(b-a));
    }

    public static double triangular(double a,double b,double c,double x){
        return Math.max(Math.min((x-a)/(b-a),(c-x)/(x-b)),0);
    }

    public static double right(double a, double b, double x){
        if (x<=a)
            return 0;
        if (x>=b)
            return 1;
        return ((double)(x-a)/(b-a));
    }
}
