// Import necessary Java libraries for input/output and date formatting
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


// Define an abstract class named AnagramBase
abstract class AnagramBase {



    // Create a set to cache results and initialise it as a HashSet
    protected Set<String> cache = new HashSet<>();

    // Define a file path for storing results
    protected String resultsFilePath = "results.txt";

    // Define a method to check if a username is valid
    public boolean isValidUsername(String username) {
        // Check if the username is not null, not empty, and contains only letters
        return username != null && !username.isEmpty() && username.matches("^[a-zA-Z]+$");
    }

    // Define a method to check if text is valid
    protected boolean isValidText(String text) {
        // Check if the text is not null, not empty, and contains only letters
        return text != null && !text.isEmpty() && text.matches("^[a-zA-Z]+$");
    }

    // Define a method to check if two strings are anagrams
    protected boolean isAnagram(String str1, String str2) {
        // Check if the lengths of the two strings are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are equal, indicating that the strings are anagrams
        return Arrays.equals(charArray1, charArray2);
    }

    // Define a method to load results from a file
    protected void loadResultsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(resultsFilePath))) {
            String line;
            // Read each line from the file and add it to the cache
            while ((line = reader.readLine()) != null) {
                cache.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle and print any IO exceptions
        }
    }

    // Define a method to check if a pair of texts is already in the results
    protected boolean isAlreadyInResults(String text1, String text2) {
        for (String entry : cache) {
            String[] parts = entry.split(",");
            // Check if the 'parts' array has at least three elements
            if (parts.length >= 3) {
                String storedText1 = parts[1];
                String storedText2 = parts[2];
                // Check if the given texts match the stored texts in the cache
                if (text1.equals(storedText1) && text2.equals(storedText2)) {
                    return true;
                }
            }
        }
        return false; // Return false if the texts are not found in the cache
    }

    // Define a method to store results in a file
    protected void storeResultsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultsFilePath, true))) {
            Date timestamp = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedTimestamp = dateFormat.format(timestamp);

            for (String entry : cache) {
                // Append a timestamp to each entry and write it to the file
                String entryWithTimestamp =  "Timestamp:" +" |" +  formattedTimestamp + ", " + entry;
                writer.write(entryWithTimestamp);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle and print any IO exceptions
        }
    }
}
