package com.example.edgargonzalez.listview_practica2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    public static ArrayList<ListItem> mArraylist = null;
    public static int cnt_empresas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArraylist = new ArrayList<ListItem>();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ButtonClicked(View v)
    {

        switch (v.getId()) {
            case R.id.buttonAddContact:
                Intent intent = new Intent(this, add_element.class);
                startActivity(intent);
                break;

            case R.id.buttonShowList:
                Intent intentLastName = new Intent(this, view_list.class);
                startActivity(intentLastName);
                break;
        }
    }
}
