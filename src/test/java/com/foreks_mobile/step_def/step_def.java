package com.foreks_mobile.step_def;

import com.foreks_mobile.pages.ForeksPages;
import com.foreks_mobile.utulities.BrowserUtils;
import com.foreks_mobile.utulities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class step_def {


    ForeksPages foreksPages = new ForeksPages();

    @Given("Kullanıcı mobil uygulamaya verilen aygıtla giriş yapar")
    public void kullanıcı_mobil_uygulamaya_verilen_aygıtla_giriş_yapar() {

        foreksPages.kapat1.click();

    }
    @Given("Kullanıcı varant tabine yönlendirilir")
    public void kullanıcı_varant_tabine_yönlendirilir() {

        foreksPages.varant1.click();
        BrowserUtils.waitFor(2);
        foreksPages.navigateBack();

    }
    @Given("Kullanıcı yükselenler-düşenler tabine yönlendirilir")
    public void kullanıcı_yükselenler_düşenler_tabine_yönlendirilir() {

        foreksPages.yükselenlerDüşenler1.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(foreksPages.YÜKSELENLERdüşenler1.isDisplayed());

    }
    @Given("Kullanıcı yükselenler tabinde olduğunu ve subtableri kontrol eder")
    public void kullanıcı_yükselenler_tabinde_olduğunu_ve_subtableri_kontrol_eder() {

        Assert.assertTrue(foreksPages.yükselenler1.isSelected());
        Assert.assertEquals(ConfigurationReader.get("birinciSubTab"),foreksPages.birinciSubTab1.getText());
        Assert.assertEquals(ConfigurationReader.get("ikinciSubTab"),foreksPages.ikinciSubTab1.getText());
        Assert.assertEquals(ConfigurationReader.get("üçüncüSubTab"),foreksPages.üçüncüSubTab1.getText());

    }
    @Given("Kullanıcı fark subtabinin altındaki değerlerin alçalarak devam ettiğini kontrol eder")
    public void kullanıcı_fark_subtabinin_altındaki_değerlerin_alçalarak_devam_ettiğini_kontrol_eder() {
        foreksPages.farklarArtan();
    }
    @When("Kullanıcı düşenler tabine yönlendirilir")
    public void kullanıcı_düşenler_tabine_yönlendirilir() {
        foreksPages.düşenler1.click();
    }
    @When("Kullanıcı düşenler tabinde olduğunu ve subtableri kontrol eder")
    public void kullanıcı_düşenler_tabinde_olduğunu_ve_subtableri_kontrol_eder() {
        Assert.assertTrue(foreksPages.düşenler1.isSelected());
        Assert.assertEquals(ConfigurationReader.get("birinciSubTab"),foreksPages.birinciSubTab1.getText());
        Assert.assertEquals(ConfigurationReader.get("ikinciSubTab"),foreksPages.ikinciSubTab1.getText());
        Assert.assertEquals(ConfigurationReader.get("üçüncüSubTab"),foreksPages.üçüncüSubTab1.getText());
    }
    @When("Kullanıcı fark subtabinin altındaki değerlerin artarak devam ettiğini kontrol eder")
    public void kullanıcı_fark_subtabinin_altındaki_değerlerin_artarak_devam_ettiğini_kontrol_eder() {
        foreksPages.farklarAzalan();
    }


}
