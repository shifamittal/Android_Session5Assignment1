package com.androidsample.intent_googlesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

     public void SearchEngine(View v) {
         final EditText Input = (EditText) findViewById(R.id.input);
         String text = Input.getText().toString();
         Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();

         Intent search= new Intent(Intent.ACTION_WEB_SEARCH);
         search.putExtra(SearchManager.QUERY,text);
         startActivity(search);


     }


    }

