package com.example.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    RadioGroup RGroup;
    RadioButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_second);
        Toast.makeText(this, "In the Second page", Toast.LENGTH_SHORT).show();
         b1 = findViewById(R.id.rButton1);
         b2 = findViewById(R.id.rButton2);
         RGroup = findViewById(R.id.RGroup);
        b1.setOnClickListener(new RadioTouch());
        b2.setOnClickListener(new RadioTouch());

       /* Bundle extra=getIntent().getExtras();
        String newString = extra.getString("var");
        System.out.println(newString);*/
       /* //Alternate way of using getIntent()
        Intent getIntent=getIntent();
        String nwString = getIntent.getStringExtra("var");
        System.out.println(nwString);*/
        /*String s="Hey, I'm from Second Activity";*/
      /* Intent sendData=new Intent();
       sendData.putExtra("send", "Hey, I'm from Second Activity");
       setResult(Activity.RESULT_OK,sendData);*/
    }

     class RadioTouch implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int radioButton= RGroup.getCheckedRadioButtonId();
            switch (radioButton) {
                case R.id.rButton1:
                    if(!b2.isChecked())
                    Toast.makeText(SecondActivity.this, "1st button has been successfully selected!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rButton2:
                    if(!b1.isChecked())
                    Toast.makeText(SecondActivity.this, "2nd button has been successfully selected!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }

/*
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId == R.id.rButton1)
                Toast.makeText(SecondActivity.this, "1st button has been successfully selected!", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(SecondActivity.this, "2nd button has been successfully selected!", Toast.LENGTH_SHORT).show();
        }*/
    }
}