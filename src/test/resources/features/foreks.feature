@foreks
Feature: Yükselen ve azalan varyantlar

  Background: Mobil uygulamaya giriş
    Given Kullanıcı mobil uygulamaya verilen aygıtla giriş yapar

  Scenario: Kullanıcı varant tabini test eder
    Given Kullanıcı varant tabine yönlendirilir
    And Kullanıcı yükselenler-düşenler tabine yönlendirilir
    And Kullanıcı yükselenler tabinde olduğunu ve subtableri kontrol eder
    And Kullanıcı fark subtabinin altındaki değerlerin alçalarak devam ettiğini kontrol eder
    When Kullanıcı düşenler tabine yönlendirilir
    And Kullanıcı düşenler tabinde olduğunu ve subtableri kontrol eder
    And Kullanıcı fark subtabinin altındaki değerlerin artarak devam ettiğini kontrol eder