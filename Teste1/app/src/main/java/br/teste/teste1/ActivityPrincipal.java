package br.teste.teste1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;

public class ActivityPrincipal extends AppCompatActivity {

    Button btnTeste;
    TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnTeste = (Button) findViewById(R.id.btnTesteXml);
        txtMensagem = (TextView) findViewById(R.id.txtViewXml);

        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMensagem.setText("Teste primeira aplicação. Olá mundo!");
            }
        });
    }
}


