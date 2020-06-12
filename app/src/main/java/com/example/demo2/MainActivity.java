package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String t="Activity ";
    private EditText password;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onPause() {

        super.onPause();
        Log.i(t,"onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(t,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(t,"onDestroy");
    }
    public void clickHandler(View view){
        Toast.makeText(this, "Voila!! Login Successful", Toast.LENGTH_LONG).show();
    }

    public void clickHandler(){
        password = (EditText) findViewById(R.id.editText3);
        btnSubmit = (Button) findViewById(R.id.button);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btnSubmit.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, password.getText(),Toast.LENGTH_SHORT).show();

                    }

                });
            }
        },5000);
    }
}

