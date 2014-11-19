package com.example.edgargonzalez.listview_practica2;

/**
 * Created by EdgarGonzalez on 16/11/14.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ListItemAdapter extends BaseAdapter{
    //Variables
    private Context mContext = null;
    private ArrayList <ListItem> mArrayList = null;
    private LayoutInflater mLayoutInflater = null;

    public ListItemAdapter (Context context, ArrayList <ListItem> arrayList) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mArrayList = arrayList;
    }

    @Override
    public Object getItem(int position) {

        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public int getCount (){
        return mArrayList.size();
    }

    static class Holder {
        ImageView imageUser;
        TextView txtEmpresa;
        TextView txtGiro;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        View view = convertView;
        //Check if view is null
        if (view == null){
            holder = new Holder ();
            view = mLayoutInflater.inflate(R.layout.cell,null);
            holder.imageUser = (ImageView)view.findViewById(R.id.imageView);
            holder.txtEmpresa = (TextView)view.findViewById(R.id.textView_Empresa);
            holder.txtGiro = (TextView)view.findViewById(R.id.textView_Giro);
            view.setTag(holder);
        }
        else{
            holder=(Holder)view.getTag();

        }
        holder.imageUser.setImageDrawable(mArrayList.get(position).getImageUser());
        holder.txtEmpresa.setText(mArrayList.get(position).getEmpresa());
        holder.txtGiro.setText(mArrayList.get(position).getGiro());

        return view;
    }

}
