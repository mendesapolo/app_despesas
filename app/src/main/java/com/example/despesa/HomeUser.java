package com.example.despesa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeUser extends AppCompatActivity {
    private DespesaDAO despesaDAO;
    private List<Despesa> despesaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);

        ListView listview = (ListView) findViewById(R.id.list_view_dispesa);

        List<String> lista = new ArrayList<String>();
        lista.add("Pagar Energia eletrica");
        lista.add("Comprar o gáz");
        lista.add("Comprar o gáz");
        despesaList = despesaDAO.listar();

        ListAdapter adapter = new ArrayAdapter<String>(this, R.layout., lista);
        listview.setAdapter(adapter);
    }
}