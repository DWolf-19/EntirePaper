package org.dwolf19.jpdapi.exceptions;

import org.jetbrains.annotations.NotNull;

public class APIException extends RuntimeException {
    public APIException(@NotNull String message) {
        super(message);
    }
}
