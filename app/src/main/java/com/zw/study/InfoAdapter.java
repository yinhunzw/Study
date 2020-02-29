package com.zw.study;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class InfoAdapter extends ListAdapter<Person, InfoAdapter.MyViewHolder> {


    protected InfoAdapter(@NonNull DiffUtil.ItemCallback<Person> diffCallback) {
        super(diffCallback);
    }

    protected InfoAdapter(@NonNull AsyncDifferConfig<Person> config) {
        super(config);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_person, parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Person person = getItem(position);

    }



//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.item_person, container, false);
//    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, number;
        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_text);
            number = itemView.findViewById(R.id.number_text);
        }
    }
}
