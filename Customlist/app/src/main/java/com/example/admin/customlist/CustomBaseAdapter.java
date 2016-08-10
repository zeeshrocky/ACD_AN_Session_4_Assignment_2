package com.example.admin.customlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
/**
 * Created by Admin on 02-Aug-16.
 */
class CustomBaseAdaptor extends BaseAdapter
{
    Activity activity;
    MainActivity obj= new MainActivity();
    List<MainActivity.listItems> listitm= obj.getItems();

    public CustomBaseAdaptor(Activity a)
    {
        this.activity=a;
    }

    @Override
    public int getCount()
    {
        return listitm.size();
    }

    @Override
    public Object getItem(int position)
    {
        return listitm.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView==null){
            LayoutInflater inflater=(LayoutInflater)activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.listitem,parent,false);
        }
        TextView nam=(TextView)convertView.findViewById(R.id.textview1);
        TextView ph=(TextView)convertView.findViewById(R.id.textview2);
        MainActivity.listItems itmobj=listitm.get(position);

        nam.setText(itmobj.name);
        ph.setText(itmobj.phno);

        return convertView;
    }
}