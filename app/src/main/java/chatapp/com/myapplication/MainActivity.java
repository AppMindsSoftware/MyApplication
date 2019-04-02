package chatapp.com.myapplication;

import android.content.Context;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import roboguice.inject.InjectView;


public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.textView) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView textView = findViewById(R.id.textView);

        SensorManager sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);

        String sensorInfo = "";
        for (Sensor s : sensorList){
            sensorInfo= sensorInfo + s.getName()+ "\n";
        }
        textView.setText(sensorInfo);

    }
}
