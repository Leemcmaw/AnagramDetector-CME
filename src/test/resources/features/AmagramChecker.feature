#Feature: Anagram Checker
#  As a user,
#  I want to check if two text values are anagrams,
#  So that I can determine if they use the same letters in the same quantity.
#
#  Scenario: Check if two text values are anagrams
#    Given I am using the Anagram Checker
#    When I enter my username as "Alice"
#    And I enter the first text value as "listen"
#    And I enter the second text value as "silent"
#    And I choose to continue
#    Then I should see the message "The two text values are anagrams."
#
#  Scenario: Check if two text values are not anagrams
#    Given I am using the Anagram Checker
#    When I enter my username as "Bob"
#    And I enter the first text value as "hello"
#    And I enter the second text value as "world"
#    And I choose to continue
#    Then I should see the message "The two text values are not anagrams."
#
#  Scenario: Handle invalid username
#    Given I am using the Anagram Checker
#    When I enter my username as "123 John"
#    Then I should see the message "Invalid username. Username cannot contain spaces, numbers, or special characters."
#
#  Scenario: Handle invalid text values
#    Given I am using the Anagram Checker
#    When I enter my username as "Charlie"
#    And I enter the first text value as "123"
#    Then I should see the message "Invalid text value. Text values cannot contain spaces, numbers, or special characters."
#
#  Scenario: Handle duplicates in cache
#    Given I am using the Anagram Checker
#    When I enter my username as "David"
#    And I enter the first text value as "hello"
#    And I enter the second text value as "world"
#    And I choose to continue
#    And I enter my username as "David"
#    And I enter the first text value as "hello"
#    And I enter the second text value as "world"
#    Then I should see the message "Error: hello and world are already in cache."
#
#  Scenario: Handle duplicates in results
#    Given I am using the Anagram Checker
#    When I enter my username as "Eve"
#    And I enter the first text value as "apple"
#    And I enter the second text value as "banana"
#    And I choose to continue
#    And I enter my username as "Eve"
#    And I enter the first text value as "apple"
#    And I enter the second text value as "banana"
#    Then I should see the message "Error: apple and banana are already in cache or results.txt."
