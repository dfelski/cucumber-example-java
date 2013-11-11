Feature: ninja attack on a pirate ship

Scenario: 20 ninjas attack a ship full of pirates
Given a ship with 100 pirates
When 20 ninjas attacks
Then 80 pirates should left

Scenario: 40 ninjas attack a ship full of pirates
Given a ship with 80 pirates
When 40 ninjas attacks
Then 40 pirates should left

Scenario Outline: some ninjas attack a ship full of pirates
Given a ship with <numberOfPirates> pirates
When <numberOfNinjas> ninjas attacks
Then <numberOfSurviers> pirates should left

Examples:
|numberOfPirates|numberOfNinjas|numberOfSurviers|
|40             |10            |30              |
|30             |10            |20              |
|25             |2             |23              |