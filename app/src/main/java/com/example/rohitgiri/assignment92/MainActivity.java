package com.example.rohitgiri.assignment92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
//creating class which is extending AppComatActivity
public class MainActivity extends AppCompatActivity {
//OnCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //Setting ContentView UI
        getSupportActionBar();
    }
//method OnCreateOptionMenu to inflate menu layout
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();  //creating menu inflater object
        //inflating menu layout
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
  //metohod onOptionsItemSelected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.computer)                                          //if id matches to computer display a message
        {
            Toast.makeText(MainActivity.this,"You Have Clicked On Computer",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.gamepad)                                      //if id matches to gamepad display a message
        {
            Toast.makeText(MainActivity.this,"You Have Clicked On Gamepad",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.camera)                                       //if id matches to camera display a message
        {
            Toast.makeText(MainActivity.this,"You Have Clicked On Camera",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.email)                                       //if id matches to email display a message
        {
            Toast.makeText(MainActivity.this,"You Have Clicked On Email",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.video)                                       //if id matches to video display a message
        {
            Toast.makeText(MainActivity.this,"You Have Clicked On Video",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);                        //returning item
    }
}
