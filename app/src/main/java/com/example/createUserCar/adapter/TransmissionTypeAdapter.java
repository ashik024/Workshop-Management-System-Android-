package com.example.createUserCar.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.createUserCar.model.TransmissionTypeModel;
import com.example.mbw.R;

import java.util.ArrayList;
import java.util.List;

public class TransmissionTypeAdapter extends ArrayAdapter<TransmissionTypeModel> {

    public TransmissionTypeAdapter(Context context,
                                   List<TransmissionTypeModel> modelArrayList) {
        super(context, 0, modelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable
            View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable
            View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView,
                          ViewGroup parent) {
        // It is used to set our custom view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.spinnerstyle, parent, false);
        }

        TextView textViewName = convertView.findViewById(R.id.spinnerstyle);
        TransmissionTypeModel currentItem = getItem(position);

        // It is used the name to the TextView when the
        // current item is not null.
        if (currentItem != null) {
            textViewName.setText(currentItem.getName());
        }
        return convertView;
    }
}