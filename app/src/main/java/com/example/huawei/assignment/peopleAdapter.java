package com.example.huawei.assignment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class peopleAdapter extends RecyclerView.Adapter<peopleAdapter.ViewHolder> {
    private List<people> mpeopleList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        View peopleView;
        ImageView peopleImage;
        TextView peopleName;
        public ViewHolder(View view){
            super(view);
            peopleView = view;
            peopleImage = (ImageView) view.findViewById(R.id.people_image);
            peopleName = (TextView) view.findViewById(R.id.people_name);
        }
    }
    public peopleAdapter(List<people> fruitList){
        mpeopleList = fruitList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.people_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.peopleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                people peo = mpeopleList.get(position);
                Toast.makeText(v.getContext(),"you click view" + people.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        holder.peopleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                people peo = mpeopleList.get(position);
                Toast.makeText(v.getContext(),"you click image" + people.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        people peo = mpeopleList.get(position);
        holder.peopleImage.setImageResource(peo.getImageId());
        holder.peopleName.setText(peo.getName());
    }
    @Override
    public int getItemCount(){
        return mpeopleList.size();
    }
}