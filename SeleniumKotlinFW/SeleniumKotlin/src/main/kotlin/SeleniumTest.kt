import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit
import org.junit.Assert.assertEquals

fun main() {
    // Set the path to the ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe")

    // Initialize the WebDriver (in this case, using Chrome)
    val driver: WebDriver = ChromeDriver()

    // Navigate to a web page
    driver.get("https://www.jetbrains.com/")
    driver.manage().window().maximize()
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)

    // Find an element by its ID and interact with it
    val searchIcon = driver.findElement(By.cssSelector("[data-test=\"site-header-search-action\"]"))
    searchIcon.click()

    val searchBox = driver.findElement(By.cssSelector("[data-test=\"search-input\"]"))
    searchBox.sendKeys("Kotlin")

    val searchResult = driver.findElement(By.cssSelector("[data-test=\"result-title\"]:nth-child(1)"))
    searchResult.click()

    val downloadButtonPresent = if(driver.findElement(By.xpath("//a[text()='Download']")) != null) "True" else "False"
    assertEquals(downloadButtonPresent, "True")

    val pageTitle = driver.title
    if (pageTitle == "IntelliJ IDEA – the Leading Java and Kotlin IDE") {
        println("Test Passed")
    } else {
        println("Test Failed")
    }


    driver.quit()
}
