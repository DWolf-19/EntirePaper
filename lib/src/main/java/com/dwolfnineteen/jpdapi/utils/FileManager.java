package com.dwolfnineteen.jpdapi.utils;

import org.jetbrains.annotations.NotNull;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
    public static void toFile(byte[] buffer, @NotNull String outputPath) {
        try (FileOutputStream file = new FileOutputStream(outputPath)) {
            file.write(buffer, 0, buffer.length);

        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
