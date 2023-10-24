class ResultPage {
    val downloadButton = By.xpath("//a[text()='Download']")
    val pageTitleText = "IntelliJ IDEA – the Leading Java and Kotlin IDE"

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