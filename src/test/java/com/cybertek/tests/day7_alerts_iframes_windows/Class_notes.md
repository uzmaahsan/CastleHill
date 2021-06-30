MAY 30th Sunday

Today's schedule:
- Review
- TestNG
- Dropdown
- Dropdown tasks
- Alerts
- Iframes
- Windows


----------------------------------------------------------------------------------------

- What is TestNG?
    - TestNG is a UNIT TESTING FRAMEWORK.
    - It has NOTHING to do with selenium.

- Is this tools created for testers?
    - No. It is for developers to create unit testing structure.

- Is TestNG the only unit testing framework?
    - No.
    - JUnit and NUnit.

- What is the most important thing we will be using from TestNG?
    - ANNOTATIONS

- What do annotations do?
    - The primary goal of annotation is to change the behavior of existing method.
    - If we apply a TestNG annotation to a simple java method, it will become TestNG property.
    - It means it will not be only Java method anymore.
    - It will be acting the way TestNG intends.

- Common annotations:
    - @Test
    - BeforeMethod, AfterMethod
    - BeforeClass, AfterClass
    - BeforeTest, AfterTest
    - BeforeSuite, AfterSuite

ex:
@Test
public void test1(){
sout("Test 1 is running.");
}

@Test:
- This will make the java method a TestNG test.
- Every test is independent from each other (by default).
- If one test fails, it will not effect the other tests (by default.)
- But we can create dependency in between tests. (using "dependency" keyword)

- What is the running order of TestNG tests?
    - By default tests will run in alphabetical order.
    - BUT, this is not a good practice to have.
    - We can prioritize tests orders using "priority" keyword.
    - The smaller the number, the earlier the test will run.


- @BeforeMethod, AfterMethod ANNOTATIONS:
    - What does it do?
    - These annotations will make the method run ONCE before (or after) each @TEST.

    - What is it used for?
    - Can be used for setup or teardown steps.



- @BeforeClass, AfterClass
    - What does it do?
    - Regardless of however many test we have, these will only run ONCE before(or after) everything in the class.

    - What is it used for?
    - Can be used for setup or teardown steps.

- Assertions:
    - What does assertions do?
    - Assertions verify expected and actual values.
    - It can be string, int, List<String> , List<WebElement>
    - Assertions will determine if a test PASSES OR FAILS.
    - This result(Pass or Fail) will be reflected in the test reports.

    - If an assertion fails, the rest of the lines after that assertion in the same test will NOT be executed.


- We have many assertions doing similar verifications.
    - assertTrue(boolean returning statement)
      --> this will accept a statement that is returning a boolean value
      --> this will expect a "true" to pass the test.
      --> so if the result of the statement is "false", this will fail the test.

      ex:
        - assertTrue(string1.equals(string2))


	- assertEquals(string1, string2)
		--> accepts two arguments and the arguments need to be same data type
		--> compares, and passes if the arguments are equal to each other.
		--> We can pass String vs String
		--> We can pass int vs int
		--> We can pass List vs List


--> TestNG Assertions accepts a 3rd STRING argument as a failure text.
- Whatever we pass into that 3rd argument will ONLY be printed in the console if our test is failing.
- This is not mandatory. But useful functionality just in case your assertion fails.

----------------------------------------------------------------------------------------

HOW TO HANDLE DROPDOWNS USING SELENIUM?


- How many types of dropdowns are there?
    - 2 types of dropdowns.


#1- HTML dropdowns(non-select):
	- If a dropdown is created not using <select> tag, we handle it just as any other web element.
	- Meaning, we locate, and we click. 

#2- Select dropdowns
	- Select dropdowns are created using <select> tag.

-How do we handle select dropdowns?
#1- We locate select dropdown using findElement method.
#2- We create object of Select class
#3- Pass the dropdown located inside of the Select constructor
#4- Then we can use the select object to reach special methods for the dropdown.

	ex: 

	- If I create web element in a different line:

		WebElement dropdown = driver.findElement(By.Locator);
		Select select = new Select(dropdown);


	- Select dropdown1 = new Select(driver.findElement(LOCATOR));


How do we select from a <select> dropdown?
- How many ways are there?
- There are 3 different ways to select from a dropdown:

	#1- By text of the option
		- This method accepts the text of the option we want to select.

		syntax: select.selectByVisibleText("the text of the option");

	#2- By index number of the option
		- We count index numbers and pass the index of the option
		- Indexes start from 0

		syntax: select.selectByIndex(1);


	#3- By value of the option
		- This method allows user to select an option by the value of the attribute "value"

			syntax: select.selectByValue("1");


--> How do we verify the currently selected option?
- .getFirstSelectedOption()
- This method will get the currently selected option.
- So this can be used for the default value as well.

	- Return type: WebElement
	- It will find and return the current option as a web element.


--> How to get all of the options from a dropdown?
- .getOptions()
- This method will return all of the options from the given dropdown.

	- What is the return type of this method?
	- List of WebElements.

------------------------------------------------------

Alerts:

	- There are 2 types of alerts.

	#1- HTML Alert:
		- We handle as a regular web element.
		- We locate, and click to close or accept.

	#2- JAVASCRIPT Alert
		- We need to use 'Alert' from Selenium library
		- 3 types of JS alerts.
			1- information 	: we can only accept
			2- confirmation : we can ACCEPT and DECLINE
			3- prompt 		: we can accept, decline and enter input

		Alert alert = driver.switchTo().alert();

		alert.accept();
		alert.dismiss();
		alert.sendKeys("type text here");



------------------------------------------------------

Iframe (Inline Frame):
- What is iframe?
- HTML inside of another HTML

	- If we do not specifically switch to inner iframe, selenium will not be able to find web elements from the inner frame.

	- We have 3 ways to switch.

	#1- index
	#2- locate as web element
	#3- id - name


	driver.switchTo().frame(index);
	driver.switchTo().frame(WebElement);
	driver.switchTo().frame("id-name value");

--> After we switch to inner frame, we need to switch back to outer frame to be able to continue actions in that frame.

	2 methods to move back from the inner frame:


	#1- driver.switchTo().parentFrame(); --> this will go to direct parent <iframe>
    #2- driver.switchTo().defaultContent(); --> this will go to default <html>

- These two methods will only make any difference if we have iframe within another iframe.
- Otherwise they both do the same thing.

    - iframe
        - iframe
          -iframe


------------------------------------------------------

WINDOWS:
- Selenium does not care about if it is a tab or a window
- Selenium will think & accept everything as a WINDOW
- Each window has unique window handle

	- We can get each window handle using : driver.getWindowHandle() method

	- driver.getWindowHandle() method:
		- will return the window handle of the currently open(focused window) 

		- Return type: String


- How to get all of the handles of currently opened windows?
    - driver.getWindowHandles() returns all of the currently opened window's handles

    - Return type: Set of String







































