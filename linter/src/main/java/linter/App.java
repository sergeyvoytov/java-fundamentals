package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/main/resources/gates.js";
        System.out.println(new App().linter(path));
    }

    public static String linter(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        String result = "";
        int line = 1;
        while (scanner.hasNext()) {
            String scannerLine = scanner.nextLine();
            if (!scannerLine.isEmpty() && !scannerLine.endsWith("{") && !scannerLine.endsWith("}") && !scannerLine.contains("if") && !scannerLine.contains("else") && !scannerLine.endsWith(";")) {
                result += String.format("Line: %d missing semicolon.", line);
            }
            line++;
        }
        return result;
    }
}


