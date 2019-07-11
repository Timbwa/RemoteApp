package com.brianlangat.remoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class   MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button MENU,Dialphone,Location,Openwebpage,Letsgopro;

    // outchea
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = (TextView) findViewById(R.id.TextView);
        MENU = (Button) findViewById(R.id.MENU);
        Dialphone = (Button) findViewById(R.id.Dialphone);
        Location = (Button) findViewById(R.id.Location);
        Openwebpage = (Button) findViewById(R.id.Openwebpage);
        Letsgopro = (Button) findViewById(R.id.Letsgopro);

         MENU.setOnClickListener(this);
        Dialphone.setOnClickListener(this);
        Location.setOnClickListener(this);
        Openwebpage.setOnClickListener(this);
        Letsgopro .setOnClickListener(this);

        /*push_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Lod.d("tag","Somebody Pushed a Button");
                textView.setText("Somebody Pushed a Button..");
            }
        });*/


//        push_me2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Log.d("");
//                textView.setText("Somebody Pushed another Button..");
//            }
//        });

        Log.d("tag","In OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","In OnStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","In OnResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","In OnPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","In OnStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","In OnDestroy");

    }

    @Override
    public void onClick(View view) {
     switch (view.getId()){
         case R.id.MENU:
             Intent intent = new Intent(MainActivity.this,otheractivity.class);
             startActivity(intent);
         break;


         case R.id.Dialphone:

             Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0716473930"));
             startActivity(intent1);
             break;

         case R.id.Location:
             Intent intent2 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:-1.3124617,36.8056101,17?z=10") );
             startActivity(intent2);
             break;

         case R.id.Openwebpage:
             Intent intent3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
             startActivity(intent3 );
             break;

         case R.id.Intent:
             Intent intent5 = new Intent(Intent.ACTION_VIEW);
             startActivity(intent5 );
             break;

         case R.id.Letsgopro:
             //Intent intent4 = new Intent("com.brianlangat.remoteapp.otheractivity");
             //startActivity(intent4 );
             Intent intent6 = new Intent(Intent.ACTION_VIEW);
             startActivity(intent6 );
             break;
     }
    }
}
