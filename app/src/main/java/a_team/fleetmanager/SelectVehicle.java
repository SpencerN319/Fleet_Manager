package a_team.fleetmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectVehicle extends Activity {
    private Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_vehicle);

        b1 = findViewById(R.id.btn_One);
        b2 = findViewById(R.id.btn_Two);
        b3 = findViewById(R.id.btn_Three);
        b4 = findViewById(R.id.btn_Four);
        b5 = findViewById(R.id.btn_Five);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_selection(1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_selection(2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_selection(3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_selection(4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return_selection(5);
            }
        });
    }

    private void return_selection(int car_num){
        Intent intent = new Intent(this, MainMenu.class);
        intent.putExtra("vehicle", car_num);
        setResult(2, intent);
        finish();
    }
}
