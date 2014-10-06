package com.example.michael.testapp;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class DisplayMessageActivity extends Activity {

    RelativeLayout rl;
    GridView grid;
    List<String> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        rl=(RelativeLayout) findViewById(R.id.rl);
        grid =new GridView(DisplayMessageActivity.this);
        list=new ArrayList<String> ();

        list.add("Dynamic 1");
        list.add("Dynamic 2");
        list.add("Dynamic 3");
        list.add("Dynamic 4");
        list.add("Dynamic 5");
        list.add("Dynamic 6");
        list.add("Dynamic 7");
        list.add("Dynamic 8");
        list.add("Dynamic 9");

        ArrayAdapter<String> adp=new ArrayAdapter<String> (this,
                android.R.layout.simple_dropdown_item_1line,list);
        grid.setNumColumns(3);
        grid.setBackgroundColor(Color.BLACK);
        grid.setAdapter(adp);
        rl.addView(grid);

        grid.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), list.get(arg2),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
