package com.example.hp.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {
 //Button btnSubmit;
    EditText edtInput;
    TextView tvOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        edtInput = (EditText) findViewById(R.id.edtInput);
        tvOutput = (TextView) findViewById(R.id.tvOutput);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(edtInput.getText());
            }
        });



    }


}
