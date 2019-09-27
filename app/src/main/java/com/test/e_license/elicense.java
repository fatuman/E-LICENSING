package com.test.e_license;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class elicense extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.elicense);

        Button statusbtn;
        statusbtn=findViewById(R.id.statusbtn);
        statusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(elicense.this,payment.class));
            }
        });
    }
    public void onStop(){

        super.onStop();
       // Log.d(TAG,"onStop");



    }
}
