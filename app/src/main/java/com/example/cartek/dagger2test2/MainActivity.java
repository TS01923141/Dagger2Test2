package com.example.cartek.dagger2test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.cartek.dagger2test2.Module.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MainApp) this.getApplicationContext()).getMainComponent().inject(this);
        Toast.makeText(this, "test" + car.equals(null), Toast.LENGTH_LONG).show();
    }
}
