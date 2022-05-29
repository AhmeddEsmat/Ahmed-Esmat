    import org.junit.Test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\esmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        WebElement firstNameInput = driver.findElement(By.id("first-name"));

        WebElement lastNameInput = driver.findElement(By.id("last-name"));

        WebElement jobTitleInput = driver.findElement(By.id("job-title"));

        firstNameInput.sendKeys("Ahmed");
        lastNameInput.sendKeys("Esmat");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\esmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        WebElement lastNameInput = driver.findElement(By.id("last-name"));

                WebElement jobTitleInput = driver.findElement(By.id("job-title"));

                        lastNameInput.sendKeys("Esmat");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

    }
    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\esmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        WebElement firstNameInput = driver.findElement(By.id("first-name"));

                WebElement jobTitleInput = driver.findElement(By.id("job-title"));

                        firstNameInput.sendKeys("Ahmed");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void test4() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\esmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        WebElement firstNameInput = driver.findElement(By.id("first-name"));

                WebElement jobTitleInput = driver.findElement(By.id("job-title"));

                        firstNameInput.sendKeys("Ahmed");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
    }
    @Test
    public void test5() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\esmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");

        WebElement firstNameInput = driver.findElement(By.id("first-name"));

                WebElement jobTitleInput = driver.findElement(By.id("job-title"));

                        firstNameInput.sendKeys("Ahmed");
        jobTitleInput.sendKeys("Computer Engineering Student");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();
    }
}