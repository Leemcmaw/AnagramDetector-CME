// Import necessary Java libraries for input/output and date formatting
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Define a test class named 'AnagramDetectorTest' for testing the 'AnagramDetector' class
class AnagramDetectorTest {

    // Test method for validating a valid username
    @Test
    void testIsValidUsernameValid() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Assert that a valid username "ValidUsername" is considered valid
        assertTrue(anagramDetector.isValidUsername("ValidUsername"));
    }

    // Test method for validating an invalid username
    @Test
    void testIsValidUsernameInvalid() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Assert that an invalid username "InvalidUsername123" is considered invalid
        assertFalse(anagramDetector.isValidUsername("InvalidUsername123"));
    }

    // Test method for validating valid text
    @Test
    void testIsValidTextValid() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Assert that valid text "ValidText" is considered valid
        assertTrue(anagramDetector.isValidText("ValidText"));
    }

    // Test method for validating invalid text
    // Negative Test
    @Test
    void testIsValidTextInvalid() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Assert that invalid text "InvalidText123" is considered invalid
        assertFalse(anagramDetector.isValidText("InvalidText123"));
    }

    // Test method for checking if two words are anagrams (true case)
    @Test
    void testIsAnagramTrue() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Assert that "listen" and "silent" are recognized as anagrams
        assertTrue(anagramDetector.isAnagram("friend", "finder"));
    }

    // Test method for checking if two words are anagrams (false case)
    @Test
    void testIsAnagramFalse() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Assert that lee mcmaw not recognized as anagrams
        assertFalse(anagramDetector.isAnagram("lee", "mcmaw"));
    }

    // Test method for checking if text values are duplicates (false case)
    @Test
    void testIsDuplicateFalse() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Assert that different text values are not considered duplicates
        assertFalse(anagramDetector.isDuplicate("unique1", "unique2"));
    }

    // Test method for checking if text values are already in cache (true case)
    @Test
    void testIsAlreadyInCacheTrue() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Set up the initial state of the cache with an expected entry
        anagramDetector.cache.add("Username: User | Input1: text1 | Input2: text2 | Result: Anagram!");

        // Assert that "text1" and "text2" are recognised as already in cache
        assertTrue(anagramDetector.isAlreadyInCache("text1", "text2"));
    }

    // Test method for checking if text values are already in cache (false case)
    @Test
    void testIsAlreadyInCacheFalse() {
        // Create an instance of 'AnagramDetector' for testing
        AnagramDetector anagramDetector = new AnagramDetector();

        // Set up the initial state of the cache with a different entry
        anagramDetector.cache.add("Username: User | Input1: unique1 | Input2: unique2 | Result: Not an Anagram.");

        // Assert that "text1" and "text2" are not recognised as already in cache
        assertFalse(anagramDetector.isAlreadyInCache("text1", "text2"));
    }

}
