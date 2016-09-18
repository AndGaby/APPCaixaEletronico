package arqdesis.usjt.br.projetocaixaeletronico;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import util.StatusTracker;
import util.Utils;

public class ListaExtratoResultado extends AppCompatActivity {
    public static final String RESULTADO = "br.usjt.arqdesis.ProjetoCaixaEletronico.resultado";
    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();
    ArrayList<String> lista;
    Activity atividade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_extrato_resultado);
        atividade = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        lista = buscarExtrato(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,lista);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

            }
        });
        mActivityName = getString(R.string.activity_a);
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_create));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    public ArrayList<String> buscarExtrato(String chave){
        ArrayList<String> lista = geraListaExtrato();
        if (chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<String> subLista = new ArrayList<>();
            for(String resultado:lista){
                if(resultado.toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(resultado);
                }
            }
            return subLista;
        }
    }
    public ArrayList<String> geraListaExtrato(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("100000");
        lista.add("20000");
        lista.add("30000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("40000");
        lista.add("449486");
        lista.add("449486");
        lista.add("449486");
        lista.add("449486");
        return lista;
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
        ListaExtratoResultado.this.finish();
    }

}
