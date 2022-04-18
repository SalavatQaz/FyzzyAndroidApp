package com.example.fyzzyandroidapp;

import java.util.ArrayList;

public class Rules {
    String DR;
    String AP;
    double MR;

    public Rules(String DR, String AP, double MR) {
        this.DR = DR;
        this.AP = AP;
        this.MR = MR;
    }
    public double DR_is(double x){
        double res;
        if (this.DR.equals("SO_CLOSE")) res = Partition.A_is_so_close(x);
        else if (this.DR.equals("CLOSE")) res =  Partition.A_is_close(x);
        else if (this.DR.equals("MID")) res = Partition.A_is_mid(x);
        else res = Partition.A_is_far(x);
        return res;
    }
    public double  AP_is(double x){
        double res;
        if (this.AP.equals("SMALL")) res = Partition.B_is_small(x);
        else if (this.AP.equals("MID")) res = Partition.B_is_mid(x);
        else res = Partition.B_is_big(x);
        return res;
    }
    public double R_is(){
        return this.MR;
    }
    public static ArrayList<Rules> genRules(){
        ArrayList<Rules> rules = new ArrayList<Rules>();

        rules.add(new Rules("SO_CLOSE","SMALL",Partition.R_no()));
        rules.add(new Rules("SO_CLOSE","MID",Partition.R_no()));
        rules.add(new Rules("SO_CLOSE","BIG",Partition.R_no()));

        rules.add(new Rules("SO_CLOSE","SMALL",Partition.R_maybe_no()));
        rules.add(new Rules("SO_CLOSE","MID",Partition.R_maybe_no()));
        rules.add(new Rules("SO_CLOSE","BIG",Partition.R_maybe_no()));

        rules.add(new Rules("SO_CLOSE","SMALL",Partition.R_50()));
        rules.add(new Rules("SO_CLOSE","MID",Partition.R_50()));
        rules.add(new Rules("SO_CLOSE","BIG",Partition.R_50()));

        rules.add(new Rules("SO_CLOSE","SMALL",Partition.R_maybe_yes()));
        rules.add(new Rules("SO_CLOSE","MID",Partition.R_maybe_yes()));
        rules.add(new Rules("SO_CLOSE","BIG",Partition.R_maybe_yes()));

        rules.add(new Rules("SO_CLOSE","SMALL",Partition.R_yes()));
        rules.add(new Rules("SO_CLOSE","MID",Partition.R_yes()));
        rules.add(new Rules("SO_CLOSE","BIG",Partition.R_yes()));





        rules.add(new Rules("CLOSE","SMALL",Partition.R_no()));
        rules.add(new Rules("CLOSE","MID",Partition.R_no()));
        rules.add(new Rules("CLOSE","BIG",Partition.R_no()));

        rules.add(new Rules("CLOSE","SMALL",Partition.R_maybe_no()));
        rules.add(new Rules("CLOSE","MID",Partition.R_maybe_no()));
        rules.add(new Rules("CLOSE","BIG",Partition.R_maybe_no()));

        rules.add(new Rules("CLOSE","SMALL",Partition.R_50()));
        rules.add(new Rules("CLOSE","MID",Partition.R_50()));
        rules.add(new Rules("CLOSE","BIG",Partition.R_50()));

        rules.add(new Rules("CLOSE","SMALL",Partition.R_maybe_yes()));
        rules.add(new Rules("CLOSE","MID",Partition.R_maybe_yes()));
        rules.add(new Rules("CLOSE","BIG",Partition.R_maybe_yes()));

        rules.add(new Rules("CLOSE","SMALL",Partition.R_yes()));
        rules.add(new Rules("CLOSE","MID",Partition.R_yes()));
        rules.add(new Rules("CLOSE","BIG",Partition.R_yes()));





        rules.add(new Rules("MID","SMALL",Partition.R_no()));
        rules.add(new Rules("MID","MID",Partition.R_no()));
        rules.add(new Rules("MID","BIG",Partition.R_no()));

        rules.add(new Rules("MID","SMALL",Partition.R_maybe_no()));
        rules.add(new Rules("MID","MID",Partition.R_maybe_no()));
        rules.add(new Rules("MID","BIG",Partition.R_maybe_no()));

        rules.add(new Rules("MID","SMALL",Partition.R_50()));
        rules.add(new Rules("MID","MID",Partition.R_50()));
        rules.add(new Rules("MID","BIG",Partition.R_50()));

        rules.add(new Rules("MID","SMALL",Partition.R_maybe_yes()));
        rules.add(new Rules("MID","MID",Partition.R_maybe_yes()));
        rules.add(new Rules("MID","BIG",Partition.R_maybe_yes()));

        rules.add(new Rules("MID","SMALL",Partition.R_yes()));
        rules.add(new Rules("MID","MID",Partition.R_yes()));
        rules.add(new Rules("MID","BIG",Partition.R_yes()));





        rules.add(new Rules("FAR","SMALL",Partition.R_no()));
        rules.add(new Rules("FAR","MID",Partition.R_no()));
        rules.add(new Rules("FAR","BIG",Partition.R_no()));

        rules.add(new Rules("FAR","SMALL",Partition.R_maybe_no()));
        rules.add(new Rules("FAR","MID",Partition.R_maybe_no()));
        rules.add(new Rules("FAR","BIG",Partition.R_maybe_no()));

        rules.add(new Rules("FAR","SMALL",Partition.R_50()));
        rules.add(new Rules("FAR","MID",Partition.R_50()));
        rules.add(new Rules("FAR","BIG",Partition.R_50()));

        rules.add(new Rules("FAR","SMALL",Partition.R_maybe_yes()));
        rules.add(new Rules("FAR","MID",Partition.R_maybe_yes()));
        rules.add(new Rules("FAR","BIG",Partition.R_maybe_yes()));

        rules.add(new Rules("FAR","SMALL",Partition.R_yes()));
        rules.add(new Rules("FAR","MID",Partition.R_yes()));
        rules.add(new Rules("FAR","BIG",Partition.R_yes()));

        return rules;
    }
}
