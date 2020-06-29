package csvop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {

    public static ArrayList<String[]> Read() {
        String pathToCsv = "test.csv";
        ArrayList<String[]> contents = new ArrayList<String[]>();

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] line = row.split(",");
                contents.add(line);
            }
            csvReader.close();
        }
        catch (IOException ex){
            System.out.println (ex.toString());
            System.out.println("Could not find file " + pathToCsv);
        }

        return contents;
    }

}