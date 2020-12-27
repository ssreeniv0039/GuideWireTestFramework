$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/ploicyChange.feature");
formatter.feature({
  "line": 1,
  "name": "PolicyChange in Homeowners Dwelling",
  "description": "",
  "id": "policychange-in-homeowners-dwelling",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify policy change Homeowners Dwelling Limit",
  "description": "",
  "id": "policychange-in-homeowners-dwelling;verify-policy-change-homeowners-dwelling-limit",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is alreadyon login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of logon page is Guidewire PolicyCenter",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is then directed to home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters the policy number in the search box",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is directed to the policy page and clicks on Coverages",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User verifies the homeowners dwelling limit against the expected result",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on summary and verifies the pending policy transcations",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on transaction number",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on the policy center contract coverages",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User validates the homeowners dwelling limit policy change against the expected results",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User LogOut from the Application",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User is directed to the Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User quits the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "policychange-in-homeowners-dwelling;verify-policy-change-homeowners-dwelling-limit;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 21,
      "id": "policychange-in-homeowners-dwelling;verify-policy-change-homeowners-dwelling-limit;;1"
    },
    {
      "cells": [
        "su",
        "gw"
      ],
      "line": 22,
      "id": "policychange-in-homeowners-dwelling;verify-policy-change-homeowners-dwelling-limit;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Verify policy change Homeowners Dwelling Limit",
  "description": "",
  "id": "policychange-in-homeowners-dwelling;verify-policy-change-homeowners-dwelling-limit;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is alreadyon login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of logon page is Guidewire PolicyCenter",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"su\" and \"gw\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is then directed to home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters the policy number in the search box",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is directed to the policy page and clicks on Coverages",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User verifies the homeowners dwelling limit against the expected result",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on summary and verifies the pending policy transcations",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on transaction number",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on the policy center contract coverages",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User validates the homeowners dwelling limit policy change against the expected results",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User LogOut from the Application",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User is directed to the Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User quits the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_is_alreadyon_login_page()"
});
formatter.result({
  "duration": 7136861200,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.title_of_logon_page_is_Guidewire_PolicyCenter()"
});
formatter.result({
  "duration": 32011000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "su",
      "offset": 13
    },
    {
      "val": "gw",
      "offset": 22
    }
  ],
  "location": "GWpolicyChangeStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 169318200,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_is_then_directed_to_home_page()"
});
formatter.result({
  "duration": 5383400,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_enters_the_policy_number_in_the_search_box()"
});
formatter.result({
  "duration": 2126199900,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_is_directed_to_the_policy_page_and_clicks_on_Coverages()"
});
formatter.result({
  "duration": 2060856700,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_verifies_the_homeowners_dwelling_limit_against_the_expected_result()"
});
formatter.result({
  "duration": 2296101700,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_clicks_on_summary_and_verifies_the_pending_policy_transcations()"
});
formatter.result({
  "duration": 2219574900,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_clicks_on_transaction_number()"
});
formatter.result({
  "duration": 2075096300,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_clicks_on_the_policy_center_contract_coverages()"
});
formatter.result({
  "duration": 1060309100,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_validates_the_homeowners_dwelling_limit_policy_change_against_the_expected_results()"
});
formatter.result({
  "duration": 637686000,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 9320815800,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_is_directed_to_the_Login_Page()"
});
formatter.result({
  "duration": 6071500,
  "status": "passed"
});
formatter.match({
  "location": "GWpolicyChangeStepDefinition.user_quits_the_browser()"
});
formatter.result({
  "duration": 725849500,
  "status": "passed"
});
});