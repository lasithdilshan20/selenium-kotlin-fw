package based

import config.ConfigDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

val driver: WebDriver = ConfigDriver.initializeChromeDriver()

class CommandBased {
    fun Click(element: String){
        when (element){
            element.startsWith("/").toString() -> driver.findElement(By.xpath(element)).click()
            element.startsWith(".").toString() -> driver.findElement(By.className(element)).click()
            element.startsWith("#").toString() -> driver.findElement(By.id(element)).click()
            else -> driver.findElement(By.cssSelector(element)).click()
        }
    }

    fun Type(element: String, text: String){
        when (element){
            element.startsWith("/").toString() -> driver.findElement(By.xpath(element)).sendKeys(text)
            element.startsWith(".").toString() -> driver.findElement(By.className(element)).sendKeys(text)
            element.startsWith("#").toString() -> driver.findElement(By.id(element)).sendKeys(text)
            else -> driver.findElement(By.cssSelector(element)).sendKeys()
        }
    }
}