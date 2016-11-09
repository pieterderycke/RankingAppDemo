package com.example.pieter.grysperrerankings;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import be.wtcdegrysperre.RankingArrayAdapter;
import be.wtcdegrysperre.RankingRecord;

public class RankingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.ranking, container, false);

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

        ListView rankingListView = (ListView)fragmentView.findViewById(R.id.rankinglistview);
        RankingArrayAdapter listAdapter = new RankingArrayAdapter(getActivity(), ranking);
        //ArrayAdapter listAdapter = new ArrayAdapter(this, R.layout.test1, R.id.textView2, ranking);
        rankingListView.setAdapter(listAdapter);

        rankingListView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(getActivity(), ProfileDetailsActivity.class);
            startActivity(intent);
        });

        return fragmentView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
