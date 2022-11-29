package com.zantung.pheptinh.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.zantung.pheptinh.R;
import com.zantung.pheptinh.model.ThiTiengAnh;

import java.util.List;

public class ThiTiengAnhAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ThiTiengAnh> thiTiengAnhList;

    public ThiTiengAnhAdapter(Context context, int layout, List<ThiTiengAnh> thiTiengAnhList) {
        this.context = context;
        this.layout = layout;
        this.thiTiengAnhList = thiTiengAnhList;
    }

    @Override
    public int getCount() {
        return thiTiengAnhList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
//        TextView txtIDThi;
        TextView edtTenThi;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            //anh xa
//            holder.txtIDThi = view.findViewById(R.id.id_thi);
            holder.edtTenThi = view.findViewById(R.id.tvNameThi);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        //gán giá trị
        ThiTiengAnh thiTiengAnh = thiTiengAnhList.get(i);
//        holder.txtIDThi.setText(thiTiengAnh.getId_thi());
        holder.edtTenThi.setText(thiTiengAnh.getTen_thi());
        return view;
    }
}
