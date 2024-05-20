import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextCompressing {

    public static void main(String[] args) {
        String fileSource = "out/Resources/input.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileSource))) {
            //reads the line and assigns it to the holdLine variable
            String holdLine;
            while ((holdLine = br.readLine()) != null) {
                System.out.println(holdLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
