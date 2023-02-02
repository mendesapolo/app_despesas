package com.example.despesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtTelefone = (EditText) findViewById(R.id.txtTelefone);
        EditText txtSenha = (EditText) findViewById(R.id.txtSenha);
        Button btnLogin = (Button) findViewById(R.id.btnLogin_id);
        Button btnCriarConta = (Button) findViewById(R.id.btnCriarConta_id);

        String telefone = txtTelefone.getText().toString();
        String senha = txtSenha.getText().toString();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CriarConta.class);
                startActivity(intent);
            }
        });
    }
}