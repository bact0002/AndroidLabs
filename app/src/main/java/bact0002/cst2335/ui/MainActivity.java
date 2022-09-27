package bact0002.cst2335.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import bact0002.cst2335.R;
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
        } );

        variableBinding.checkBox.setText("Do you drink coffee?");
        variableBinding.checkBox.setOnCheckedChangeListener(   (button, isChecked) ->   {
           model.isSelected.postValue(isChecked);
        }     );

        variableBinding.switch2.setText("Do you drink coffee?");
        variableBinding.switch2.setOnCheckedChangeListener(   (button, isChecked) ->   {
           model.isSelected.postValue(isChecked);
        }     );

        variableBinding.radioButton2.setText("Do you drink coffee?");
        variableBinding.radioButton2.setOnCheckedChangeListener(   (button, isChecked) ->   {
            model.isSelected.postValue(isChecked);
        }     );

        variableBinding.imageLogo1.setImageResource(R.drawable.logo_algonquin);
        //code below taken from StackOverflow
        Drawable drawable = getResources().getDrawable(R.drawable.logo_algonquin);
        int w = drawable.getIntrinsicWidth();
        int h = drawable.getIntrinsicHeight();
        variableBinding.imageLogo1.setOnClickListener(click ->
                //code below taken from StackOverflow
                Toast.makeText(this, "The width = " + w + " and height = " + h, Toast.LENGTH_SHORT).show());

        variableBinding.imageLogo2.setImageResource(R.drawable.logo_algonquin);
        //code below taken from StackOverflow
        Drawable d = getResources().getDrawable(R.drawable.logo_algonquin);
        int width = d.getIntrinsicWidth();
        int height = d.getIntrinsicHeight();
        variableBinding.imageLogo2.setOnClickListener(click ->
               //code below taken from StackOverflow
                Toast.makeText(this, "The width = " + width + " and height = " + height, Toast.LENGTH_SHORT).show());


        model.editString.observe(this, s -> variableBinding.textview.setText("Your edit has: " + s));

        model.isSelected.observe(this, selected -> {
            variableBinding.checkBox.setChecked(selected);
            variableBinding.radioButton2.setChecked(selected);
            variableBinding.switch2.setChecked(selected);
            //code below taken from StackOverflow
            Toast.makeText(getApplicationContext(),"This value is now: " + selected, Toast.LENGTH_SHORT).show();
        });


    }



}