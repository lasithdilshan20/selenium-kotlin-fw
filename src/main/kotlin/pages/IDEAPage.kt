package pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.junit.Assert.assertEquals

class IDEAPage {
    private val downloadButton: By = By.xpath("//a[text()='Download']")
    private val pageTitleText = "IntelliJ IDEA – the Leading Java and Kotlin IDE"

    fun verifyDownloadButtonPresent(driver: WebDriver) {
        val downloadButtonPresent = if(driver.findElement(downloadButton) != null) "True" else "False"
        assertEquals(downloadButtonPresent, "True")
    }

    fun verifyPageTitle(driver: WebDriver) {
        val pageTitle = driver.title
        if (pageTitle == pageTitleText) {
            println("Title: $pageTitle  Test Passed")
        } else {
            println("Test Failed")
        }
    }

    fun clickDownloadButton(driver: WebDriver) {
        driver.findElement(downloadButton).click()
    }

    fun clickPricingButton(driver: WebDriver) {
        driver.findElement(By.xpath("//a[text()='Pricing']")).click()
    }

    fun selectPricingOption(driver: WebDriver) {
        driver.findElement(By.xpath("//div[text()='For Individual Use']")).click()
    }
}