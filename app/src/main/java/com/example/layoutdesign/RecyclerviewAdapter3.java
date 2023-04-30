package com.example.layoutdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewAdapter3 extends RecyclerView.Adapter<RecyclerviewAdapter3.MyViewHolder> {



    private Context context;
    private Integer image[];


    public RecyclerviewAdapter3(Context context, Integer[] image) {
        this.context = context;
        this.image = image;
    }

    @NonNull
    @Override
    public RecyclerviewAdapter3.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerviewui3,null,false);
        RecyclerviewAdapter3.MyViewHolder myViewHolder=new RecyclerviewAdapter3.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter3.MyViewHolder holder, int position) {
        holder.tourpic.setImageResource(image[position]);


    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView tourpic;
        RelativeLayout relativeLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tourpic=itemView.findViewById(R.id.tourpic1);
            relativeLayout=itemView.findViewById(R.id.relativelayoutthree);
        }
    }

}
