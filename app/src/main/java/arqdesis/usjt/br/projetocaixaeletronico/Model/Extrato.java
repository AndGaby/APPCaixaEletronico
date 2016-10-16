package arqdesis.usjt.br.projetocaixaeletronico.Model;

import java.util.Date;

/**
 * Created by Anderson on 16/10/2016.
 */
public class Extrato {
    int id, codMovimento, numConta, agenciaDestino, contaDestino, codCli;
    String tipoMovimento, dataOracao;

    public Extrato() {
    }

    public Extrato(int id, int numConta, int codMovimento, int agenciaDestino, int contaDestino, int codCli, String dataOracao, String tipoMovimento) {
        this.id = id;
        this.numConta = numConta;
        this.codMovimento = codMovimento;
        this.agenciaDestino = agenciaDestino;
        this.contaDestino = contaDestino;
        this.codCli = codCli;
        this.dataOracao = dataOracao;
        this.tipoMovimento = tipoMovimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(int codMovimento) {
        this.codMovimento = codMovimento;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgenciaDestino() {
        return agenciaDestino;
    }

    public void setAgenciaDestino(int agenciaDestino) {
        this.agenciaDestino = agenciaDestino;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getDataOracao() {
        return dataOracao;
    }

    public void setDataOracao(String dataOracao) {
        this.dataOracao = dataOracao;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }
}