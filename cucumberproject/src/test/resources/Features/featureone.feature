Feature: Contact Page Negative Test for name field

Scenario: Name field on contact page should not accept numeric values 
Given Application url completely launched and user is on the contact page
When User enter a name with numbers in the name field and submit the contact form
Then after submitting contact form user should see an error message indicating that Please enter valid name

Scenario: Name field on contact page should not accept special characters 
Given Application url completely launched and user is on the contact page
When User enter a name with special characters in the name field and submit the contact form
Then after submitting contact form user should see an error message indicating that Please enter valid name


Scenario: Submitting an empty contact form
Given Application url completely launched and user is on the contact page
When user click the "Submit" button without filling out the form
Then user should see an error message "Please fill out all the required fields."

Scenario: Filling out the Contact Form correctly
Given Application url completely launched and user is on the contact page
When user fill in the contact form information correctly
Then user should see a confirmation message

