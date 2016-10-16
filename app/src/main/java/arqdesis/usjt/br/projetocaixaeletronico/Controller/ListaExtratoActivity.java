package arqdesis.usjt.br.projetocaixaeletronico.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import arqdesis.usjt.br.projetocaixaeletronico.R;
import arqdesis.usjt.br.projetocaixaeletronico.util.StatusTracker;
import arqdesis.usjt.br.projetocaixaeletronico.util.Utils;

public class ListaExtratoActivity extends AppCompatActivity {
    private EditText data;
    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();
    public static final String CHAVE = "br.usjt.arqdesis.clientep1.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_extrato);
        data = (EditText)findViewById(R.id.busca_data_extrato);
        mActivityName = getString(R.string.activity_a);
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_create));
        Utils.printStatus(mStatusView, mStatusAllView);
    }


    public void buscarExtrato(View view){
        Intent intent = new Intent(this, ListaExtratoResultadoActivity.class);
        String chave = data.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
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
        ListaExtratoActivity.this.finish();
    }

}
