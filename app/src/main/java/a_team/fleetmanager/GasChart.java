package a_team.fleetmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

public class GasChart extends AppCompatActivity {

    private LineGraphSeries<DataPoint> gas_series;
    private GraphView graph;
    private TextView[] views;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_chart);
        graph = findViewById(R.id.gas_graph);
        views = new TextView[16];
        views[0] = findViewById(R.id.tv0);
        views[1] = findViewById(R.id.tv1);
        views[2] = findViewById(R.id.tv2);
        views[3] = findViewById(R.id.tv3);
        views[4] = findViewById(R.id.tv4);
        views[5] = findViewById(R.id.tv5);
        views[6] = findViewById(R.id.tv6);
        views[7] = findViewById(R.id.tv7);
        views[8] = findViewById(R.id.tv8);
        views[9] = findViewById(R.id.tv9);
        views[10] = findViewById(R.id.tv10);
        views[11] = findViewById(R.id.tv11);
        views[12] = findViewById(R.id.tv12);
        views[13] = findViewById(R.id.tv13);
        views[14] = findViewById(R.id.tv14);
        views[15] = findViewById(R.id.tv15);

        set_dataPoints();
    }

    public void set_dataPoints(){
        Random rand = new Random();
        DataPoint[] data = new DataPoint[30];
        for(int i = 1; i < 31; i++){
            int y = rand.nextInt(120-20)+20;
            data[i-1] = new DataPoint(i,y);
            if(i-1 < 16){
                String s = String.format("%-25s %.20s", i,y);
                views[i-1].setText(s);
            }
        }
        gas_series = new LineGraphSeries<>(data);
        graph.addSeries(gas_series);
    }


}
