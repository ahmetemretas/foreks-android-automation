package com.foreks.step_definitions;

import com.foreks.pages.ForeksPages;
import com.foreks.utulities.BrowserUtils;
import com.foreks.utulities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForeksStepDef {

    ForeksPages foreksPages = new ForeksPages();

    @Given("Kullanıcı mobil uygulamaya verilen aygıtla giriş yapar")
    public void kullanıcı_mobil_uygulamaya_verilen_aygıtla_giriş_yapar() {

        foreksPages.kapat.click();

    }
    @Given("Kullanıcı varant tabine yönlendirilir")
    public void kullanıcı_varant_tabine_yönlendirilir() {

        foreksPages.varant.click();
        BrowserUtils.waitFor(2);
        foreksPages.navigateBack();

    }
    @Given("Kullanıcı yükselenler-düşenler tabine yönlendirilir")
    public void kullanıcı_yükselenler_düşenler_tabine_yönlendirilir() {

        foreksPages.yükselenlerDüşenler.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(foreksPages.YÜKSELENLERdüşenler.isDisplayed());

    }
    @Given("Kullanıcı yükselenler tabinde olduğunu ve subtableri kontrol eder")
    public void kullanıcı_yükselenler_tabinde_olduğunu_ve_subtableri_kontrol_eder() {

        Assert.assertTrue(foreksPages.yükselenler.isSelected());
        Assert.assertEquals(ConfigurationReader.get("birinciSubTab"),foreksPages.birinciSubTab.getText());
        Assert.assertEquals(ConfigurationReader.get("ikinciSubTab"),foreksPages.ikinciSubTab.getText());
        Assert.assertEquals(ConfigurationReader.get("üçüncüSubTab"),foreksPages.üçüncüSubTab.getText());

    }
    @Given("Kullanıcı fark subtabinin altındaki değerlerin alçalarak devam ettiğini kontrol eder")
    public void kullanıcı_fark_subtabinin_altındaki_değerlerin_alçalarak_devam_ettiğini_kontrol_eder() {
        foreksPages.farklarArtan();
    }
    @When("Kullanıcı düşenler tabine yönlendirilir")
    public void kullanıcı_düşenler_tabine_yönlendirilir() {
        foreksPages.düşenler.click();
    }
    @When("Kullanıcı düşenler tabinde olduğunu ve subtableri kontrol eder")
    public void kullanıcı_düşenler_tabinde_olduğunu_ve_subtableri_kontrol_eder() {
        Assert.assertTrue(foreksPages.düşenler.isSelected());
        Assert.assertEquals(ConfigurationReader.get("birinciSubTab"),foreksPages.birinciSubTab.getText());
        Assert.assertEquals(ConfigurationReader.get("ikinciSubTab"),foreksPages.ikinciSubTab.getText());
        Assert.assertEquals(ConfigurationReader.get("üçüncüSubTab"),foreksPages.üçüncüSubTab.getText());
    }
    @When("Kullanıcı fark subtabinin altındaki değerlerin artarak devam ettiğini kontrol eder")
    public void kullanıcı_fark_subtabinin_altındaki_değerlerin_artarak_devam_ettiğini_kontrol_eder() {
        foreksPages.farklarAzalan();
    }


}
