package com.assignment.acadgild.android_session4_assignment2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.assignment.acadgild.android_session4_assignment2.R;
import com.assignment.acadgild.android_session4_assignment2.model.Person;

import java.util.ArrayList;

/**
 * Created by Mukund on 03-03-16.
 */
public class CustomAdapter extends BaseAdapter{
    ArrayList<Person> persons;
    LayoutInflater inflater;

    public CustomAdapter(Context context,ArrayList<Person> persons) {
        this.persons = persons;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int position) {
        return persons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null) {
            convertView = inflater.inflate(R.layout.person_listview, parent, false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.txtPersonName);
        TextView MobNo = (TextView) convertView.findViewById(R.id.txtPersonMobNo);

        Person person = persons.get(position);

        name.setText(person.getName());
        MobNo.setText(person.getMobNo());

        return convertView;
    }
}
