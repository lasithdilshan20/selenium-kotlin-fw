package test

import config.ConfigDriver
import org.openqa.selenium.WebDriver
import pages.HomePage
import pages.ResultPage

val chromeDriver: WebDriver = ConfigDriver.initializeChromeDriver()
val HomePage = HomePage()
val ResultPage = ResultPage()
fun main() {
    HomePage.openPage(chromeDriver)
    HomePage.search(chromeDriver)
    ResultPage.verifyDownloadButtonPresent(chromeDriver)
    ResultPage.verifyPageTitle(chromeDriver)

    ConfigDriver.quitDriver(chromeDriver)
}
