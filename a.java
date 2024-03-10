
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadJavaFileExample {
    public static void main(String[] args) {
        try {
            // Prompt the user to input the URL of the repository
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //System.out.print("URL of the repository: ");
            String repositoryURL = reader.readLine(); Read the URL from the user
            
            // Construct the URL for the specific Java file "a.java"
            URL url = new URL(repositoryURL + "/a.java");
            
            // Open a connection to the URL
            URLConnection connection = url.openConnection();
            
             Create a BufferedReader to read from the input stream of the URL connection
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            // Read each line from the file and print it
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the BufferedReader
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
