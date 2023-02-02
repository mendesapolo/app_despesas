package com.example.despesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtTelefone;
    private EditText txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtTelefone = (EditText) findViewById(R.id.txtTelefone);
        this.txtSenha = (EditText) findViewById(R.id.txtSenha);

        Button btnCriarConta = (Button) findViewById(R.id.btnCriarConta_id);
        Button btnLogar = (Button) findViewById(R.id.btnLogin_id);

        btnLogar.setOnClickListener(v -> {
            try {
                String telefone = this.txtTelefone.getText().toString();
                String senha = this.txtSenha.getText().toString();

                if(!telefone.equals("")){
                    User user = new UserDAO(this).getByTelefone(telefone);
                    if(senha.equals(user.getSenha())){
                        Intent intent = new Intent(this, HomeUser.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(this, "Dados de login incorrectos", Toast.LENGTH_SHORT);
                    }
                }
            }catch (Exception ex){
                Toast.makeText(this, ex.getMessage(),Toast.LENGTH_LONG);
            }
        });
        btnCriarConta.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CriarConta.class);
            startActivity(intent);
        });
    }
}