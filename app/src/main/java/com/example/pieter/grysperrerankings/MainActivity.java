package com.example.pieter.grysperrerankings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import be.wtcdegrysperre.RankingArrayAdapter;
import be.wtcdegrysperre.RankingRecord;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //setSupportActionBar(myToolbar);

        ArrayList<RankingRecord> ranking = new ArrayList<RankingRecord>();
        ranking.add(new RankingRecord("Kurt", "Defevere", 29));
        ranking.add(new RankingRecord("Heinz", "Creupelandt", 27));
        ranking.add(new RankingRecord("Luc", "Fardeau", 26));
        ranking.add(new RankingRecord("Bart", "Winne", 26));
        ranking.add(new RankingRecord("Kristof", "Desloovere", 25));
        ranking.add(new RankingRecord("Joachim", "Nollet", 25));
        ranking.add(new RankingRecord("Kristof", "Derdaele", 22));
        ranking.add(new RankingRecord("Didier", "Lagae", 22));
        ranking.add(new RankingRecord("Pieter", "Monteny", 22));
        ranking.add(new RankingRecord("Caroline", "Van Gheluwe", 22));
        ranking.add(new RankingRecord("Pieter", "De Rycke", 15));

        ListView rankingListView = (ListView)findViewById(R.id.rankinglistview);
        RankingArrayAdapter listAdapter = new RankingArrayAdapter(this, ranking);
        //ArrayAdapter listAdapter = new ArrayAdapter(this, R.layout.test1, R.id.textView2, ranking);
        rankingListView.setAdapter(listAdapter);

        rankingListView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, ProfileDetailsActivity.class);
            startActivity(intent);
        });
    }
}
