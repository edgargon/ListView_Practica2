package com.example.edgargonzalez.listview_practica2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class add_element extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_element);
        TextView textView = (TextView) findViewById(R.id.textView_cnt);
        textView.setText(Integer.toString(MainActivity.cnt_empresas));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_element, menu);
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

    public void btnAddElement(View v) {

        ListItem listItem = new ListItem();
        EditText editText = (EditText) findViewById(R.id.txtView_Empresa);
        String message = editText.getText().toString();
        listItem.setEmpresa(message);

        EditText editText1 = (EditText) findViewById(R.id.txtView_Giro);
        message = editText1.getText().toString();
        listItem.setGiro(message);


        //add item to array list
        MainActivity.mArraylist.add(listItem);
        MainActivity.cnt_empresas++;
        TextView textView = (TextView) findViewById(R.id.textView_cnt);
        textView.setText(Integer.toString(MainActivity.cnt_empresas));
        listItem.setImageUser(getResources().getDrawable(R.drawable.uag));
        editText.setText("");
        editText1.setText("");
    }

}
