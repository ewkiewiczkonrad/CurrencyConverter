package com.example.liv.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.liv.currencyconverter.Adapters.CustomAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CurrencyActivity extends AppCompatActivity {

    @BindView(R.id.listView)
    ListView _listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_currency);
        ButterKnife.bind(this);

        CustomAdapter customAdapter = new CustomAdapter(this);
        _listview.setAdapter(customAdapter);
    }
}
