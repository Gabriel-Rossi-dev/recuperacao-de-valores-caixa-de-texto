package com.cursoandroid.teste.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view){
        EditText receiveName = findViewById(R.id.inputname);
        String name = receiveName.getText().toString();



        TextInputEditText receiveEmail = findViewById(R.id.inputemail);
        String email = receiveEmail.getText().toString();

        TextView textResulted = findViewById(R.id.textResult);
        textResulted.setText("Nome: " + name + " Email: " + email );
    }

}
