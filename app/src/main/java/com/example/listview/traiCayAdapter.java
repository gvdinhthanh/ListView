package com.example.listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class traiCayAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<traiCay> traiCayList;

    public traiCayAdapter(Context context, int layout, List<traiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        TextView txtTen = (TextView) convertView.findViewById(R.id.textViewTen);
        TextView txtChucNang = (TextView) convertView.findViewById(R.id.textViewChucNang);
        ImageView imgHinhAnh = (ImageView) convertView.findViewById(R.id.imageViewHinhAnh);

        traiCay traicay = traiCayList.get(position);

        txtTen.setText(traicay.getTenTraiCay());
        txtChucNang.setText(traicay.getChucNang());
        imgHinhAnh.setImageResource(traicay.getHinhAnh());
        
        return convertView;
    }
}
