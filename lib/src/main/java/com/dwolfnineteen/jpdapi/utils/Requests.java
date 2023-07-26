package com.dwolfnineteen.jpdapi.utils;

import com.dwolfnineteen.jpdapi.exceptions.InvalidRequestException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Requests {
    private static final OkHttpClient client;
    private static final String domain;
    private static final String APIVersion;

    static {
        client = new OkHttpClient();
        domain = "api.papermc.io";
        APIVersion = "v2";
    }

    @NotNull
    public static String get(@NotNull String url) {
        Request request = new Request.Builder()
                .url(String.format("https://%s/%s/%s", domain, APIVersion, url))
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.code() == 404)
                throw new InvalidRequestException(url);

            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
