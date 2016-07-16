package in.silive.happyb_day.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import in.silive.happyb_day.R;

/**
 * Created by akriti on 17/7/16.
 */
public class SListAdapter extends BaseAdapter {
    public static String result[];
    public static String occ_result[];
    private static LayoutInflater inflater = null;
    Context c;

    public SListAdapter(String r[], String o[], Context m) {
        result = r;
        occ_result = o;
        c = m;
        inflater = (LayoutInflater) m.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return result.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();
        View rview;
        rview = inflater.inflate(R.layout.adapter_row, null);
        holder.tv = (TextView) rview.findViewById(R.id.stud_name);
        holder.iv = (TextView) rview.findViewById(R.id.stud_occp);
        holder.tv.setText(result[i]);
        holder.iv.setText(occ_result[i]);
        return rview;
    }

    public class Holder {
        TextView tv;
        TextView iv;
    }
}
