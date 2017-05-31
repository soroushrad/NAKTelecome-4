package plazmid.naktelecome.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import plazmid.naktelecome.R;

/**
 * Created by soroush on 3/31/2017 AD.
 */

public class FactListAdapter extends BaseAdapter {
    private Context mContext;
    private String names[];
    private Integer icons[];

    public FactListAdapter(Context mContext, String[] names, Integer[] icons) {
        this.mContext = mContext;
        this.names = names;
        this.icons = icons;
    }

    public FactListAdapter(Context mContext, String[] name) {

    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = LayoutInflater.from(mContext).inflate(R.layout.item_factlist_layout, parent, false);
        TextView name = (TextView) rowView.findViewById(R.id.name);
        ImageView icon = (ImageView) rowView.findViewById(R.id.icon);
        name.setText(names[position]);
        icon.setImageResource(icons[position]);


        return rowView;
    }
}
