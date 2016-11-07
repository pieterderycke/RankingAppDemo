package be.wtcdegrysperre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pieter.grysperrerankings.R;

import java.util.ArrayList;

/**
 * Created by Pieter on 12/10/2016.
 */

public class RankingArrayAdapter extends ArrayAdapter<RankingRecord> {
    private final Context context;
    private final RankingRecord[] values;

    public RankingArrayAdapter(Context context, RankingRecord[] values) {
        super(context, R.layout.ranking_list_item, values);
        this.context = context;
        this.values = values;
    }

    public RankingArrayAdapter(Context context, ArrayList<RankingRecord> values) {
        super(context, R.layout.ranking_list_item, values);
        this.context = context;
        this.values = values.toArray(new RankingRecord[0]);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RankingRecord record = values[position];

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.ranking_list_item, parent, false);

        TextView nameTextView = (TextView) rowView.findViewById(R.id.name);
        nameTextView.setText(String.format("%1s %2s", record.getFirstName(), record.getLastName()));

        TextView rankingTextView = (TextView) rowView.findViewById(R.id.ranking);
        rankingTextView.setText(String.format("%1d.", position + 1));

        TextView ridesTextView = (TextView) rowView.findViewById(R.id.rideCount);
        ridesTextView.setText(String.format("%1d rides", record.getRides()));

        return rowView;
    }
}