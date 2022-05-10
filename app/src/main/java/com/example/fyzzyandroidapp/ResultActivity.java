package com.example.fyzzyandroidapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    String data1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle arguments = getIntent().getExtras();
        TextView hello = findViewById(R.id.yourres);
//        hello.setText(String.format("%.1s",arguments.get("result").toString()));
        double res = arguments.getDouble("result");
        res += 1;
        hello.setText(String.valueOf(res));
        giveInstruction(res);
        ArrayList<Double> badResults = (ArrayList<Double>) arguments.get("bad");
        GraphView graph = (GraphView) findViewById(R.id.resGraph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>();
        series.appendData(new DataPoint(1,Math.ceil((double)badResults.get(0) * Math.pow(10,2)) / Math.pow(10,2)),true,500);
        series.appendData(new DataPoint(2,Math.ceil((double)badResults.get(1) * Math.pow(10,2)) / Math.pow(10,2)),true,500);


        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graph);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"Расстояние", "Амплитуда                  "});
        graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

        graph.getViewport().setYAxisBoundsManual(true);
        graph.addSeries(series);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void giveInstruction(double res){
        TextView text;
        if(res <= 1){
            text = findViewById(R.id.firstButton);
        }
        else if(res <= 2){
            text = findViewById(R.id.secondButton);
        }
        else if(res <= 3){
            text = findViewById(R.id.thirdButton);
        }
        else if(res <= 4){
            text = findViewById(R.id.fourthButton);
        }
        else if(res <= 5){
            text = findViewById(R.id.fifthButton);
        }
        else if(res <= 6){
            text = findViewById(R.id.sixthButton);
        }
        else if(res <= 7){
            text = findViewById(R.id.seventhButton);
        }
        else if(res <= 8){
            text = findViewById(R.id.eighthButton);
        }
        else if(res <= 9){
            text = findViewById(R.id.ninthButton);
        }
        else if(res <= 10){
            text = findViewById(R.id.tenthButton);
        }
        else if(res <= 11){
            text = findViewById(R.id.eleventhButton);
        }
        else {
            text = findViewById(R.id.twelfthButton);
        }
        text.setBackgroundColor(getColor(R.color.green));

    }
}