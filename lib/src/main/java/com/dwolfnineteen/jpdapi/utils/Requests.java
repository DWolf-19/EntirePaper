/*
Copyright (c) 2023 DWolf Nineteen & The JPD-API contributors

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.dwolfnineteen.jpdapi.utils;

import com.dwolfnineteen.jpdapi.exceptions.InvalidRequestException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Requests {
    private static final OkHttpClient client;
    private static final String domain;
    private static final String APIVersion;
    private static final Logger logger;

    static {
        client = new OkHttpClient();
        domain = "api.papermc.io";
        APIVersion = "v2";
        logger = LoggerFactory.getLogger(Requests.class);
    }

    @NotNull
    public static String get(@NotNull String url) {
        String fullURL = String.format("https://%s/%s/%s", domain, APIVersion, url);

        logger.debug("(Sync) GET {}", fullURL);

        Request request = new Request.Builder().url(fullURL).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.code() == 404)
                throw new InvalidRequestException(url);

            return response.body().string();

        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
