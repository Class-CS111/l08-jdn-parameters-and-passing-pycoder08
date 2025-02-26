[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18408805)
 

# Lab 08 - JDN - Parameters + Passing

_Learning Objectives: demonstrate an understanding of how to design flexible, maintainable, reusable static methods. Demonstrate effective industry-standard code documentation._

_**Lab TODO: Perform Julian Day calculations within a static method**_

Take a moment to think about the method you are designing, without clear and concise documentation, we have only the java code itself. Unless you wrote the code yourself, it would be hard for another programmer to use in collaboration. When filling in the documentation, carefully document the description, preconditions, and postconditions. 

Take the prototype you built from _Lab 03: DACA + DATA MANIPULATION_ and develop it into a fully modular program by separating out the code into a static method with parameters for `monthToday`, `dayToday`, and `yearToday`, name the method `calcJulianDate`.

The lab contains a test for your method, passing in Katherine Johnson's birthday and comparing your methods return to the expected return value. Refer to the definitions section below to check your work. 

Katherine Johnson's birthday: 8/26/1918.

Instructions: 

**_When you're ready uncomment the code for the output section and the method header for calcJulianDate() in the lab to begin._**

 **Definitions:**

- Julian Day Number: http://www.cs.utsa.edu/~cs1063/projects/Spring2011/Project1/jdn-explanation.html
- Check your work with, http://numerical.recipes/julian.html (make sure to select "Auto (Julian/Gregorian)" calendar option).

**Run the tests.**

When you are finished, **add more method calls in main, to calculate two more Julian dates of your choosing.** (Do your birthday or the day we landed on the moon, etc, whatever you would like) 

Once you've done that submit your code. Don't worry about the hacker challenge for now. feel free to tackle it on your own whenever you like. 

# **!!!HACKER CHALLENGE!!!**

# **Create a printCentered method!**

Create a static method that takes in two parameters: width and a string containing text to be printed in the center of the console. In the format specifier slides _(Lab 05 DACA + DATA, the topic 1.6 slides)_, you were exposed to a String method called String.format(). In Order to complete this hacker challenge, you will need to make use of a special method called Stringdata.length(), _this is your hint on how to center your text regardless of what strings you pass in as a parameter._ 

**Note about `String.length()`: in order to use this method, you must call it on a string variable(data). This is a different way to call a method than we are used to. Don't worry about the details for now, as we will get into them later. If you have questions please post them on Discord.**

```
String greeting = "Hello";
int size = greeting.length(); //for this example, size would store 5
```

Use what you have learned about parameters and passing, along with format specifiers to build a method to center your text _auto-magically_! (from now on, whenever you need formatted text, you now know how to create a method that does it for you, convenient!)

Here is the documentation of `String.length()` you can use to aid you in building your method: 

```
/**
* Returns the length of a string.
*
* @param: none
* @return an integer, the length of the string in Unicode characters.
**/
```