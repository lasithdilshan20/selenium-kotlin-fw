package config

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver

open class ConfigDriver {
    companion object {
        fun initializeChromeDriver(): WebDriver {
            // Set the system property for ChromeDriver
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe")

            // Initialize the WebDriver (in this case, using Chrome)
            return ChromeDriver()
        }

        fun initializeFirefoxDriver(): WebDriver {
            // Set the system property for FirefoxDriver
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe")

            // Initialize the WebDriver (in this case, using Firefox)
            return FirefoxDriver()
        }

        fun initializeEdgeDriver(): WebDriver {
            // Set the system property for EdgeDriver
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe")

            // Initialize the WebDriver (in this case, using Edge)
            return EdgeDriver()
        }

        fun quitDriver(driver: WebDriver) {
            driver.quit()
        }

    }
}