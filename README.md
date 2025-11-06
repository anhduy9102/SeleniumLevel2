# Selenium2 Project


## 📋 Prerequisites
Java JDK 11+

Maven 3.6+

- [Java JDK](https://www.oracle.com/asean/java/technologies/) (11+ or later recommended)
- [Maven](https://maven.apache.org/) (comes with Java JDK)
- Chrome browser (or other supported browsers)
- Allure Commandline (optional, for report viewing)

## 📁 Project Structure

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── common/
│   │   │   │   ├── drivers/          # WebDriver management (DriverManager)
│   │   │   │   ├── helpers/          # Helper utilities
│   │   │   │   ├── model/            # Data models (if any)
│   │   │   │   └── utils/            # Config and environment readers
│   │   │   │       ├── ConfigReader.java
│   │   │   │       └── EnvReader.java
│   │   │   ├── core/
│   │   │   │   ├── BasePage.java     # Page base class for POM
│   │   │   │   ├── BaseTest.java     # Base class for tests (setup/teardown)
│   │   │   │   └── ElementWrapper.java  # Element interaction abstraction
│   │   │   └── pages/                # Page Object classes
│   │   └── resources/
│   │       ├── .env                  # Environment configuration
│   │       ├── .env.example          # Template for .env file
│   │       └── config.properties     # Global config file
│   └── test/
│       ├── java/
│       │   └── tests/                # TestNG test cases
│       └── resources/
│           └── testng.xml            # Test suite definition
├── allure-report/                    # Generated Allure reports
├── allure-results/                   # Allure raw results
├── pom.xml                           # Maven configuration file
├── .gitignore                        # Ignored files for Git
└── README.md                         # Project documentation


```

## 🚀 How to Run Tests

1. **Install dependencies:**

   ```bash
   mvn clean install
   ```

2. **Configure environment variables:**

    - Copy `.env.example` to `.env` and fill in your information (e.g. `TA_EMAIL`, `TA_PASSWORD`).

3. **Run all tests:**

   ```bash
   mvn clean test

   ```

   Run tests with tag:

   ```bash
   
   ```

   Or run a specific test file:
   
   ```bash
  
   ```

4. **Run with Allure or Report Portal:**
    - For Allure: Reports are generated automatically (see below).
    - For Report Portal: Set `REPORT=rp` in your environment before running tests.

## 📊 How to View Results

- **Selenium HTML Report:**

  ```bash
  
  ```

  Opens an interactive HTML report in your browser.

- **Allure Report:**

  ```bash
  
  ```

  Opens the Allure report locally.

- **Report Portal:**
  If configured, results are sent to your Report Portal instance.

## 🧩 Features

✅ Page Object Model (POM) structure
✅ Environment configuration via .env
✅ Selenium WebDriver manager
✅ Cross-browser testing
✅ Allure & HTML reports
✅ TestNG parallel execution support
✅ Reusable utilities for reading config & environment
✅ Scalable for CI/CD integration (e.g., GitHub Actions, Jenkins)

## 🛠️ Useful Commands

| Command                     | Description                   |
| --------------------------- | ----------------------------- |
| `mvn clean`                 | Clean previous builds         |
| `mvn test`                  | Run all tests                 |
| `mvn test -Dtest=ClassName` | Run specific test class       |
| `mvn test -Dgroups=tag`     | Run by tag/group              |
| `mvn allure:serve`          | Generate & open Allure report |
| `mvn site`                  | Generate site documentation   |


## 📚 References




---

Feel free to contribute or open issues for improvements!


