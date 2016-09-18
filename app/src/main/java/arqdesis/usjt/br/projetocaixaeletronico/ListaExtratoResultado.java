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

import java.util.ArrayList;

public class ListaExtratoResultado extends AppCompatActivity {
    public static final String RESULTADO = "br.usjt.arqdesis.ProjetoCaixaEletronico.resultado";
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
}
