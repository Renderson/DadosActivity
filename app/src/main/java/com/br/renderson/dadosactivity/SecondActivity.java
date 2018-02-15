package com.br.renderson.dadosactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView)findViewById(R.id.textoId);

        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String textoPassado = extra.getString("name");
            textView.setText(textoPassado);
        }

    }
}
