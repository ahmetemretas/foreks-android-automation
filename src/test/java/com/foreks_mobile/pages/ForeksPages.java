package com.foreks_mobile.pages;

import com.foreks_mobile.utulities.Driver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForeksPages extends BasePage{

    @AndroidFindBy (accessibility = "test-Username")
    public WebElement kapat1;
    public  WebElement kapat = Driver.getDriver().findElement(MobileBy.AccessibilityId("Kapat"));

    @AndroidFindBy (accessibility = "SAYFAM")
    public WebElement sayfam1;
    public  WebElement sayfam = Driver.getDriver().findElement(MobileBy.AccessibilityId("SAYFAM"));

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView")
    public WebElement varant1;
    public  WebElement varant = Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView"));

    @AndroidFindBy(accessibility = "Yükselenler / Düşenler")
    public WebElement yükselenlerDüşenler1;
    public  WebElement yükselenlerDüşenler = Driver.getDriver().findElement(MobileBy.AccessibilityId("Yükselenler / Düşenler"));

    @AndroidFindBy(accessibility = "YÜKSELENLER / DÜŞENLER")
    public WebElement YÜKSELENLERdüşenler1;
    public  WebElement YÜKSELENLERdüşenler = Driver.getDriver().findElement(MobileBy.AccessibilityId("YÜKSELENLER / DÜŞENLER"));

    @AndroidFindBy(xpath = "(//*[@class='android.widget.TextView'])[7]")
    public WebElement birinciSubTab1;
    public  WebElement birinciSubTab = Driver.getDriver().findElement(By.xpath("(//*[@class='android.widget.TextView'])[7]"));

    @AndroidFindBy(xpath = "(//*[@class='android.widget.TextView'])[8]")
    public WebElement ikinciSubTab1;
    public  WebElement ikinciSubTab = Driver.getDriver().findElement(By.xpath("(//*[@class='android.widget.TextView'])[8]"));

    @AndroidFindBy(xpath = "(//*[@class='android.widget.TextView'])[9]")
    public WebElement üçüncüSubTab1;
    public  WebElement üçüncüSubTab = Driver.getDriver().findElement(By.xpath("(//*[@class='android.widget.TextView'])[9]"));

    @AndroidFindBy(accessibility = "Yükselenler")
    public WebElement yükselenler1;
    public  WebElement yükselenler = Driver.getDriver().findElement(MobileBy.AccessibilityId("Yükselenler"));

    @AndroidFindBy(accessibility = "DÜŞENLER")
    public WebElement düşenler1;
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
            ilk1=ilk1.substring(1,ilk1.length()-1);
            ikinci2=ikinci2.substring(1,ikinci2.length()-1);
            ilk1=ilk1.replace(",","");
            ikinci2=ikinci2.replace(",","");
            ilk1=ilk1.replaceFirst("[.]","");
            ikinci2=ikinci2.replaceFirst("[.]","");
            if (Integer.parseInt(ilk1) >= Integer.parseInt(ikinci2)){
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
            ilk = Driver.getDriver().findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+i+"]"));
            ikinci = Driver.getDriver().findElement(By.xpath("(//*[@resource-id='foreks.android:id/rowWarrantSymbolList_textView_column3'])["+(i+1)+"]"));
            ilk1=ilk.getText();
            ikinci2=ikinci.getText();
            ilk1=ilk1.substring(1);
            ikinci2=ikinci2.substring(1);
            ilk1=ilk1.replace(",",".");
            ikinci2=ikinci2.replace(",",".");
            ilk1=ilk1.replaceFirst("[.]","");
            ikinci2=ikinci2.replaceFirst("[.]","");
            if (Integer.parseInt(ilk1) <= Integer.parseInt(ikinci2)){
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
