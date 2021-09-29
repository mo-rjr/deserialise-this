package uk.gov.metoffice.hello.ser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * {A thing} to {do something} for {another thing}
 * -- for example, {this}
 * -- and also {this}
 */
// TODO fill in Javadoc
public class Main {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.example();
        main.simple();
        main.challenge();
    }

    private void example() throws IOException {
        String fileContent = readFileFromResourcesFolder("moreComplicatedObject.json");
        MoreComplicatedObject moreComplicatedObject = OBJECT_MAPPER.readValue(fileContent, MoreComplicatedObject.class);
        System.out.println(moreComplicatedObject);
    }

    private void simple() throws IOException {
        String fileContent = readFileFromResourcesFolder("simple.json");
        Simple simple = OBJECT_MAPPER.readValue(fileContent, Simple.class);
        System.out.println(simple); // implement a toString method on Simple -- or autogenerate one
    }

    private void challenge() throws IOException {
        String fileContent = readFileFromResourcesFolder("challenge.json");
        Challenge simple = OBJECT_MAPPER.readValue(fileContent, Challenge.class);
        System.out.println(simple); // implement a toString method on Simple -- or autogenerate one
    }




    private String readFileFromResourcesFolder(String filename) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(filename))))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        }
    }
}
