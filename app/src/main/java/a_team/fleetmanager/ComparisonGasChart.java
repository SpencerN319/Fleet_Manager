package a_team.fleetmanager;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

public class ComparisonGasChart extends AppCompatActivity {

    private LineGraphSeries<DataPoint> gas_series1, gas_series2, gas_series3, gas_series4;
    private LineGraphSeries<DataPoint>[] series;
    private Button b1,b2,b3,b4;
    private boolean[] active;
    private GraphView graph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison_gas_chart);
        active = new boolean[4];
        for(int i = 0; i < active.length; i++){
            active[i] = true;
        }
        graph = findViewById(R.id.gas_graph);
        b1 = findViewById(R.id.btn_1);
        b2 = findViewById(R.id.btn_2);
        b3 = findViewById(R.id.btn_3);
        b4 = findViewById(R.id.btn_4);


        gas_series1 = new LineGraphSeries<>(set_dataPoints());
        gas_series1.setColor(Color.GREEN);
        graph.addSeries(gas_series1);


        gas_series2 = new LineGraphSeries<>(set_dataPoints());
        gas_series2.setColor(Color.BLUE);
        graph.addSeries(gas_series2);

        gas_series3 = new LineGraphSeries<>(set_dataPoints());
        gas_series3.setColor(Color.RED);
        graph.addSeries(gas_series3);

        gas_series4 = new LineGraphSeries<>(set_dataPoints());
        gas_series4.setColor(Color.YELLOW);
        graph.addSeries(gas_series4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[0]){
                    active[0] = false;
                    graph.removeSeries(gas_series1);
                } else {
                    active[0] = true;
                    graph.addSeries(gas_series1);
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[1]){
                    active[1] = false;
                    graph.removeSeries(gas_series2);
                } else {
                    active[1] = true;
                    graph.addSeries(gas_series2);
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[2]){
                    active[2] = false;
                    graph.removeSeries(gas_series3);
                } else {
                    active[2] = true;
                    graph.addSeries(gas_series3);
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[3]){
                    active[3] = false;
                    graph.removeSeries(gas_series4);
                } else {
                    active[3] = true;
                    graph.addSeries(gas_series4);
                }
            }
        });
    }

    public DataPoint[] set_dataPoints() {
        Random rand = new Random();
        DataPoint[] data = new DataPoint[30];
        for (int i = 1; i < 31; i++) {
            int y = rand.nextInt(120 - 20) + 20;
            data[i - 1] = new DataPoint(i, y);
        }
        return data;
    }
}
