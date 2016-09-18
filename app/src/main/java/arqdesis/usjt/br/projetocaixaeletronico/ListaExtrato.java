package arqdesis.usjt.br.projetocaixaeletronico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ListaExtrato extends AppCompatActivity {
    private EditText data;
    public static final String CHAVE = "br.usjt.arqdesis.clientep1.chave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_extrato);
        data = (EditText)findViewById(R.id.busca_data_extrato);
    }

    public void buscarExtrato(View view){
        Intent intent = new Intent(this, ListaExtratoResultado.class);
        String chave = data.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }
}
