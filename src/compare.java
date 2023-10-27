import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class compare {
    public static void main(String[] args) {
        String file1Path = "newFollowers.txt"; // newFollowers usernames file
        String file2Path = "newFollowing.txt"; // newFollowing usernames file
        String outputPath = "followingButNotFollowers.txt"; // name of output file

        List<String> usernamesList1 = new ArrayList<>();
        List<String> usernamesList2 = new ArrayList<>();
        List<String> uniqueFollowing = new ArrayList<>();

        // read names from followers file
        try (BufferedReader reader = new BufferedReader(new FileReader(file1Path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                usernamesList1.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read names from following file
        try (BufferedReader reader = new BufferedReader(new FileReader(file2Path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                usernamesList2.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // find names that aren't in followers but are in following
        for (String username : usernamesList2) {
            if (!usernamesList1.contains(username)) {
                uniqueFollowing.add(username);
            }
        }

        // print them to a new output file
        try (FileWriter writer = new FileWriter(outputPath)) {
            for (String username : uniqueFollowing) {
                writer.write(username + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //output the usernames of people who don't follow back because I am not anyone's fan :')
        System.out.println("Usernames of people who don't follow back have been saved to: " + outputPath + ".");
    }
}
