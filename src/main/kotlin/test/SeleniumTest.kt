package test

import based.CommandBased
import config.ConfigDriver
import org.openqa.selenium.WebDriver
import pages.HomePage
import pages.IDEAPage

val chromeDriver: WebDriver = ConfigDriver.initializeChromeDriver()
val firefoxDriver: WebDriver = ConfigDriver.initializeFirefoxDriver()
val edgeDriver: WebDriver = ConfigDriver.initializeEdgeDriver()

val HomePage = HomePage()
val IDEAPage = IDEAPage()
val I = CommandBased()

fun searchTest(driver: WebDriver) {
    HomePage.openPage(driver)
    I.Click(HomePage.searchIcon)
    HomePage.search(driver)

    IDEAPage.verifyDownloadButtonPresent(driver)
    IDEAPage.verifyPageTitle(driver)
    IDEAPage.clickDownloadButton(driver)
    IDEAPage.clickPricingButton(driver)
    IDEAPage.selectPricingOption(driver)

    ConfigDriver.quitDriver(driver)
}
fun main() {
    searchTest(chromeDriver)
    /*searchTest(firefoxDriver)
    searchTest(edgeDriver)*/
}
