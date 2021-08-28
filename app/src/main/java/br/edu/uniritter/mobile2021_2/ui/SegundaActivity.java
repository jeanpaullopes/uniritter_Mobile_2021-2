package br.edu.uniritter.mobile2021_2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import br.com.vface.mobile2021_2.R;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intent = getIntent();
        System.out.println(intent);
        TextView tv = findViewById(R.id.textView_act2);
        tv.setText(intent.getStringExtra("nome"));

    }
}