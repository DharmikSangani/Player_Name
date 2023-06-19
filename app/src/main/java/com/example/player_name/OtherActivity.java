package com.example.player_name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class OtherActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter adapter;
    String name[]={"Virat Kohli","Rohit Sharma","KL Rahul","Ravindra Jadeja","Hardik Pandya","Rishabh Pant","Jasprit Bumrah","Mohammed Shami","Yuzvendra Chahal","Kuldeep Yadav","Bhuvneshwar Kumar"};
    String num[]={"BATSMAN","BATSMAN","WICKET KEEPER","ALL RAUNDER","ALL RAUNDER","WICKET KEEPER","CRICKET BOWLER","CRICKET BOWLER","CRICKET BOWLER","CRICKET BOWLER","CRICKET BOWLER"};

    int imgArr[]={R.drawable.img,R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,
            R.drawable.img_6,R.drawable.img_7, R.drawable.img_8, R.drawable.img_9, R.drawable.img_10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.other_Listview);
        adapter=new CustomAdapter(OtherActivity.this,name,num,imgArr);
        listView.setAdapter(adapter);
    }
}