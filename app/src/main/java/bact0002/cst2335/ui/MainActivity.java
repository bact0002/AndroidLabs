package bact0002.cst2335.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import bact0002.cst2335.data.MainViewModel;
import bact0002.cst2335.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    private MainViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        model = new ViewModelProvider(this).get(MainViewModel.class);
        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        variableBinding.button.setOnClickListener( ( v ) -> {
            model.editString.postValue(variableBinding.myedit.getText().toString());
            model.editString.observe(this, s -> variableBinding.textview.setText("Your edit has: " + s));

        } );



        //variableBinding.myedit.setText("Edit text");

        //variableBinding.textview.setText("Hello World!");

    }



}