package com.example.jigyasa.poll_khol;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by chhavi on 21/8/15.
 */
public class ManifestoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.manifesto_layout,null);
        ListView manifestList=(ListView)view.findViewById(R.id.manifest_list);


        return view;
    }
}

class ManifestAdapter extends ArrayAdapter
{
    Context context;
    ArrayList<Manifesto> manifestoList;
    LayoutInflater inflater;
    public ManifestAdapter(Context context, int resource,ArrayList<Manifesto> manifestoList,LayoutInflater inflater)
    {
        super(context, resource);
        this.context=context;
        this.manifestoList=manifestoList;
        this.inflater=inflater;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v;
        if(convertView==null)
        {
            v=inflater.inflate(R.layout.listview_item,null);
        }
        v=convertView;



        return v;
    }
}
