package com.foreks.pages;

import com.foreks.utulities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class ForeksPages {





    public  WebElement kapat = Driver.getDriver().findElement(MobileBy.AccessibilityId("Kapat"));
    public  WebElement sayfam = Driver.getDriver().findElement(MobileBy.AccessibilityId("SAYFAM"));
    public  WebElement varant = Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView"));
    public  WebElement yükselenlerDüşenler = Driver.getDriver().findElement(MobileBy.AccessibilityId("Yükselenler / Düşenler"));
    public  WebElement YÜKSELENLERdüşenler = Driver.getDriver().findElement(MobileBy.AccessibilityId("YÜKSELENLER / DÜŞENLER"));
    public  WebElement birinciSubTab = Driver.getDriver().findElement(By.xpath("(//*[@class='android.widget.TextView'])[7]"));
    public  WebElement ikinciSubTab = Driver.getDriver().findElement(By.xpath("(//*[@class='android.widget.TextView'])[8]"));
    public  WebElement üçüncüSubTab = Driver.getDriver().findElement(By.xpath("(//*[@class='android.widget.TextView'])[9]"));
    public  WebElement yükselenler = Driver.getDriver().findElement(MobileBy.AccessibilityId("Yükselenler"));
    public  WebElement düşenler = Driver.getDriver().findElement(MobileBy.AccessibilityId("DÜŞENLER"));

    public void farklarArtan(){
        boolean flag = true;
        WebElement ilk, ikinci ;
        String ilk1,ikinci2;
        for (int i = 1; i < 10; i++) {
            ilk = Driver.getDriver().findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+i+"]"));
            ikinci = Driver.getDriver().findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+(i+1)+"]"));
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
            ilk =Driver.getDriver().findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+i+"]"));
            ikinci = Driver.getDriver().findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+(i+1)+"]"));
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
        Driver.getDriver().navigate().back();
        return;
    }

    //public void closeApp(){
      //  Driver.getDriver().closeApp();
        //return;
    //}



}
