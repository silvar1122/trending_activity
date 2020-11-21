package com.example.assigment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    public ArrayList<Model>list;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.themenu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        list=new ArrayList<>();
        populateData();
        init();

    }

    public void init(){
        recyclerAdapter=new RecyclerAdapter(getApplication(),list);
        recyclerView.setAdapter(recyclerAdapter);
        RecyclerView.LayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
    }
    public void populateData(){
        list.add(new Model(
                R.drawable.first_item,"felt bouquet","$2000","SugarSnapBo"));
        list.add(new Model(R.drawable.second_item,"DIY Putz village Ornament","$36.00USD","HolidaySpirit"));
        list.add( new Model(R.drawable.third_item,"Vintage angry well bottle","$54.00USD","sonofsoren"));
        list.add(new Model(R.drawable.fourth_item,"Patinated Autumn leaf","$105.00USD","NangijalaJe"));
        list.add(new Model(R.drawable.fifth_item,"Dinning Stool","$275.00SD","solidmfgco"));
    }
}