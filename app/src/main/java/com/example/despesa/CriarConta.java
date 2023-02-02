package com.example.despesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CriarConta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        String nome = ((EditText) findViewById(R.id.txt_nome)).getText().toString();
        String telefone = ((EditText) findViewById(R.id.txt_telefone)).getText().toString();
        String senha = ((EditText) findViewById(R.id.txt_senha)).getText().toString();
        Button btnCriar = (Button) findViewById(R.id.btn_registar_id);

        btnCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(nome);
                System.out.println(telefone);
                System.out.println(senha);

                Intent intent = new Intent(CriarConta.this, HomeUser.class);
                startActivity(intent);
            }
        });

    }
}