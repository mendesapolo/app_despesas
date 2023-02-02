package com.example.despesa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DespesaDAO {

    private Conexao conexao;
    private SQLiteDatabase db;

    public DespesaDAO(Context context){
        this.conexao = new Conexao(context);
        this.db = conexao.getWritableDatabase();
    }

    public long insert(Despesa despesa){
        ContentValues values = new ContentValues();
        values.put("nome", despesa.getNome());
        values.put("valor", despesa.getValor());
        values.put("is_pago", despesa.isPago());
        return this.db.insert("despesa", null, values);
    }

    public List<Despesa> listar(){
        List<Despesa> lista = new ArrayList<>();
        Cursor cursor = this.db.query(false,"despesa", new String[]{"id", "nome", "valor", "is_pago"},  null,null,null,null,null,null,null);
        while (cursor.moveToNext()){
            Despesa despesa = new Despesa(cursor.getString(1),cursor.getDouble(2), cursor.getInt(3)==1 );
            despesa.setId(cursor.getInt(0));
            lista.add(despesa);
        }
        return lista;
    }
}
