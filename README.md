# Selenium2 Project


## 📋 Prerequisites


- Chrome browser (or other supported browsers)

## 📁 Project Structure

```
├── assets/                  # Static assets
├── docs/                    # Documentation
├── fixtures/                # Test data and fixtures
├── pages/                   # Page Object Model classes
├── reporters/               # Custom reporters
├── tests/                   # Test cases (main test directory)
├── utils/                   # Utility functions

```

## 🚀 How to Run Tests

1. **Install dependencies:**

   ```bash
   
   ```

2. **Configure environment variables:**

    - Copy `.env.example` to `.env` and fill in your information (e.g. `TA_EMAIL`, `TA_PASSWORD`).

3. **Run all tests:**

   ```bash
   
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

- Modern Selenium setup with Java
- Page Object Model for maintainable tests
- Shadow DOM support
- Parallel and cross-browser testing
- Allure and HTML reporting
- Report Portal integration (optional)
- Example tests for login, shopping, shadow DOM, and more

## 🛠️ Useful Commands


## 📚 References




---

Feel free to contribute or open issues for improvements!


