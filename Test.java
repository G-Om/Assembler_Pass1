/**
 * Test
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    private BufferedReader br ;
    public  void read() throws IOException{
        System.out.println("File reader");
        String line;
        br = new BufferedReader(new FileReader("Input.txt"));
        
        while((line=br.readLine())!= null){
            System.out.println(line);
        }

    }
    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}