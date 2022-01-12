
# Cucumber_Tutorials

Hi All This a Cucumber project for those who want to learn Cucumber and performs some hands-ons.
Feel free to clone the repo and make changes as per your learning/requirements.
This is a maven based project so all you need to do is clone the project in your IDE and\
run -- `mvn clean install`.
About this project, we have all the Features in Features folder and corresponding stepdefinitions in\
src/test/java/stepdefinitions folder.\
TestRunner class in present in src/main/java/TestRunner named as CucumberRunner.\
### Some basics of Cucumber
#### What Is Cucumber?
Cucumber lets you write test scenarios using plain language. 
It is a tool for behavior-driven development (BDD). BDD is a software development process that encourages cross-functional collaboration, in part, through use of a plain-English scripting language called “gherkin” that anyone, technical or not, can read, write, and understand. 
The tests are first written in a simple scenario form that describes the expected behavior of the system from the user’s perspective.\
Cucumber includes the following three files:\
1. Feature file: Here we write the Features to be tested in Gherkin format i.e. Given When Then. We can even run the feature file to execute the test scripts written in the Stepdef file.
2. Stepdef file: Once the Feature file is ready, each sentence of the Feature file can be further implemented over the Stepdef file.
3. Runner File: This is just to execute the actual test script written over the Stepdef file by referring to the feature file. Apart from that, it has many other options for customization, reporting, selective execution, etc.\

In our project I have created 6 Feature files to make understand of concept.In the feature file I've mentioned what concept we are going to implement and test.\
However just for update in using this project I tried to make clear concepts.
- Login.feature --> implements the concept of Background.
- RegisterUser.feature --> implements the concept of DataTables
- Scenario_Outline.feature --> implements the concept of Scenario Outline and Example keyboard.
- CaptureGroup.feature --> implements the concept of capture group.
- Hooks.feature --> implements the concept of Hooks where we have used @Before and @After
- Tags.feature --> implements the concept of Tags @smoke,@regression and @prodfix

**Note:** If you clone this repo and run it you will notice browser is getting opened twice and that is because we have used Hooks and also we have implemented the concept of inheritence where we called driver from DriverUtils package.This is because I dont want to implement everything in a single file 🤭. Rest everything is fine and working. 

Thank You
Happy Coding,
Learn,Code and Earn
Stay Safe and Stay Positive :)





