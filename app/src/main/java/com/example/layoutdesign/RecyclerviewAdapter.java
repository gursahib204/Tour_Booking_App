package com.example.layoutdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {



    private Context context;
    private Integer image[];
    private String name[];
    private String locationname[];

    RecyclerviewClickevent recyclerviewclickEvent;//interface

    public RecyclerviewAdapter(Context context, Integer[] image, String[] name,String locationname[]){
        this.context=context;
        this.image=image;
        this.name=name;
        this.locationname=locationname;

    }


    // RecyclerviewclickEvent recyclerviewclickEvent;
    @NonNull
    @Override
    public RecyclerviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerviewui1,null,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.MyViewHolder holder, int position) {
        holder.locationimage.setImageResource(image[position]);
        holder.locationname.setText(name[position]);
        holder.country.setText(locationname[position]);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                recyclerviewclickEvent.clickMe(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView locationimage,marker;
        TextView locationname,country;
        RelativeLayout relativeLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            locationimage=itemView.findViewById(R.id.locationimage);
            marker=itemView.findViewById(R.id.locationpoint);
            locationname=itemView.findViewById(R.id.locationname);
            country=itemView.findViewById(R.id.country);
            relativeLayout=itemView.findViewById(R.id.relativelayout);
        }

    }
    public  void SetonClickforRecyclerview(RecyclerviewClickevent recyclerviewclickEvent){
        this.recyclerviewclickEvent=recyclerviewclickEvent;

    }
}
