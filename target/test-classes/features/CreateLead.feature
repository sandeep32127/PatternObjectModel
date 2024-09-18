Feature: Login To LeafTaps

Scenario Outline: Create Lead using LeafTaps
And Enter the User Name as <uName>
And Enter the password as <pwd>
And click on the Login Button
And click on the CRMlink
And click on the leads button in the leadspage
And click on the create Lead button
And Enter the company name as <cName>
And Enter the first name of the lead as <Fname>
And enter the last name of the lead as <Lname>
And enter the source for the lead
When click on the submit button
Then create lead should be successfull
Examples:
|uName|pwd|cName|Fname|Lname|
|DemoSalesManager|crmsfa|TCS|Sandeep|Dalei|
|DemoCSR|crmsfa|Cognizant|Rameez|Raz|
