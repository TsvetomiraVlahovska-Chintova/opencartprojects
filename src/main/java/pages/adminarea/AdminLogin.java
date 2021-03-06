package pages.adminarea;

import org.openqa.selenium.By;
import utils.Browser;

public class AdminLogin {
    /**
     * Invoking this method will navigate you to the admin area of the project
     */
    public static void navigate() {
        Browser.driver.get("https://shop.pragmatic.bg/admin/index.php?route=common/login");
    }

    /**
     * This method logs you into the admin area with the
     * provided credentials as parameters
     *
     * @param username the username you would like to login with
     * @param password the password you would like to login with
     */
    public static void login(String username, String password) {
        Browser.driver.findElement(By.id("input-username")).sendKeys(username);
        Browser.driver.findElement(By.id("input-password")).sendKeys(password);
        Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
    }

}
