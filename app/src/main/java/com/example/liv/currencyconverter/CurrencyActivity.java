package com.example.liv.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.liv.currencyconverter.Adapters.CustomAdapter;
import com.example.liv.currencyconverter.Interfaces.NBPApiInterface;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyActivity extends AppCompatActivity {

    @BindView(R.id.listView)
    ListView _listview;

    public static final String BASE_URL = "http://api.nbp.pl/";
    public String test = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_currency);
        ButterKnife.bind(this);

        CustomAdapter customAdapter = new CustomAdapter(this);
        _listview.setAdapter(customAdapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NBPApiInterface apiService = retrofit.create(NBPApiInterface.class);

        Call<ResponseBody> call = apiService.getCurrencyTable();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                int statusCode = response.code();
                try {
                    test = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(test);
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                String test = t.getMessage();
                System.out.println( );
            }
        });

        System.out.println();
    }
}
