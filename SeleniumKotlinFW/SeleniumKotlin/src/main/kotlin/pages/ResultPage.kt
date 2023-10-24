package pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.junit.Assert.assertEquals

class ResultPage {
    private val downloadButton: By = By.xpath("//a[text()='Download']")
    private val pageTitleText = "IntelliJ IDEA – the Leading Java and Kotlin IDE"

    fun verifyDownloadButtonPresent(driver: WebDriver) {
        val downloadButtonPresent = if(driver.findElement(downloadButton) != null) "True" else "False"
        assertEquals(downloadButtonPresent, "True")
    }

    fun verifyPageTitle(driver: WebDriver) {
        val pageTitle = driver.title
        if (pageTitle == pageTitleText) {
            println("Test Passed")
        } else {
            println("Test Failed")
        }
    }
}