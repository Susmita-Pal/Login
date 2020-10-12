package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.ls.LSOutput;

public class MainActivity extends AppCompatActivity {
    int s = 1;

    public Button button,dialUp;
    public EditText password;
    public String t="Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        dialUp=(Button) findViewById(R.id.dialUp);
        password=(EditText)findViewById(R.id.editText3);
        button.setOnClickListener(new btn());
        dialUp.setOnClickListener(new btn());
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode ==s) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("send");
                System.out.println(result+"<--Result OK");
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                System.out.println("Request has been Cancelled");
            }
        }
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.i(t, "onPause");

    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(t, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(t, "onDestroy");
    }

  /*  public void clickHandler(View view) {*/
/*
        switch (view.getId()) {
            case R.id.dialUp:
                Intent dialUp = new Intent(Intent.ACTION_DIAL, Uri.parse("7260983222"));
                startActivity(dialUp);
                break;
        }*/
        /*final Button btnSubmit; final EditText password;
        Toast.makeText(this, "Voila!! Login Successful", Toast.LENGTH_LONG).show();
        password = (EditText) findViewById(R.id.editText3);
         btnSubmit = (Button) findViewById(R.id.button);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btnSubmit.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, password.getText(), Toast.LENGTH_SHORT).show();

                    }

                });
            }
        }, 10000);
    }
}
*/
     class btn implements View.OnClickListener {
      @Override
      public void onClick(View v) {
          switch (v.getId()) {
              case R.id.button:
                  Toast.makeText(MainActivity.this, "Voila!Login Successful.", Toast.LENGTH_SHORT).show();
                  new Handler().postDelayed(new Runnable() {
                      @Override
                      public void run() {
                          button.setOnClickListener(new View.OnClickListener() {

                              @Override
                              public void onClick(View v) {
                                  Toast.makeText(MainActivity.this, password.getText(), Toast.LENGTH_SHORT).show();
                              }
                          });
                      }
                  }, 100000);
                  break;
              case R.id.dialUp:
                  /*Intent dialUp = new Intent(Intent.ACTION_DIAL);

                  startActivity(dialUp);*/
                  /*Intent dialUp = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9274803958"));
                  startActivity(dialUp);*/

                  /*Intent dial = new Intent(getApplicationContext(), SecondActivity.class);
                  dial.putExtra("var","Hey, it is a message from the MainActivity ");
                  startActivity(dial);*/

                 /* s=1;
                  Intent dial = new Intent(getApplicationContext(), SecondActivity.class);
                  dial.putExtra("var","Hey, it is a message from the MainActivity ");
                  startActivityForResult(dial, s);*/

                 Intent nextPageIntent=new Intent(getApplicationContext(), SecondActivity.class);
                 startActivity(nextPageIntent);
                  break;
          }
      }


  }
}

