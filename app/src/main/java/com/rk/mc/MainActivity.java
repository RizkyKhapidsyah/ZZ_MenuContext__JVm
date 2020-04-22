package com.rk.mc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TV_1_IDJAVA;
    RelativeLayout RLayout_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);
        RLayout_1_IDJAVA = findViewById(R.id.RLayout_1_IDXML);

        registerForContextMenu(TV_1_IDJAVA);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Pilih sebuah warna..");
        menu.add(0, v.getId(), 0, "Kuning");
        menu.add(0, v.getId(), 0, "Abu-Abu");
        menu.add(0, v.getId(), 0, "Cyan");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Kuning") {
            RLayout_1_IDJAVA.setBackgroundColor(Color.YELLOW);
        } else if (item.getTitle() == "Abu-Abu") {
            RLayout_1_IDJAVA.setBackgroundColor(Color.GRAY);
        } else if (item.getTitle() == "Cyan") {
            RLayout_1_IDJAVA.setBackgroundColor(Color.CYAN);
        }
        return true;
    }
}