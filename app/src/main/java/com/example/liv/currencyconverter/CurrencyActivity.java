package com.example.liv.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CurrencyActivity extends AppCompatActivity {

    String[] NAMES = {"USD", "AUD","CAD","EUR","HUF","CHF","CHF","GBP","JPY","CZK","DKK","NOK","SEK","XDR"};
    String SELL ="Sell";
    String BUY= "Buy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        ListView listview= (ListView) findViewById(R.id.listView);

        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{


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
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_currency);
            TextView textView_sell=(TextView)view.findViewById(R.id.textView_sell);
            TextView textView_buy=(TextView)view.findViewById(R.id.textView_buy);

            textView_name.setText(NAMES[position]);
            textView_sell.setText(SELL);
            textView_buy.setText(BUY);

            return view;
        }
    }
}
