package com.sashika.lombok;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

/**
 * Created by Sashika.Udana
 * on 02/Mar/2023
 */
@Slf4j
public class FileHandler {

    public Optional<List<String>> read(String path) {
        try {
            return Optional.of(Files.readAllLines(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public List<String> readByPath(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }

    @SneakyThrows
    public List<String> readFrom(String path) {
        log.info("This is lombok logging support ........");
        return Files.readAllLines(Paths.get(path));
    }

}
