package arqdesis.usjt.br.projetocaixaeletronico.Model;

import java.util.ArrayList;

/**
 * Created by Anderson on 16/10/2016.
 */
public class Data {
    public static Extrato[] _lista;

    public static Extrato[] geraListaClientes(){
        if(_lista == null) {
            Extrato[] lista = new Extrato[5];
            lista[0] = new Extrato(1,201310251, 1, 0445, 6235, 1, "29/11/1995", "Debito Automatico");
            lista[1] = new Extrato(1,201310251, 2, 0445, 6232, 1, "29/11/1995", "Debito Automatico");
            lista[2] = new Extrato(1,201310251, 3, 0445, 6434, 1, "29/11/1995", "Debito Automatico");
            lista[3] = new Extrato(1,201310251, 4, 0445, 6654, 1, "29/11/1995", "Debito Automatico");

            _lista = lista;
        }
        return _lista;
    }

    public static Extrato[] buscaExtrato(String chave){
        Extrato[] lista = geraListaClientes();
        if (chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<Extrato> subLista = new ArrayList<>();
            for(Extrato extrato:lista){
                if(extrato.getDataOracao().toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(extrato);
                }
            }
            return subLista.toArray(new Extrato[0]);
        }
    }
}