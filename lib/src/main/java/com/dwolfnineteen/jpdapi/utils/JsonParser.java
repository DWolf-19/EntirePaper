package com.dwolfnineteen.jpdapi.utils;

import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;

public class JsonParser {
    private static final Gson gson;

    static {
        gson = new Gson();
    }

    @NotNull
    public static <T> T fromJson(@NotNull String string, @NotNull Type classOfT) {
        return gson.fromJson(string, classOfT);
    }
}
