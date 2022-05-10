package com.example.fyzzyandroidapp;
import static com.example.fyzzyandroidapp.Rules.genRules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText DR;
    EditText AP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DR = findViewById(R.id.DR);
        AP = findViewById(R.id.AP);
    }



    public void getRes(View view){
        ArrayList<Rules> rules = genRules();
        ArrayList<Double> b = Fuzzifier.fuzzy(rules, Double.parseDouble(DR.getText().toString().replace(',','.')),Double.parseDouble(AP.getText().toString().replace(',','.')));
        ArrayList<Double> c = Aggregator.aggregate(b);
        double defRes = Defuzzifier.defuzzi(c, rules);
        System.out.println(defRes);

        ArrayList<Double> badResults = new ArrayList<>();
        badResults.add(Partition.A_is_far(Double.parseDouble(DR.getText().toString())));
        badResults.add(Partition.B_is_big(Double.parseDouble(AP.getText().toString())));

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", defRes);
        intent.putExtra("bad", badResults);
        startActivity(intent);

    }
}