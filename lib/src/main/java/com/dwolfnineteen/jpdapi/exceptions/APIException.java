package com.dwolfnineteen.jpdapi.exceptions;

import org.jetbrains.annotations.NotNull;

public class APIException extends RuntimeException {
    public APIException(@NotNull String message) {
        super(message);
    }
}
