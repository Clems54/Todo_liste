package fr.univ.clement.todo_liste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cleme on 12/02/2018.
 */

public class ProductListAdapter extends BaseAdapter {
    private LayoutInflater inflat;
    private ArrayList<Product> prods;

    public ProductListAdapter(Context context, ArrayList<Product> list){
        this.inflat = LayoutInflater.from(context);
        prods = list;
    }

    @Override
    public int getCount() {
        return this.prods.size();
    }

    @Override
    public Product getItem(int i) {
        return this.prods.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = this.inflat.inflate(R.layout.row, null);
        TextView categ = (TextView) convertView.findViewById(R.id.itemcateg);
        TextView name = (TextView) convertView.findViewById(R.id.itemname);
        categ.setText(getItem(position).getCategory());
        name.setText(getItem(position).getTitle());
        return convertView;
    }
}
