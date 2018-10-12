package com.example.liv.currencyconverter.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.liv.currencyconverter.R;

import java.lang.annotation.Target;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomAdapter extends BaseAdapter {

    private Context _context;

    private TextView _textView_name;
    private TextView _textView_sell;
    private TextView _textView_buy;

    public CustomAdapter(Context context) {
        _context = context;
    }

    private String[] NAMES = {"USD", "AUD","CAD","EUR","HUF","CHF","CHF","GBP","JPY","CZK","DKK","NOK","SEK","XDR"};
    private String SELL ="Sell";
    private String BUY= "Buy";

    @Override
    public int getCount() {
        return NAMES.length;
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
        LayoutInflater li = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = li.inflate(R.layout.customlayout, null);

        _textView_name = (TextView) view.findViewById(R.id.textView_currency);
        _textView_sell = (TextView) view.findViewById(R.id.textView_sell);
        _textView_buy = (TextView) view.findViewById(R.id.textView_buy);

        _textView_name.setText(NAMES[position]);
        _textView_sell.setText(SELL);
        _textView_buy.setText(BUY);

        return view;
    }
}
