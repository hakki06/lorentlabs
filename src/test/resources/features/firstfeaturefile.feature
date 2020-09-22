@lorent
Feature: Lorentlabs search
  Background:  Kullanici lorentlabsda gider
    Given kullanici lorentlabsda gider

 # @vpn
 # Scenario: kullanici lorentlabs vpn arar
    #And kullanici vpn arar
    #Then kullanici vpn oldugunu dogrular

# @iphone
  #Scenario: kullanici lorentlabs iphone arar
   # And kullanici iphone arar
  #And kullanici aranani listeler
    #Then kullanici iphone oldugunu dogrular

 # @inceleme
  #Scenario: kullanici lorentlabs inceleme katogorisine gider
    #And kullanici inceleme katogorisini listeler
    #Then kullanici kaç adet doldugunu yazdırır

    @inceletummenu
    Scenario: kullanıcı incele menusune gider
      And kullanici incele tum menuyu tiklar
      And kullanici incele icerigini yukler
      Then kullanici incele sayfa basliklarini excele yazdirir

      @haberlertummenu
      Scenario: kullanici haberler menusune gider
        And kullanici haberler menusunu tiklar
        And kullanici tüm menuyu yukler
        Then kullanıcı haberler basliklarini excele yazdırır

        @karsilastirtummenu
        Scenario: kullanici karsilastir menusune gider
          And kullanici karsilastir menusunu tiklar
          And kullanici tüm karsilastir menusunu yukler
          Then kullanıcı karsilastir basliklarini excele yazdırır

  @kriptoparatummenu
  Scenario: kullanici kriptopara menusune gider
    And kullanici kriptopara menusunu tiklar
    And kullanici tüm kriptopara menusunu yukler
    Then kullanıcı kriptopara basliklarini excele yazdırır

  @siberGuvenliktummenu
  Scenario: kullanici siberGuvenlik menusune gider
    And kullanici siberGuvenlik menusunu tiklar
    And kullanici tüm siberGuvenlik menusunu yukler
    Then kullanıcı siberGuvenlik basliklarini excele yazdırır









