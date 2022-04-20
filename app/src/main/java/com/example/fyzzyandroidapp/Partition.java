package com.example.fyzzyandroidapp;

public class Partition {

    public static double A_is_so_close(double x){ return Function.left(5,20,x); }
    public static double A_is_close(double x) {return Function.triangular(5,20,40,x);}
    public static double A_is_mid(double x) {return Function.triangular(20,40,60,x);}
    public static double A_is_far(double x) {return Function.right(40,60,x);}

    public static double B_is_small(double x){return Function.left(0.7,1.5,x);}
    public static double B_is_mid(double x){return Function.triangular(0.7,1.5, 2,x);}
    public static double B_is_big(double x){return Function.right(1.5,2.5,x);}


    public static double R_1(){
        return 0;
    }
    public static double R_2(){
        return 1;
    }
    public static double R_3(){ return 2; }
    public static double R_4(){
        return 3;
    }
    public static double R_5(){
        return 4;
    }
    public static double R_6(){
        return 5;
    }
    public static double R_7(){
        return 6;
    }
    public static double R_8(){
        return 7;
    }
    public static double R_9(){
        return 8;
    }
    public static double R_10(){
        return 9;
    }
    public static double R_11(){
        return 10;
    }
    public static double R_12(){
        return 11;
    }

}
