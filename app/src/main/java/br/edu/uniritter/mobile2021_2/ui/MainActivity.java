package br.edu.uniritter.mobile2021_2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.com.vface.mobile2021_2.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botao = findViewById(R.id.btnHello);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //view.setVisibility(View.INVISIBLE);
                EditText edit = findViewById(R.id.editTextNome);
                TextView tv = findViewById(R.id.tvHello);
                tv.setText("Olá "+edit.getText().toString());

            }
        });

        botao = findViewById(R.id.button2);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                EditText edit = findViewById(R.id.editTextNome);
                intent.putExtra("nome", edit.getText().toString());
                intent.setType("image/jpg");
                System.out.println(intent);
                startActivity(intent);

            }
        });

    }

    public void outroClick(View view) {
        Toast.makeText(this, "um novo truque", Toast.LENGTH_LONG).show();
    }

}