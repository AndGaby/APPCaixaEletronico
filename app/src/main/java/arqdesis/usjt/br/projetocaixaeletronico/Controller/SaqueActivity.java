package arqdesis.usjt.br.projetocaixaeletronico.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import arqdesis.usjt.br.projetocaixaeletronico.R;

public class SaqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saque);
    }

    public void outroValor(View view){
        Intent intent = new Intent(this, OutrosValoresActivity.class);
        startActivity(intent);
    }
}
