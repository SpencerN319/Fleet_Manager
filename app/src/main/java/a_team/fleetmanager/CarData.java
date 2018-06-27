package a_team.fleetmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CarData extends AppCompatActivity {

    private TextView make, model, year, vin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_data);
        make = findViewById(R.id.tv_make);
        model = findViewById(R.id.tv_model);
        year = findViewById(R.id.tv_year);
        vin = findViewById(R.id.tv_vin);
        set_text();
    }

    private void set_text(){
        make.setText("Ford");
        model.setText("F350");
        year.setText("2014");
        vin.setText("1HGBH41JXMN109186");
    }
}
