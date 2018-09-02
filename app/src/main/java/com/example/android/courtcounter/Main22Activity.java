package com.example.android.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main22Activity extends AppCompatActivity {

    String id1 = "";
    String pass1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
    }

    public void SubmitPlayerA(View v) {

        EditText checkid1 = (EditText) findViewById(R.id.playerAid);
        id1 = checkid1.getText().toString();

        EditText checkpass1 = (EditText) findViewById(R.id.playerApassword);
        pass1 = checkpass1.getText().toString();


        if ((id1.equals("Faizan Darwesh")) && (pass1.equals("faizan")) || (id1.equals("Mohammad Daniyal")) && (pass1.equals("dani")) || (id1.equals("Huda Jawed")) && (pass1.equals("huda")))

            {


                Intent PlayerAProfile = new Intent(this, Main23Activity.class);
                startActivity(PlayerAProfile);

            }
            else{

                Toast toast = Toast.makeText(getApplicationContext(), "Sorry,Invalid Id and Password " + "\n" + " Try Again !!! ", Toast.LENGTH_SHORT);
                toast.show();


            }

        }

    }
