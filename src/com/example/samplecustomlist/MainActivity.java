package com.example.samplecustomlist;

import java.util.ArrayList;
import java.util.List;

import com.example.samplecustomlist.adapter.CustomListAdapter;
import com.example.samplecustomlist.model.Titel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	CustomListAdapter listadpter;
	ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        List<Titel> title = new ArrayList<Titel>();
        Titel mtitel = null;
        for(int i = 0; i < 3; i++){
        	mtitel = new Titel();
        	mtitel.setName("hossin");
        	title.add(mtitel);
        }
        listadpter = new CustomListAdapter(this, title);
        list.setAdapter(listadpter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
