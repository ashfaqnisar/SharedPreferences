package com.ezerka.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_name,et_section;
    private TextView t_name,t_section;
    private Button   b_save,b_load,b_second_activity;
    private Switch s_change;
    private LinearLayout page_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState   ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name=findViewById(R.id.edit_name);
        et_section=findViewById(R.id.edit_section);

        t_name=findViewById(R.id.person_name);
        t_section=findViewById(R.id.person_section);

        b_save=findViewById(R.id.save_button);
        b_load=findViewById(R.id.load_button);
        b_second_activity=findViewById(R.id.open_second_activity);

        s_change=findViewById(R.id.turn_green);

        page_layout=findViewById(R.id.layout);
    }

    public void save_the_data(View view) {

        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();

        editor.putString("name",et_name.getText().toString());
        editor.putString("section",et_section.getText().toString());

        editor.apply(); //we can also call editor.commit() it returns a value but apply doesnot return a value
    }

    public void load_the_data(View view) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);

        String SP_Name =sharedPreferences.getString("name","");
        String SP_Section = sharedPreferences.getString("section","");

        t_name.setText(SP_Name);
        t_section.setText(SP_Section);
    }

    public void open_second_activity(View view) {
        Intent second = new Intent(this,Main2Activity.class);
        startActivity(second);
    }
}
