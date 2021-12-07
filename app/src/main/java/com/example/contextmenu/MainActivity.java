package com.example.contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(TextView) findViewById(R.id.textView);
        registerForContextMenu(textView);
    }


    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);

/*
        menu.setHeaderTitle("색상 선택");
        menu.add(0, 1, 1, "빨간색");
        menu.add(0, 2, 3, "파란색");
        menu.add(0, 3, 2, "녹색");
        super.onCreateContextMenu(menu, v, menuInfo);
*/
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                textView.setTextColor(Color.RED);
                return true;
            case R.id.blue:
                textView.setTextColor(Color.BLUE);
                return true;
            case R.id.green:
                textView.setTextColor(Color.GREEN);
                return true;
            case R.id.yellow:
                textView.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.white:
                textView.setBackgroundColor(Color.WHITE);
                return true;
        }
        return super.onContextItemSelected(item);
    }
}