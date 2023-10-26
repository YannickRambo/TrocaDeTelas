package br.ulbra.trocadetelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTelaPrincipal, btnTela2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregarTelaPrincipal();

    }
    public void carregarTelaPrincipal(){
        setContentView(R.layout.activity_main);
        btnTela2 = (Button)findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarTela2();
            }
        });

    }
    public void carregarTela2(){
        setContentView(R.layout.tela2);
        btnTelaPrincipal = (Button)findViewById(R.id.btnTelaPrincipal);
        btnTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarTelaPrincipal();
            }
        });
    }
}