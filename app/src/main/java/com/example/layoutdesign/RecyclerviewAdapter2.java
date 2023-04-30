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

public class RecyclerviewAdapter2 extends RecyclerView.Adapter<RecyclerviewAdapter2.MyViewHolder> {



    private Context context;
    private Integer image[];
    private String name[];
    private String price[];
    private String date[];
    private String ratingnumber[];
    private String locationname1[];

    public RecyclerviewAdapter2(Context context, Integer[] image, String[] name, String locationname1[],String price[],String date[],String ratingnumber[]){
        this.context=context;
        this.image=image;
        this.name=name;
        this.locationname1=locationname1;
        this.price=price;
        this.date=date;
        this.ratingnumber=ratingnumber;

    }


    // RecyclerviewclickEvent recyclerviewclickEvent;
    @NonNull
    @Override
    public RecyclerviewAdapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerviewui2,null,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter2.MyViewHolder holder, int position) {
        holder.toureimage.setImageResource(image[position]);
        holder.tourname.setText(name[position]);
        holder.tourdate.setText(date[position]);
        holder.tourprice.setText(price[position]);
        holder.countryname.setText(locationname1[position]);
        holder.ratingnumber.setText(ratingnumber[position]);

       // holder.country.setText(locationname[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView toureimage;
        TextView tourname,tourdate,tourprice,countryname,ratingnumber;
        RelativeLayout relativeLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            toureimage=itemView.findViewById(R.id.tourpic);
            tourname=itemView.findViewById(R.id.tourname);
            ratingnumber=itemView.findViewById(R.id.ratingnumber);
            tourdate=itemView.findViewById(R.id.tourdate);
            tourprice=itemView.findViewById(R.id.tourprice);
            countryname=itemView.findViewById(R.id.countryname);
            relativeLayout=itemView.findViewById(R.id.relativelayouttwo);
        }
    }
}
