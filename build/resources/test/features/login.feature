#Author: XuasyMeneses

@login
Feature: Login operations

  @userBlocked @regression
  Scenario Outline: try to log in with blocked user
    Given launch the saucedemo page
    When enter blocked user credentials <username> <password>
    Then check alert message <message>

    Examples:
      |username|password|message|
      |"locked_out_user"|"secret_sauce"|"Epic sadface: Sorry, this user has been locked out."|