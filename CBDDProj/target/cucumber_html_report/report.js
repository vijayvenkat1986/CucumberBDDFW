$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("softwaretester.feature");
formatter.feature({
  "line": 1,
  "name": "Life of a software tester and his boss",
  "description": "",
  "id": "life-of-a-software-tester-and-his-boss",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "I am a good software tester and my boss loves me",
  "description": "",
  "id": "life-of-a-software-tester-and-his-boss;i-am-a-good-software-tester-and-my-boss-loves-me",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Vijay"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a \"good\" software tester",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to work",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I \"involve\" with it",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "My boss \"loves\" me",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "good",
      "offset": 8
    }
  ],
  "location": "SoftwareTester.i_am_a_good_software_tester(String)"
});
formatter.result({
  "duration": 115994300,
  "status": "passed"
});
formatter.match({
  "location": "SoftwareTester.i_go_to_work()"
});
formatter.result({
  "duration": 45900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "involve",
      "offset": 3
    }
  ],
  "location": "SoftwareTester.i_involve_with_it(String)"
});
formatter.result({
  "duration": 134300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loves",
      "offset": 9
    }
  ],
  "location": "SoftwareTester.my_boss_loves_me(String)"
});
formatter.result({
  "duration": 90400,
  "status": "passed"
});
});