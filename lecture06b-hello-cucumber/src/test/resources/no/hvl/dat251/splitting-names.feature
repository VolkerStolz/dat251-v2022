Feature: We want to split a full name into first name and last name

Scenario: A full name with a single first name and a single last name
Given the full name "Atle Patle"
When we split the name
Then the first name should be "Atle"
And the last name should be "Patle"

#Scenario: A full name with a double first name and a single last name
#Given the full name "Per Atle Patle"
#When we split the name
#Then the first name should be "Per Atle"
#And the last name should be "Patle"

