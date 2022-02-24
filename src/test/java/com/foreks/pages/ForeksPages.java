package com.foreks.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class ForeksPages extends BasePage {

    public static AppiumDriver<MobileElement> driver;

    public static WebElement kapat = driver.findElement(MobileBy.AccessibilityId("Kapat"));
    public static WebElement sayfam = driver.findElement(MobileBy.AccessibilityId("SAYFAM"));
    public static WebElement varant = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView"));
    public static WebElement yükselenlerDüşenler = driver.findElement(MobileBy.AccessibilityId("Yükselenler / Düşenler"));
    public static WebElement YÜKSELENLERdüşenler = driver.findElement(MobileBy.AccessibilityId("YÜKSELENLER / DÜŞENLER"));
    public static WebElement birinciSubTab = driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[7]"));
    public static WebElement ikinciSubTab = driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[8]"));
    public static WebElement üçüncüSubTab = driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[9]"));
    public static WebElement yükselenler = driver.findElement(MobileBy.AccessibilityId("Yükselenler"));
    public static WebElement düşenler = driver.findElement(MobileBy.AccessibilityId("DÜŞENLER"));

    public void farklarArtan(){
        boolean flag = true;
        WebElement ilk, ikinci ;
        String ilk1,ikinci2;
        for (int i = 1; i < 10; i++) {
            ilk = driver.findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+i+"]"));
            ikinci = driver.findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+(i+1)+"]"));
            ilk1=ilk.getText();
            ikinci2=ikinci.getText();
            ilk1=ilk1.substring(1);
            ikinci2=ikinci2.substring(1);
            ilk1=ilk1.replace(",",".");
            ikinci2=ikinci2.replace(",",".");
            if (Double.parseDouble(ilk1) >= Double.parseDouble(ikinci2)){
                flag = true;
            }else {
                flag=false;
            }
            Assert.assertTrue("Farklar sıralı değil",flag);
        }
        return;
    }

    public void farklarAzalan(){
        boolean flag = true;
        WebElement ilk, ikinci ;
        String ilk1,ikinci2;
        for (int i = 1; i < 10; i++) {
            ilk =driver.findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+i+"]"));
            ikinci = driver.findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+(i+1)+"]"));
            ilk1=ilk.getText();
            ikinci2=ikinci.getText();
            ilk1=ilk1.substring(1);
            ikinci2=ikinci2.substring(1);
            ilk1=ilk1.replace(",",".");
            ikinci2=ikinci2.replace(",",".");
            if (Double.parseDouble(ilk1) <= Double.parseDouble(ikinci2)){
                flag = true;
            }else {
                flag=false;
            }
            Assert.assertTrue("Farklar sıralı değil",flag);
        }
        return;
    }

    public void navigateBack(){
        driver.navigate().back();
        return;
    }

    public void closeApp(){
        driver.closeApp();
        return;
    }



}
