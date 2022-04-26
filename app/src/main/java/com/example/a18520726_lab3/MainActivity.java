package com.example.a18520726_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = (ListView) findViewById(R.id.listView);

        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("Toan","Dak Lak"));
        arrayList.add(new User("Hung","Kien Giang"));
        arrayList.add(new User("Khoa","Binh Dinh"));
        arrayList.add(new User("Hiep","Ho Chi Minh"));
        arrayList.add(new User("Chien","Binh Dinh"));

        UserAdapter adapter = new UserAdapter(this, R.layout.adapter_view_layout, arrayList);
        mListView.setAdapter(adapter);
    }
}