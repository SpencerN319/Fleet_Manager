package a_team.fleetmanager;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button btn_VehicleData, btn_GasChart, btn_ServiceInfo, btn_AllVehicleInfo, btn_Select;
    private int car_num;
    private final int VEHICLE_REQUEST_ID = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        btn_VehicleData = findViewById(R.id.btn_VehicleInfo);
        btn_GasChart = findViewById(R.id.btn_GasData);
        btn_ServiceInfo = findViewById(R.id.btn_ServiceInformation);
        btn_AllVehicleInfo = findViewById(R.id.btn_AllVehicleInformation);
        btn_Select = findViewById(R.id.btn_SelectVehicle);
        car_num = 0;

        btn_Select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select_vehicle();
            }
        });

        btn_VehicleData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });

        btn_GasChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });

        btn_ServiceInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });

        btn_AllVehicleInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });

    }

    private void select_vehicle(){
        Intent intent = new Intent(this, Select_Vehicle.class);
        startActivityForResult(intent, VEHICLE_REQUEST_ID);
    }



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent returnedData){
        if(resultCode == 0){
            return;
        }
        super.onActivityResult(requestCode, resultCode, returnedData);
        switch (requestCode){

            case VEHICLE_REQUEST_ID:
                int car_num = returnedData.getIntExtra("vehicle", 0);
                break;
        }
    }



}
