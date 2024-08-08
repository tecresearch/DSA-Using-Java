package ds.util.algorithm.contents;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Content {
	
	
    public static void main(String[] args) {
   
        try {
            // Specify the path to the content.txt file
            FileReader fileReader = new FileReader("README.md");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
