package com.assignment.acadgild.android_session4_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.assignment.acadgild.android_session4_assignment2.adapter.CustomAdapter;
import com.assignment.acadgild.android_session4_assignment2.model.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Person> persons;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        persons=new ArrayList<>();

        persons.add(new Person("Mukund", "9099975177"));
        persons.add(new Person("MMP", "123456789"));
        persons.add(new Person("Murari", " 9898989898"));

        adapter = new CustomAdapter(getApplicationContext(), persons);
        listView.setAdapter(adapter);

    }
}
