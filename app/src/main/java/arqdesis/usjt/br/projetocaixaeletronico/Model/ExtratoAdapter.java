package arqdesis.usjt.br.projetocaixaeletronico.Model;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import arqdesis.usjt.br.projetocaixaeletronico.R;

/**
 * Created by Anderson on 16/10/2016.
 */
public class ExtratoAdapter extends BaseAdapter {
    Extrato[] extrato;
    Activity context;

    public ExtratoAdapter(Activity context, Extrato[] extrato) {
        this.context = context;
        this.extrato = extrato;
    }

    @Override
    public int getCount() {
        return extrato.length;
    }

    @Override
    public Object getItem(int i) {
        if(i >=0 && i < extrato.length)
            return extrato[i];
        else
            return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View recycledView, ViewGroup viewGroup) {
        View view = recycledView;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_linha_extrato, viewGroup, false);
            TextView tipoMovimento = (TextView)view.findViewById(R.id.detalhe_tipo_movimento);
            TextView dataMovimento = (TextView)view.findViewById(R.id.data_operacao);
            view.setTag(new ViewHolder(tipoMovimento, dataMovimento));
        }

        ViewHolder holder = (ViewHolder) view.getTag();
        holder.getDataOperacao().setText(extrato[i].getDataOracao());
        holder.getTipoMovimento().setText(extrato[i].getTipoMovimento());

        return view;
    }
}
