package com.example.layoutdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerviewAdapter recyclerviewAdapter;
    RecyclerviewAdapter2 recyclerviewAdapter2;
    RecyclerView recyclerView,recyclerview2;
    Integer img[]={R.drawable.locationfour,R.drawable.locationtwo,R.drawable.locationthree,R.drawable.locationfour,R.drawable.locationfive,R.drawable.locationsix};
    String stname[]={"Penida Island","Awestruck","Northern Lighst","Alberta","London","Spain"};
    String locationname[]={"Indonesia","Europe","Norway","Canada","Europe","Europe"};

    //recyclerview 2

    Integer image[]={R.drawable.desert,R.drawable.dubai,R.drawable.india,R.drawable.spain,R.drawable.locationfive,R.drawable.locationsix};
    String name[]={"sahara","dubai","taj mahal","spain","London","Spain"};
    String date[]={"450","200","100","500","250","390"};
    String locationname1[]={"12 - 19 Jan 2023","25 - 28 Feb 2023","21 - 25 Mar 2023","24 - 28 Jul 2023","15 - 20 May 2023","16 - 20 Mar 2023"};
    String price[]={"India","UAE","India","Europe","Europe","Europe"};
    String ratingnumber[]={"4.5","4.9","3.9","4.3","4.7","4.9"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerview2=findViewById(R.id.recyclerviewui2);

        recyclerviewAdapter=new RecyclerviewAdapter(MainActivity.this,img,stname,locationname);
        recyclerView.setAdapter(recyclerviewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //recyclerview2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recyclerviewAdapter.SetonClickforRecyclerview(new RecyclerviewClickevent() {
            @Override
            public void clickMe(int pos) {
                if(pos==0){
                    Intent intent=new Intent(MainActivity.this,tour_page.class);
                    startActivity(intent);
                }
            }
        });

        recyclerviewAdapter2=new RecyclerviewAdapter2(MainActivity.this,image,name,price,date,locationname1,ratingnumber);
        recyclerview2.setAdapter(recyclerviewAdapter2);
        recyclerview2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));




        /*  recyclerviewAdapter2=new RecyclerviewAdapter2(MainActivity.this,image,name,locationname,price,date);
        recyclerview2.setAdapter(recyclerviewAdapter2);
        recyclerview2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
*/
    }
}