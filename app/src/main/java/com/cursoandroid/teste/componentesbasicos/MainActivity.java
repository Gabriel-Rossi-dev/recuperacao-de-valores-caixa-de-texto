package com.cursoandroid.teste.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText receiveName;
    private TextInputEditText receiveEmail;
    private TextView textResulted;
    private CheckBox boxRed, boxGreen, boxBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        receiveName      = findViewById(R.id.inputName);
        receiveEmail     = findViewById(R.id.inputEmail);
        textResulted     = findViewById(R.id.textResult);

        //CheckBox
        boxRed           = findViewById(R.id.boxRed);
        boxGreen         = findViewById(R.id.boxGreen);
        boxBlue          = findViewById(R.id.boxBlue);
    }

    public void checkBox(){


        String text = "";
        if (boxRed.isChecked()){
            text = "Selecionou vermelho -";
        }

        if (boxGreen.isChecked()){
            text = text + " Selecionou verde -";
        }

        if (boxBlue.isChecked()){
            text = text + " Selecionou azul";
        }

        textResulted.setText(text);



    }

    public void send(View view){



        String name      = receiveName.getText().toString();
        String email     = receiveEmail.getText().toString();
        textResulted.setText("Nome: " + name + " Email: " + email );

        checkBox();
    }

    public void clear(View view){

        receiveName.setText("");
        receiveEmail.setText("");

        textResulted.setText("");
    }




}
