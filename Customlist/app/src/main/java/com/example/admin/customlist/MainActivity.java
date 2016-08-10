package com.example.admin.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=(ListView)findViewById(R.id.listView);

        CustomBaseAdaptor customadaptor=new CustomBaseAdaptor(MainActivity.this);

        listview.setAdapter(customadaptor);
    }

    public class listItems{
        String name, phno;
    }
    public List<listItems> getItems(){
        List<listItems> items=new ArrayList<listItems>();
        for(a =0; a <10; a++){
            listItems ob=new listItems();
            ob.name="Name"+ a;
            ob.phno="PhoneNumber"+ a;
            items.add(ob);
        }
        return items;
    }
}