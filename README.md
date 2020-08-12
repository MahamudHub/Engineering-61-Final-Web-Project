ReadMe
# Engineering-61 Final Project

This framework has been built to automate the testing for a candid


## Getting Started

The first step in using this framework is to clone the repository. Once you open the framework in your IDE following the prerequisites below will allow you to work with the framework however you please. 

## Prerequisites

### Prerequisites: Properties

To use this framework, you will need to create a properties file in your resources folder to call all your credentials to login to the pages.

- Name your properties file: **credentials.properties**

Below is an example of how you should write your credentials in the properties file.
```
username=yourAdminUsername
password=adminPassword
candidatename=Candidate Name
candidateemail=candidate@email.com
candidatepassword=CandidateEmailPassword
recruiteremail= recruiter@email.com
recruiterpassword= recruiterEmailPassword
```
In the project there is a class called Propertiesloader in the helpers’ package, this class will handle the return of the credentials from the properties file.


 ```java 
PropertiesFileLoader properties = new PropertiesFileLoader();
properties.getCandidateEmail();

 ```

### Prerequisites: Web Driver

In the project there is a class called WebDriverFactory in the helpers’ package, this class will handle the return of the Webdrivers for different browsers such as Chrome, Firefox and Edge browser.

- The code below shows how to use the different web driver for each browser

```java 
WebDriver webDriver = WebDriverFactory.selectDriver(“Firefox”);

WebDriver webDriver = WebDriverFactory.selectDriver(“Chrome”);

WebDriver webDriver = WebDriverFactory.selectDriver(“Edge”);
 ```




## Using the Framework

The test framework is very simple and will allow you to use methods already created to run your tests. Here are a few ways you could use the framework:

### Unit Testing

To test components of the website in isolation our framework has pre-existing methods that you can call. For example, if I wanted to test that the error message has the correct spelling. All it would is your expected answer to be the correct spelling and our method for checking the header, this is shown below:
```java
WebDriver webDriver = WebDriverFactory.selectDriver(“Firefox”);
LoginPage loginPage = new LoginPage(webDriver);

@Test
public void loginErrorMessageTest(){
Assertions.assertTrue(true, loginPage.isTokenErrorMessageCorrect);
}
```
Each webpage has its own Page Object Model, which contains methods that can be used to test components of the webpage.




## Testing

A step by step series of examples that tell you how to get a development env running 

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo
## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Contributing

To contribute on this project, if you want to contribute to the project and make it better, your help is very welcome. helpful bug reports, feature requests and the noblest of all contributions: a good, clean pull request.

### How to make a clean pull request

Project's contribution instructions. To follow

- Create a personal fork of the project on Github.
- Clone the fork on your local machine. Your remote repo on Github is called `origin`.
- Add the original repository as a remote called `upstream`.
- If you created your fork a while ago be sure to pull upstream changes into your local repository.
- Create a new branch to work on! Branch from `dev` or `master`
- Implement/fix your feature, comment your code.
- Follow the code style of the project, including indentation & correct naming convention.
- If the project has tests run them!
- Write or adapt tests as needed.
- Push your branch to your fork on Github, the remote `origin`.
- From your fork open a pull request in the correct branch. Target the project's `develop` branch or go for `master`!
- Once the pull request is approved and merged you can pull the changes from `upstream` to your local repo and delete
your extra branch(es).

And last but not least: Always write your commit messages in the present tense. 
Your commit message should describe what the commit, when applied, does to the code – not what you did to the code.

#### Correct naming convention

```
e.g. 
Name-ClassFeature-DATE.
Bob-LoginPageErrorMessage-11082020.

```


## Creating A New Page Object Model (POM)
It is important that before creating methods for testing you create your own page object model. This ensures that none of the previously written methods are affected by any of your implementation. 

The class should be placed within a package named after the page you are working on and placed within the pageobjects package. 

The name of your pom should be the same as the name of the webpage it is interacting with. An example of the project structure and naming is given below:

![ProjectStructure](Assets/ProjectStructureOfPOM.jpg)
### Testing:
During the development of this framework there were mainly 3 stages of testing. These 3 stages can also be followed when you further develop the framework and create your own methods. 

#### Stage 1: Unit Testing
The idea behind unit testing is to test each component of the system in isolation. For example, checking if you can click a link. The first step to doing this is to create a method that actually performs the action that you 


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
 * [Junit](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.6.2) - Dependency
 * [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59/) – Dependency
 * [Cucumber Java](https://mvnrepository.com/artifact/io.cucumber/cucumber-java/6.2.0) - Dependency
 * [Cucumber Junit]( https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/6.2.0) - Dependency

 * [Chrome Driver](https://chromedriver.chromium.org/downloads) – Driver
 * [Firefox Driver](https://github.com/mozilla/geckodriver/releases) – Driver
 * [Edge Driver]( https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/) - Driver

## Authors

* **Mohamed Mahamud** - [MahamudHub]( https://github.com/MahamudHub)

See also the list of [contributors](https://github.com/MahamudHub/project/contributors) who participated in this project.


## Acknowledgments

* Hat tip to anyone whose code was used (Darrell Grainger)
* Inspiration
* etc


