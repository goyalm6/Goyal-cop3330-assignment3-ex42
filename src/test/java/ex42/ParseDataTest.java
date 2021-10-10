package ex42;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ParseDataTest {
    private ParseData parseData;
    BufferedReader br;
    @BeforeEach
    void setUp() throws IOException {
        parseData = new ParseData();
        parseData.inputFile = "src/main/resources/exercise42_input.txt";
        br = Files.newBufferedReader(Paths.get("src/main/resources/exercise42_input.txt"));
    }

    @AfterEach
    void tearDown() {
        parseData = null;
    }

    @Test
    void testParseColumnLength() {
        String[] columns = parseData.readFile(br);
        assertEquals(3, columns.length);
        assertEquals("51500", columns[2]);
    }

    @Test
    void testParseColumnData() {
        String[] columns = parseData.readFile(br);
        assertEquals("Zarnecki", columns[0]);
        assertEquals("Sabrina", columns[1]);
        assertEquals("51500", columns[2]);
    }
}