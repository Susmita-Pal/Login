package com.example.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_second);
        Toast.makeText(this, "In the Dial-Up page", Toast.LENGTH_SHORT).show();
       /* Bundle extra=getIntent().getExtras();
        String newString = extra.getString("var");
        System.out.println(newString);*/
       /* //Alternate way of using getIntent()
        Intent getIntent=getIntent();
        String nwString = getIntent.getStringExtra("var");
        System.out.println(nwString);*/
       /*String s="Hey, I'm from Second Activity";*/
       Intent sendData=new Intent();
       sendData.putExtra("send", "Hey, I'm from Second Activity");
       setResult(Activity.RESULT_OK,sendData);
    }
}
