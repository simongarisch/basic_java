package basicjava;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
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

        parseDateTime();
    }

    public static void parseDateTime() {
        DateTimeFormatter parser = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime dateTime = parser.parseDateTime("2014-06-09");
        System.out.println(dateTime);
    }

}
