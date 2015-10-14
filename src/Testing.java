
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class Testing {
    FirefoxDriver wd;


    public static void Main(String[] args) throws Exception{
    	Testing test = new Testing();

    	test.setUp();
    	test.Test();
    	test.tearDown();

    }

    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void Test() {
        wd.get("http://www.kyoto-u.ac.jp/ja/faculties-and-graduate/");
        wd.findElement(By.linkText("学部入試")).click();
        wd.findElement(By.cssSelector("div.navbar-inner.w_inner > #portal-languageselector > ul > li > a.alpha7")).click();
        wd.findElement(By.linkText("研究成果")).click();
        wd.findElement(By.xpath("//ul[@class='achievement-list']/li[3]/a/div[2]")).click();
        wd.findElement(By.xpath("//div[@class='menu_mega']//li[.='大学院入試']")).click();
        wd.findElement(By.cssSelector("#searchGadget")).click();
        wd.findElement(By.cssSelector("#searchGadget")).clear();
        wd.findElement(By.cssSelector("#searchGadget")).sendKeys();
        wd.findElement(By.cssSelector("#searchGadget")).click();
        wd.findElement(By.cssSelector("#searchGadget")).clear();
        wd.findElement(By.cssSelector("#searchGadget")).sendKeys("石井");
        wd.findElement(By.cssSelector("div.navbar-inner.w_inner > div.search_wrap > #livesearch0 > div.LSBox > button.btn_search")).click();
        wd.findElement(By.cssSelector("form.gsc-search-box")).click();
        wd.findElement(By.id("gsc-i-id1")).click();
        wd.findElement(By.id("gsc-i-id1")).clear();
        wd.findElement(By.id("gsc-i-id1")).sendKeys();
        wd.findElement(By.id("gsc-i-id1")).click();
        wd.findElement(By.id("gsc-i-id1")).sendKeys("\n");
        wd.findElement(By.id("gsc-i-id1")).click();
        wd.findElement(By.id("gsc-i-id1")).sendKeys("\n");
        wd.findElement(By.id("gsc-i-id1")).click();
        wd.findElement(By.id("gsc-i-id1")).sendKeys("\n");
        wd.findElement(By.id("gsc-i-id1")).click();
        wd.findElement(By.id("gsc-i-id1")).clear();
        wd.findElement(By.id("gsc-i-id1")).sendKeys("林優一郎");
    }


    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
