// Import the Scanner class from the java.util package
import java.util.Scanner;

// Define a class named 'AnagramDetector' that extends 'AnagramBase'
class AnagramDetector extends AnagramBase {
    // Define the main method
    public static void main(String[] args) {
        // Create an instance of 'AnagramDetector'
        AnagramDetector anagramDetector = new AnagramDetector();

        // Load existing results from a file into the cache
        anagramDetector.loadResultsFromFile();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Start an infinite loop for user interaction
        while (true) {
            // Prompt the user to enter a username
            System.out.println("--------------------------------------");
            System.out.println("Welcome to Lees Anagram Detector!");
            System.out.println("--------------------------------------");
            System.out.print("Please enter your username: ");
            String username = scanner.nextLine();

            // Check if the entered username is valid using 'isValidUsername' method
            if (!anagramDetector.isValidUsername(username)) {
                System.out.println("Invalid username. Username cannot contain spaces, numbers, or special characters.");
                continue;
            }

            // Prompt the user to enter the first text value
            System.out.print("Please enter the first text value: ");
            String text1 = scanner.nextLine();

            // Prompt the user to enter the second text value
            System.out.print("Please enter the second text value: ");
            String text2 = scanner.nextLine();

            // Check if the entered text values are valid using 'isValidText' method
            if (!anagramDetector.isValidText(text1) || !anagramDetector.isValidText(text2)) {
                System.out.println("Invalid text value. Text values cannot contain spaces, numbers, or special characters.");
                continue;
            }

            // Check if the entered text values are duplicates using 'isDuplicate' method
            if (anagramDetector.isDuplicate(text1, text2)) {
                System.out.println("Error: " + text1 + " and " + text2 + " are already in cache or results.txt.");
                continue;
            }

            // Check if the entered text values are anagrams using 'checkAnagram' method
            String result = anagramDetector.checkAnagram(text1, text2);

            // Display the result to the user
            System.out.println(result);

            // Create an entry string with user and result information
            String entry = "Username: " + username + " |" + " Input1: " + text1 + " |" + " Input2: " + text2 + " |" + " Result: " + result + " |";

            // Add the entry to the cache
            anagramDetector.cache.add(entry);

            // Prompt the user if they want to continue
            System.out.print("Do you wish to continue (yes/no)? ");
            String continueChoice = scanner.nextLine().toLowerCase();

            // If the user chooses "no," exit the loop
            if (continueChoice.equals("no")) {
                break;
            }
        }

        // Store the results in a file
        anagramDetector.storeResultsToFile();
    }

    // Define a method to check if two text values are anagrams
    public String checkAnagram(String text1, String text2) {
        if (isAnagram(text1, text2)) {
            return "Anagram!";
        } else {
            return "Not an Anagram.";
        }
    }

    // Define a private method to check if two text values are duplicates
    public boolean isDuplicate(String text1, String text2) {
        return isAlreadyInResults(text1, text2) || isAlreadyInCache(text1, text2);
    }

    // Define a private method to check if two text values are already in the cache
    public boolean isAlreadyInCache(String text1, String text2) {
        // Iterate through the cache and check if the entry contains the given text values
        for (String entry : cache) {
            if (entry.contains("Input1: " + text1 + " |" + " Input2: " + text2 + " |")) {
                return true;
            }
        }
        return false;
    }
}
