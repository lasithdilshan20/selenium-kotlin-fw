package pages

import data.TestData
import org.openqa.selenium.*
import org.openqa.selenium.WebDriver
import java.util.concurrent.TimeUnit

class HomePage {
    val searchIcon = "[data-test=\"site-header-search-action\"]"
    val searchBox = "[data-test=\"search-input\"]"
    val searchResult = "[data-test=\"result-title\"]:nth-child(1)"

    fun openPage(driver: WebDriver) {
        driver.get(TestData.baseUrl)
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    }

    fun search(driver: WebDriver) {
        val searchIcon = driver.findElement(By.cssSelector(searchIcon))
        searchIcon.click()

        val searchBox = driver.findElement(By.cssSelector(searchBox))
        searchBox.sendKeys(TestData.searchKeyword)

        val searchResult = driver.findElement(By.cssSelector(searchResult))
        searchResult.click()
    }
}