package com.example.despesa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private Conexao conexao;
    private SQLiteDatabase db;

    public UserDAO(Context context){
        this.conexao = new Conexao(context);
        this.db = conexao.getWritableDatabase();
    }

    public long insert(User user){
        ContentValues values = new ContentValues();
        values.put("nome", user.getNome());
        values.put("telefone", user.getTelefone());
        values.put("senha", user.getSenha());
        return this.db.insert("user", null, values);
    }

    public List<User> listar(){
        List<User> lista = new ArrayList<>();
        Cursor cursor = this.db.query(false,"user", new String[]{"id", "nome", "telefone", "senha"},  null,null,null,null,null,null,null);
        while (cursor.moveToNext()){
            User user = new User(cursor.getString(1),cursor.getString(2), cursor.getString(3));
            user.setId(cursor.getInt(0));
            lista.add(user);
        }
        return lista;
    }
}
