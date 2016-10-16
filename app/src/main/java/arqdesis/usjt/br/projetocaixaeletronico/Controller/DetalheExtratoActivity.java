package arqdesis.usjt.br.projetocaixaeletronico.Controller;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import arqdesis.usjt.br.projetocaixaeletronico.R;

public class DetalheExtratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_extrato);
        Intent intent = getIntent();
        String tipoMovimento = intent.getStringExtra(ListaExtratoResultadoActivity.TIPOMOVIMENTO);
        String codMovimento = intent.getStringExtra(ListaExtratoResultadoActivity.CODIGO);
        String numConta = intent.getStringExtra(ListaExtratoResultadoActivity.NUMEROCONTA);
        String agenciaDestino = intent.getStringExtra(ListaExtratoResultadoActivity.AGENCIADESTINO);
        String contaDestino = intent.getStringExtra(ListaExtratoResultadoActivity.CONTADESTINO);
        String codCli = intent.getStringExtra(ListaExtratoResultadoActivity.CODIGOCLIENTE);
        String dataOracao = intent.getStringExtra(ListaExtratoResultadoActivity.DATAOPERACAO);

        TextView tipMov = (TextView)findViewById(R.id.detalhe_tipo_movimento);
        TextView codMob = (TextView)findViewById(R.id.txt_detalhe_cod_movimento);
        TextView numeroConta = (TextView)findViewById(R.id.txt_detalhe_numero_conta);
        TextView agcDestino = (TextView)findViewById(R.id.lbl_detalhe_agencia_destino);
        TextView cntDestino = (TextView)findViewById(R.id.txt_conta_destino);
        TextView codigoCliente = (TextView)findViewById(R.id.txt_codigo_cliente);
        TextView dateOperacao = (TextView)findViewById(R.id.txt_data_operacao);

        tipMov.setText(tipoMovimento);
        codMob.setText(codMovimento);
        numeroConta.setText(numConta);
        agcDestino.setText(agenciaDestino);
        cntDestino.setText(contaDestino);
        codigoCliente.setText(codCli);
        dateOperacao.setText(dataOracao);
    }
}
