package com.example.nitinmehta.stockticker;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by NitinMehta on 17/01/2018.
 */

public interface ApiService {

    @GET ("query?function=TIME_SERIES_DAILY&symbol=MSFT&apikey=GJ203WSCWIQP2XCT")
    Call<IntradayList> getMyJSON();
}
