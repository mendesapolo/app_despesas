package com.example.despesa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeUser extends AppCompatActivity {
    private UserDAO userDAO;
    private List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);

        TextView txt1 = (TextView) findViewById(R.id.textView7);
        txt1.setText("Menu nome");

        TextView txt2 = (TextView) findViewById(R.id.textView9);
        txt2.setText("Telefone");


        //userList = userDAO.listar();

        //ListAdapter adapter = new ArrayAdapter<User>(this, R.layout.activity_home_user, userList);
        //listview.setAdapter(adapter);
    }
}