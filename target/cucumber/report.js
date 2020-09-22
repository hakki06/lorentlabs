$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/firstfeaturefile.feature");
formatter.feature({
  "name": "Lorentlabs search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@lorent"
    }
  ]
});
formatter.background({
  "name": "Kullanici lorentlabsda gider",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "kullanici lorentlabsda gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.LorentlabsSearchStepdefinitions.kullanici_lorentlabsda_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "kullanici lorentlabs vpn arar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@lorent"
    },
    {
      "name": "@vpn"
    }
  ]
});
formatter.step({
  "name": "kullanici vpn arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LorentlabsSearchStepdefinitions.kullanici_vpn_arar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici vpn oldugunu dogrular",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.LorentlabsSearchStepdefinitions.kullanici_vpn_oldugunu_dogrular()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Kullanici lorentlabsda gider",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "kullanici lorentlabsda gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.LorentlabsSearchStepdefinitions.kullanici_lorentlabsda_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "kullanici lorentlabs iphone arar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@lorent"
    },
    {
      "name": "@iphone"
    }
  ]
});
formatter.step({
  "name": "kullanici iphone arar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LorentlabsSearchStepdefinitions.kullanici_iphone_arar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici aranani listeler",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LorentlabsSearchStepdefinitions.kullanici_aranani_listeler()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici iphone oldugunu dogrular",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.LorentlabsSearchStepdefinitions.kullanici_iphone_oldugunu_dogrular()"
});
formatter.result({
  "status": "passed"
});
});