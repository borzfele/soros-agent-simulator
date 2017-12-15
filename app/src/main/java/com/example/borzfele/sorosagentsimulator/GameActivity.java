package com.example.borzfele.sorosagentsimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {
    private int money;
    TextView moneyField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        money = 0;

        moneyField = findViewById(R.id.money_field);
        moneyField.setText(String.valueOf(money));

        ArrayList<String> list = new ArrayList<>();
        list.add("Junior Agent");
        list.add("Senior Agent");
        list.add("444");
        list.add("index");
        list.add("TASZ");
        list.add("Zsúrpubik");
        list.add("Simicska");
        list.add("HáttérHatalom Zrt.");
        list.add("Buzilobbi International");
        list.add("Green Peace");
        list.add("Bruxelles");
        list.add("Belgium");
        list.add("Macron");
        list.add("Merkel");
        list.add("Juncker");
        list.add("European Union");
        list.add("André Goodfriend");
        list.add("Barack Obama");
        list.add("Pope Francis");
        list.add("Heineken");
        list.add("Fake Soros");
        list.add("Amnesty International");
        list.add("Illuminati");
        list.add("Ysraél");
        list.add("Reptilian Confederation");
        list.add("Pleiadian Light Creatures");
        list.add("Virgin Mary, The Mother of God");
        list.add("Black Jesus");
        list.add("Korean Jesus");
        list.add("Elvis");
        list.add("Brian");
        list.add("Flying Spaghetti Monster");
        list.add("Tha Trve And Only Jesus");
        list.add("Our Mighty God");
        list.add("Satan");
        list.add("George Soros");

        ListView listView = findViewById(R.id.upgrade_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
    }

    public void onKick(View view){
        money++;
        moneyField.setText(String.valueOf(money));
    }
}
