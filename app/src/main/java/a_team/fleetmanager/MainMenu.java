package a_team.fleetmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    private Button btn_VehicleData, btn_GasChart, btn_ServiceInfo, btn_AllVehicleInfo, btn_Select;
    private TextView title;
    private int car_num;
    private final int VEHICLE_REQUEST_ID = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        title = findViewById(R.id.tv_MainTitle);
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
                view_vehicle_data();
            }
        });

        btn_GasChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_gas();
            }
        });

        btn_ServiceInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_service_info();
            }
        });

        btn_AllVehicleInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_all_vehicle_data();
            }
        });

    }

    private void select_vehicle(){
        Intent intent = new Intent(this, SelectVehicle.class);
        startActivityForResult(intent, VEHICLE_REQUEST_ID);
    }

    private void view_gas(){
        //TODO graph of chosen vehiicle gas consumptions x-axis = day, y-axis = gallons of gas
    }

    private void view_vehicle_data(){
        //TODO
    }

    private void view_all_vehicle_data(){
        //TODO graph of all vehicle gas consumptions compared on the same graph
    }

    private void view_service_info(){
        //TODO
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
                title.setText("Fleet Manager : " + car_num);
                break;
        }
    }



}
