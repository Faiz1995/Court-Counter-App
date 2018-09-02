package com.example.android.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main23Activity extends AppCompatActivity {
     String id2 , pass2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
    }
    public void SubmitPlayerB(View v){

         EditText checkid2 = (EditText) findViewById(R.id.playerBid);
         id2 = checkid2.getText().toString();

        EditText checkpass2 = (EditText) findViewById(R.id.playerBpassword);
        pass2 =  checkpass2.getText().toString();


        if((id2.equals("Zubair Irfan")) && (pass2.equals("zubair"))|| (id2.equals("Muneera Adil")) && (pass2.equals("muneera")) || (id2.equals("Hassan Abbass")) && (pass2.equals("hassan")) ) {

                Intent PlayerBProfile = new Intent(this, Main2Activity.class);
                startActivity(PlayerBProfile);
            }
        else if(){}
            else {

                Toast toast=Toast.makeText(getApplicationContext(),"Sorry,Invalid Id and Password " +  "\n" + " Try Again !!! ",Toast.LENGTH_SHORT);
                toast.show();



            }

        }

    }



