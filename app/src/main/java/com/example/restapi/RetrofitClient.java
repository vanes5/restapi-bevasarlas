package com.example.restapi;

public class RetrofitClient {
    private static final String BASE_URL = "https://retoolapi.dev/69Rwl1/data";
    private static Retrofit retrofit;

    public static Retrofit getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
