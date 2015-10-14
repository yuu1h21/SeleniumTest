import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyXmlSerializer;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XmlSerializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String url = "http://www.aosabook.org/en/selenium.html";
		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		String source = driver.getPageSource();
		System.out.println(source);

		HtmlCleaner cleaner = new HtmlCleaner();
        CleanerProperties props = cleaner.getProperties();
		 // Cleanerの実行
        TagNode node = cleaner.clean(source);

        // XMLに変換してStringWriterに
        XmlSerializer serializer = new PrettyXmlSerializer( props );
        StringWriter writer = new StringWriter();
        try {
			serializer.writeXml(node, writer, "utf-8");
			System.out.println( writer.getBuffer() );
	        writer.close();
        } catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

        // コンソールに出力


		/*
		GoogleTestCase test = new GoogleTestCase();
		test.Initialize(url, driver);

		test.ScreenShot(driver);
		 */

	}



}
