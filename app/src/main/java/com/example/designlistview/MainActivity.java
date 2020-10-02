package com.example.designlistview;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ListViewBaseAdapter row_listview;
    ArrayList<ListViewBean> arr_bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.mancity,"Manchester City","Etihad Stadium"));
        arr_bean.add(new ListViewBean(R.drawable.manunited,"Manchester United","Old Trafford Stadium"));
        arr_bean.add(new ListViewBean(R.drawable.tottenham,"Tottenham Hotspur","Tottenham Hotspur Stadium"));
        arr_bean.add(new ListViewBean(R.drawable.chelsea,"Chelsea","Stamford Bridge Stadium"));
        arr_bean.add(new ListViewBean(R.drawable.liverpool,"Liverpool","Anfield Stadium"));
        arr_bean.add(new ListViewBean(R.drawable.arsenal,"Arsenal","Emirates Stadium"));
        row_listview=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(row_listview);

    }
}