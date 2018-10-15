package com.example.liv.currencyconverter.Interfaces;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NBPApiInterface {

    @GET("api/exchangerates/tables/C/")
    Call<ResponseBody> getCurrencyTable();
}
