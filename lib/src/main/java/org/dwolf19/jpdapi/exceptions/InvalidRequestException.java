package org.dwolf19.jpdapi.exceptions;

import org.jetbrains.annotations.NotNull;

public class InvalidRequestException extends APIException {
    public InvalidRequestException(@NotNull String url) {
        super(String.format("(404) Invalid path '%s'", url));
    }
}
