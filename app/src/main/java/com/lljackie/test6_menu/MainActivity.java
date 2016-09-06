package com.lljackie.test6_menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tv_click = (TextView) findViewById(R.id.tv_click);
        tv_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hey!!!", Toast.LENGTH_SHORT).show();
                PopupMenu popup = new PopupMenu(MainActivity.this, view);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.menu_main);
                popup.show();
            }
        });
        registerForContextMenu(tv_click);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu_optionmenu:
                Toast.makeText(MainActivity.this, "This is an OptionMenu!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "噢，在这停顿！！！", Toast.LENGTH_SHORT).show();
                break;
            default:
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu_optionmenu:
                Toast.makeText(MainActivity.this, "This is a ContextMenu!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "噢，在这停顿！！！", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu_optionmenu:
                Toast.makeText(MainActivity.this, "This is a PopupMenu!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "噢，在这停顿！！！", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return false;
    }
}
