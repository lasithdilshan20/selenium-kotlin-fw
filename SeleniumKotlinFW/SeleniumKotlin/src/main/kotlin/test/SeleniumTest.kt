package test

import config.ConfigDriver
import org.openqa.selenium.WebDriver
import pages.HomePage
import pages.ResultPage

val chromeDriver: WebDriver = ConfigDriver.initializeChromeDriver()
/*val firefoxDriver: WebDriver = ConfigDriver.initializeFirefoxDriver()
val edgeDriver: WebDriver = ConfigDriver.initializeEdgeDriver()
val chromeDriverHeadless: WebDriver = ConfigDriver.initializeChromeDriverHeadless()*/

val HomePage = HomePage()
val ResultPage = ResultPage()

fun searchTest(driver: WebDriver) {
    HomePage.openPage(driver)
    HomePage.search(driver)
    ResultPage.verifyDownloadButtonPresent(driver)
    ResultPage.verifyPageTitle(driver)
    ConfigDriver.quitDriver(chromeDriver)
}
fun main() {
    searchTest(chromeDriver)
}
