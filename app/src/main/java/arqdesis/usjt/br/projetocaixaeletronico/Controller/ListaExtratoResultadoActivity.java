package arqdesis.usjt.br.projetocaixaeletronico.Controller;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import arqdesis.usjt.br.projetocaixaeletronico.Model.Data;
import arqdesis.usjt.br.projetocaixaeletronico.Model.Extrato;
import arqdesis.usjt.br.projetocaixaeletronico.Model.ExtratoAdapter;
import arqdesis.usjt.br.projetocaixaeletronico.R;
import arqdesis.usjt.br.projetocaixaeletronico.util.StatusTracker;
import arqdesis.usjt.br.projetocaixaeletronico.util.Utils;

public class ListaExtratoResultadoActivity extends AppCompatActivity {
    public static final String TIPOMOVIMENTO = "br.usjt.arqdesis.projetocaixaeletronico.tipoMovimento";
    public static final String DATAOPERACAO = "br.usjt.arqdesis.projetocaixaeletronico.dataOperacao";
    public static final String CODIGO = "br.usjt.arqdesis.projetocaixaeletronico.codigoOperacao";
    public static final String NUMEROCONTA = "br.usjt.arqdesis.projetocaixaeletronico.numeroConta";
    public static final String AGENCIADESTINO = "br.usjt.arqdesis.projetocaixaeletronico.agenciaDestino";
    public static final String CONTADESTINO = "br.usjt.arqdesis.projetocaixaeletronico.contaDestino";
    public static final String CODIGOCLIENTE = "br.usjt.arqdesis.projetocaixaeletronico.codigoCliente";


    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();
    Extrato[] extrato;
    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_extrato_resultado);
        contexto = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(ListaExtratoActivity.CHAVE);
        extrato = Data.buscaExtrato(chave);
        ListView listView = (ListView)findViewById(R.id.Lista_extrato);
        BaseAdapter adapter = new ExtratoAdapter(this, extrato);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent1 = new Intent(contexto, DetalheExtratoActivity.class);
                intent1.putExtra(TIPOMOVIMENTO, extrato[i].getTipoMovimento());
                intent1.putExtra(DATAOPERACAO, extrato[i].getDataOracao());
                startActivity(intent1);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_start));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_restart));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_resume));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_pause));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_stop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_destroy));
        mStatusTracker.clear();
    }

    public void finishActivityA(View v) {
        ListaExtratoResultadoActivity.this.finish();
    }
}