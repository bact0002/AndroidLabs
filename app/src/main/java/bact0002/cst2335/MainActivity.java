package bact0002.cst2335;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import bact0002.cst2335.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());


        variableBinding.button.setOnClickListener( ( v ) -> {
            variableBinding.button.setText("You clicked the button");
            variableBinding.textview.setText("The button has been clicked");

        } );



        variableBinding.myedit.setText("Edit text");

        variableBinding.textview.setText("Hello World!");

        setContentView(variableBinding.getRoot());
    }



}