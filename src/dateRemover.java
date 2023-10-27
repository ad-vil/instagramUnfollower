import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// BE SURE TO READ THE README.txt FILE or it probaby won't work

public class dateRemover {
    public static void main(String[] args) {
        processFile("following.txt", "newFollowing.txt");
        processFile("followers.txt", "newFollowers.txt");
    }

    private static void processFile(String inputFileName, String outputFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             PrintWriter pw = new PrintWriter(new FileWriter(outputFileName))) {

            String line;
            boolean skipNextLine = false;

            while ((line = br.readLine()) != null) {
                if (!skipNextLine) {
                    pw.println(line);
                }
                skipNextLine = !skipNextLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Usernames extracted from " + inputFileName + " and saved to " + outputFileName + ".");
    }
}
