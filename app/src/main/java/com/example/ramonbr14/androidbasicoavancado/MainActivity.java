package com.example.ramonbr14.androidbasicoavancado;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnAbri);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                cliquebotao();
            }
        });
    }
    public class mensagemRecebida extends Activity{
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            TextView tv = new TextView(this);
            tv.setText("BEM VINDO A ESCOLA DE MAGIA E BRUXARIA DE HOGWATHC!");
            setContentView(tv);

        }
    }
    public void cliquebotao(){
        Intent intent = new Intent(this, mensagemRecebida.class);
        startActivity(intent);
    }


}
