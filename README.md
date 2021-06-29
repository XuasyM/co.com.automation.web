# TECHNICAL TEST
# **Setup instructions**

**tools you must have installed:**

IntelliJ

JAVA 1.8 and JDK

Installation
Set Environment variables

GRADLE

Installation
Set Environment variables

Cucumber

Build Path JREs


IntelliJ download link: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC

Java download link
http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html

Gradle download link: https://gradle.org/releases/


**Cucumber Plugin:**

Search and download Cucumber plugin in IntelliJ

Import web automation project

**Project framework**

co.com.automation.web\src\test\resources\features:
The test scenarios are in the feature files in Gherkin language, example:

co.com.automation.web\src\test\java\co\com\automation\web
Here are the java classes where the project logic is developed. has a structure for each feature and a runner file

**RunnerTags**
This is the file to run the project. in which the name of the tag to be executed is determined

In this case we are going to execute the test cases that have the regression tag in the features files

co.com.automation.web\src\test\resources\driver
It will be the path where the drivers of the browsers are hosted

**serenity.properties**
It is the configuration file for the execution properties of the test cases


#**how to run it**
You can run the project in two ways:
The first is to run the test case on the feature file, there you can run all cases of the feature or run case by case


And the following way is through the runner tags classes mentioned previously
This class allows to execute one or more tags, it also allows you to run tags that apply to several example cases regression or happy path

Run a test case

Run several cases that have the regression tag


#**Generate reports**
To generate the execution report it is necessary to execute the following commands

gradle clean
gradle -Dtest.single=RunnerTags test aggregate

Then a folder is generated in the following directory:
co.com.automation.web\target\site\serenity

And an index.html file is generated











