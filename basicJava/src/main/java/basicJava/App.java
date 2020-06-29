package basicjava;

import java.util.ArrayList;
import csvop.CsvReader;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<String[]> contents = CsvReader.Read();
        for (String[] row: contents) {
            String numrow = "";
            for (String item: row) {
                numrow += "," + item;
            }
            System.out.println(numrow);
        }

    }
}
