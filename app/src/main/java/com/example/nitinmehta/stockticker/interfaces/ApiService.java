package com.example.nitinmehta.stockticker.interfaces;

import com.example.nitinmehta.stockticker.models.BigData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by NitinMehta on 17/01/2018.
 */

public interface ApiService {

    @GET ("query?function=TIME_SERIES_INTRADAY&symbol=GOOG&interval=15min&outputsize=compact&apikey=GJ203WSCWIQP2XCT")
    Call<BigData> getMyJSON();
}
