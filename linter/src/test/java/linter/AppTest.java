package linter;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class AppTest {
    @Test
    public void testEmpty() throws FileNotFoundException {
        String path = "src/main/resources/test.js";
        String expected = "";
        Assert.assertEquals(expected, App.linter(path));
    }

    @Test
    public void testLinter() throws FileNotFoundException {
        String path = "src/main/resources/gates.js";
        String expected = "Line: 3 missing semicolon.Line: 5 missing semicolon.Line: 11 missing semicolon.Line: 13 missing semicolon.Line: 15 missing semicolon.Line: 26 missing semicolon.Line: 28 missing semicolon.Line: 32 missing semicolon.Line: 36 missing semicolon.Line: 40 missing semicolon.Line: 41 missing semicolon.Line: 50 missing semicolon.Line: 51 missing semicolon.Line: 59 missing semicolon.Line: 60 missing semicolon.Line: 61 missing semicolon.Line: 62 missing semicolon.Line: 64 missing semicolon.Line: 70 missing semicolon.Line: 71 missing semicolon.Line: 72 missing semicolon.Line: 73 missing semicolon.Line: 74 missing semicolon.Line: 76 missing semicolon.Line: 77 missing semicolon.Line: 78 missing semicolon.Line: 79 missing semicolon.Line: 80 missing semicolon.Line: 82 missing semicolon.Line: 83 missing semicolon.Line: 84 missing semicolon.Line: 85 missing semicolon.Line: 86 missing semicolon.Line: 88 missing semicolon.Line: 89 missing semicolon.Line: 90 missing semicolon.Line: 91 missing semicolon.Line: 92 missing semicolon.Line: 94 missing semicolon.Line: 95 missing semicolon.Line: 96 missing semicolon.Line: 97 missing semicolon.Line: 98 missing semicolon.Line: 99 missing semicolon.Line: 100 missing semicolon.Line: 101 missing semicolon.";
        Assert.assertEquals(expected, App.linter(path));
    }
}
