package com.example.hector.tubequiz02;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends Activity {

    //private Cursor stations;
    //private MyDatabase db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
/*
        db = new MyDatabase(this);
        stations = db.getStations(); // you would not typically call this on the main thread

        ListAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1,
                stations,
                new String[] {"station"},
                new int[] {android.R.id.text1});
*/
       // getListView().setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent settingsAct = new Intent(MainActivity.this, PreferencesActivity.class);
                startActivity(settingsAct);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
/*
    @Override
    protected void onDestroy() {
        super.onDestroy();
        stations.close();
        db.close();
    }
*/
}
