package com.example.ganjil_genap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView angka_ganjil, angka_genap, reset;
    private Button mbutton;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka_ganjil = (TextView) findViewById(R.id.id_ganjil);
        angka_genap = (TextView) findViewById(R.id.id_genap);
        mbutton = (Button) findViewById(R.id.Button_id);
        button = (Button) findViewById(R.id.Button);
        reset = (Button) findViewById(R.id.reset_id);


    }

    public void toast(View view) {
      Toast toast =  Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);
      toast.show();

    }

    public void button(View view) {
        if (++mCount % 2 == 0){

            angka_genap.setText(Integer.toString(mCount));
        }
        else
        {
            angka_ganjil.setText(Integer.toString(mCount));
        }

        button.setText("Jumlah kali :" + mCount);

    }

    public void button_reset(View view) {

        mCount = 0;
        angka_genap.setText(Integer.toString(mCount));
        angka_ganjil.setText(Integer.toString(mCount));
        button.setText("Jumlah kali :" + mCount);
        Toast reset = Toast.makeText(this,R.string.pesan_reset,Toast.LENGTH_SHORT);
        reset.show();

    }
}