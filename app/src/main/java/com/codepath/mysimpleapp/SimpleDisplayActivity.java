package com.codepath.mysimpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SimpleDisplayActivity extends AppCompatActivity {

    //member variable to hold the EditText
    private EditText editText; //currenlty the value is null
    //memebr variable to hold the TextView
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //creates the Layout in Memory
        setContentView(R.layout.activity_simple_display); //associates the Java with the XML
        //views are created int layout
        //get the references from the layout
        editText=(EditText)findViewById(R.id.txtEntry);
        textView=(TextView)findViewById(R.id.txtResultMsg);


    }

    public void onSubmit(View view) {
        //on pressing this we want to show Hello World Message
        //Toast = Simple alert
        //display the value int he label
        //get the value from the text filed and fill the String
        String value =editText.getText().toString();
        textView.setText(value);
        Toast.makeText(this,value,Toast.LENGTH_SHORT).show();
    }



}
