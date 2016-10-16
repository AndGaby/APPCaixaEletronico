package arqdesis.usjt.br.projetocaixaeletronico.Model;

import android.widget.TextView;

/**
 * Created by Anderson on 16/10/2016.
 */
public class ViewHolder {

    TextView codMovimento, numConta, agenciaDestino, contaDestino, codCli, tipoMovimento, dataOperacao;

    public ViewHolder(TextView tipoMovimento, TextView dataMovimento) {
        this.tipoMovimento = tipoMovimento;
        this.dataOperacao = dataMovimento;
    }

    public TextView getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(TextView codMovimento) {
        this.codMovimento = codMovimento;
    }

    public TextView getNumConta() {
        return numConta;
    }

    public void setNumConta(TextView numConta) {
        this.numConta = numConta;
    }

    public TextView getAgenciaDestino() {
        return agenciaDestino;
    }

    public void setAgenciaDestino(TextView agenciaDestino) {
        this.agenciaDestino = agenciaDestino;
    }

    public TextView getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(TextView contaDestino) {
        this.contaDestino = contaDestino;
    }

    public TextView getCodCli() {
        return codCli;
    }

    public void setCodCli(TextView codCli) {
        this.codCli = codCli;
    }

    public TextView getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(TextView tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public TextView getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(TextView dataOracao) {
        this.dataOperacao = dataOracao;
    }
}