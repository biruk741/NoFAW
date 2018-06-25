package com.innov8.memeit.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.innov8.memeit.R;
import com.innov8.nofaw.Pojos.Report;
import com.innov8.nofaw.R;
import com.memeit.backend.dataclasses.MemeResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jv on 6/16/2018.
 */

public class ReportsAdapter extends ArrayAdapter<Report> {
    private Context mContext;
    private LayoutInflater mInflater;
    public ArrayList<Report> reports;

    public ReportsAdapter(@NonNull Context context, int resource, @NonNull List<Report> objects) {
        super(context, resource, objects);
        reports = (ArrayList<Report>) objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_report,parent,false);
        TextView name = view.findViewById(R.id.name);
        TextView crop = view.findViewById(R.id.crop);
        TextView location = view.findViewById(R.id.location);

        Report currentObject = reports.get(position);

        name.setText(currentObject.getName());
        crop.setText(currentObject.getCropType());
        location.setText(currentObject.getCity());

        return view;
    }
}
