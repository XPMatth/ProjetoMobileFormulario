package br.com.matheus.atividadedezesseis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText nomeEdit, emailEdit, telefoneEdit, idadeEdit;
    private Button enviarBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEdit = findViewById(R.id.edtNome);
        emailEdit = findViewById(R.id.edtEmail);
        telefoneEdit = findViewById(R.id.edtPhone);
        idadeEdit = findViewById(R.id.edtIdade);
        enviarBtn = findViewById(R.id.btnEnviar);

        enviarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, ListaDois.class);
                intencao.putExtra("nome", nomeEdit.getText().toString());
                intencao.putExtra("email", emailEdit.getText().toString());
                intencao.putExtra("telefone", telefoneEdit.getText().toString());
                intencao.putExtra("Idade", idadeEdit.getText().toString());

                startActivity(intencao);
            }

        });
    }
}