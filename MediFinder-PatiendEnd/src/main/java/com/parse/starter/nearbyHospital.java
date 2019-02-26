package com.parse.starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class nearbyHospital extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //To Receive updated of Locations from Emergency clicked button
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_hospital);
        Intent intent2=getIntent();
        String lat=intent2.getStringExtra("Latitude");
        String lon=intent2.getStringExtra("Longitude");
        Log.i("Latitude nearby",String.valueOf(lat));
        Log.i("Longitude nearby",String.valueOf(lon));
        Toast.makeText(getApplicationContext(),lat, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),lon, Toast.LENGTH_SHORT).show();


        //List View for showing Hospitals

        ListView hospitalView=(ListView)findViewById(R.id.nearby);

        hospitalDetails hospital;

        ArrayList<hospitalDetails> hospitals = new ArrayList<hospitalDetails>();

        hospital = new hospitalDetails();
        hospital.setName("AppMan");
        hospital.setDistance("20");
        hospitals.add(hospital);

        hospital = new hospitalDetails();
        hospital.setName("Aakash");
        hospital.setDistance("36");
        hospitals.add(hospital);

        hospital = new hospitalDetails();
        hospital.setName("Rohith");
        hospital.setDistance("69");
        hospitals.add(hospital);


        hospitalView.setAdapter(new MyAdapter(this, hospitals));

    }
}
