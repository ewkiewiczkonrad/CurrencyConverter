package com.example.liv.currencyconverter.Models;

import com.google.gson.annotations.SerializedName;

public class Rate {

    @SerializedName("Currency")
    private String _currency;
    @SerializedName("Code")
    private String _code;
    @SerializedName("Bid")
    private double _bid;
    @SerializedName("Ask")
    private double _ask;

    public String getCurrency() {
        return _currency;
    }

    public void setCurrency(String _currency) {
        this._currency = _currency;
    }

    public String getCode() {
        return _code;
    }

    public void setCode(String _code) {
        this._code = _code;
    }

    public double getBid() {
        return _bid;
    }

    public void setBid(double _bid) {
        this._bid = _bid;
    }

    public double getAsk() {
        return _ask;
    }

    public void setAsk(double _ask) {
        this._ask = _ask;
    }

    public Rate(String _currency, String _code, double _bid, double _ask) {
        this._currency = _currency;
        this._code = _code;
        this._bid = _bid;
        this._ask = _ask;
    }
}
