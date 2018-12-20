/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.openqa.selenium.WebDriver
 *  org.openqa.selenium.WebDriver$Options
 *  org.openqa.selenium.WebDriver$Timeouts
 *  org.openqa.selenium.chrome.ChromeDriver
 *  org.openqa.selenium.chrome.ChromeOptions
 */
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BSeleniumScrapingService {
    private WebDriver a;

    public BSeleniumScrapingService() {
        try {
            String string = String.valueOf(GUI.z()) + "cd";
            if (string.contentEquals("nullcd")) {
                string = "drivers" + File.separator + "chromedriver";
            }
            if (aY.isWindows()) {
                string = String.valueOf(string) + ".exe";
            } else if (aY.isMac()) {
                string = String.valueOf(string) + "_m";
            } else if (aY.isUnix()) {
                string = String.valueOf(string) + "_l";
            }
            Object object = string;
            object = new File((String)object);
            object = object.getAbsolutePath();
            System.setProperty("webdriver.chrome.driver", (String)object);
            object = new ChromeOptions();
            String[] arrstring = new String[2];
            arrstring[0] = "--lang=en-us";
            string = "";
            if (aY.isWindows()) {
                string = String.valueOf(System.getenv("LOCALAPPDATA")) + "\\Google\\Chrome\\User Data";
            } else if (aY.isMac()) {
                string = "~/Library/Application Support/Google/Chrome";
            } else if (aY.isUnix()) {
                string = System.getenv("CHROME_USER_DATA_DIR");
            }
            arrstring[1] = "user-data-dir=" + string;
            object.addArguments(arrstring);
            this.a = new ChromeDriver((ChromeOptions)object);
            this.a.manage().timeouts().setScriptTimeout(60L, TimeUnit.SECONDS).pageLoadTimeout(60L, TimeUnit.SECONDS).implicitlyWait(40L, TimeUnit.SECONDS);
            return;
        }
        catch (Throwable throwable) {
            GUI.d("Please close all Google Chrome windows and restart IQUALIF\nPlease check if Google Chrome is installed or contact us for assistance\n\nVeuillez fermer toutes les fen\u00eatres de Google Chrome et red\u00e9marrer le logiciel IQUALIF\nVeuillez v\u00e9rifier si Google Chrome est install\u00e9 ou nous contacter pour une assistance", aM.G("dlg_start"));
            return;
        }
    }

    private String u(String string) {
        try {
            this.a.get(string);
            return this.a.getPageSource();
        }
        catch (Throwable throwable) {
            GUI.d("Please close all Google Chrome windows and restart IQUALIF\nPlease check if Google Chrome is installed or contact us for assistance\n\nVeuillez fermer toutes les fen\u00eatres de Google Chrome et red\u00e9marrer le logiciel IQUALIF\nVeuillez v\u00e9rifier si Google Chrome est install\u00e9 ou nous contacter pour une assistance", aM.G("dlg_start"));
            return "";
        }
    }

    public void finalize() {
        if (this.a != null) {
            this.a.quit();
        }
    }

    public static void main(String[] object) {
        object = new BSeleniumScrapingService();
        try {
            BSeleniumScrapingService.super.u("https://www.google.fr");
            Thread.sleep(5000L);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

