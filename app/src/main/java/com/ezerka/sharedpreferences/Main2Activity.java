package com.ezerka.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Button b_remove,b_load2,b_clear;
    private TextView t_name2,t_section2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b_remove=findViewById(R.id.remove_button);
        b_load2=findViewById(R.id.load_button2);
        b_clear=findViewById(R.id.clear_button);

        t_name2=findViewById(R.id.person_name2);
        t_section2=findViewById(R.id.person_section2);

    }

    public void remove_the_data(View view) {
    }

    public void load_the_data2(View view) {
    }

    public void clear_the_data(View view) {
    }
}
