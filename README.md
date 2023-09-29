# AnagramDetector-CME
Introduction
Please write a simple command line program based on below requirements.  The program should be in Java or C# 
Your aim should be to deliver well-written, object-oriented code.   

Anagram Checker
Develop a program to accept a username and 2 text values and return an indicator whether the values are an anagram.
A word is an anagram of another word if both use the same letters in the same quantity, but arranged differently.  For example 'friend' and 'finder'.
The delivered program should compile and run.  Include appropriate usage documentation.  Please state any assumptions you have made.
Expected effort is 2-3 hours.

How I have met these requirements:
Validation:

Rejected input values with spaces and numbers using validation checks in the code.
Persistence & Performance:

Results are written to an external file (results.txt) and cached for performance improvement.
Maintainability & Supportability:

The code can be safely modified by other developers and can be supported effectively with the integration of good logging practices.

I Have also met: 
Ensured unique input values in both the cache and file.
Validated that inputs do not contain special characters.
Loaded previous results from the file into the cache upon start-up.

I also implemented cucumber feature file but did not have enough time to finish it.
