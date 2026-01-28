package org.example.fileprocessor;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    FileProcessor fp = new FileProcessor();
    String fileName = "test.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello Lucky";

        fp.writeToFile(fileName, content);
        String result = fp.readFromFile(fileName);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fp.writeToFile(fileName, "JUnit Test");

        assertTrue(Files.exists(Path.of(fileName)));
    }

    @Test
    void testFileNotFoundException() {
        String invalidFile = "nofile.txt";

        Exception exception = assertThrows(IOException.class, () -> {
            fp.readFromFile(invalidFile);
        });

        assertTrue(exception.getMessage().contains("nofile"));
    }}