# Test Automation

A Java-based web test automation project that uses the **Page Object Model (POM)** design pattern.

## Highlights

- reusable page objects built with Selenium PageFactory;
- shared browser and explicit-wait setup in `BasePage`;
- dedicated page objects for login and navigation flows;
- Maven-based dependency management.

## Technologies

- Java 23
- Maven
- Selenium WebDriver
- TestNG
- Cucumber
- REST Assured
- Extent Reports

## Page Object Model Structure

- `Pages/BasePage.java` — shared WebDriver and WebDriverWait setup;
- `Pages/LoginPage.java` — login page locators and login action;
- `Pages/HomePage.java` — navigation actions for the home page.

This separation keeps page locators and user actions independent from test logic, making the test suite easier to maintain and extend.

## Run Locally

### Prerequisites

- JDK 23
- Maven
- Google Chrome

### Steps

1. Clone the repository.
2. From the project directory, run:

```bash
mvn test
```

## Status

The project is actively evolving. Future improvements can include broader test coverage, reusable test data, reporting, and CI integration.
