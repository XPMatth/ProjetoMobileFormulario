package br.com.matheus.atividadedezesseis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListaDois extends AppCompatActivity {

    TextView nome, email, telefone, idade;
    Button voltarBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_dois);

        nome = findViewById(R.id.tvNome);
        email = findViewById(R.id.tvEmail);
        telefone = findViewById(R.id.tvTelefone);
        idade = findViewById(R.id.tvIdade);
        voltarBtn = findViewById(R.id.btnVoltar);

        Intent intent = getIntent();

        nome.setText("Nome: " + intent.getStringExtra("nome"));
        email.setText("Email:" + intent.getStringExtra("email"));
        telefone.setText("Telefone: " + intent.getStringExtra("telefone"));
        idade.setText("Idade: " + intent.getStringExtra("idade"));

        voltarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}