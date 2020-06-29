package basicjava;

import csvop.CsvReader;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    @Test
    public void testCsvReader(){
        ArrayList<String[]> contents = CsvReader.Read();
        assertTrue(contents.size() == 3);
    }
}
