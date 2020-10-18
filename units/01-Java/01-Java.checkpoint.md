# Java Skills Assessment

## Introduction to Java

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: e85a695b-f543-42e4-b24b-7de85410c7ce
* title: Location of the project
##### !question
When creating a new project in IntelliJ, the location where the project will be saved will be:
##### !end-question
##### !options
* something you have to specify (default is blank)
* described in the details section of the wizard
* automatically a folder named the same as the project name
##### !end-options
##### !answer
automatically a folder named the same as the project name
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: fe037ef6-536c-4e33-937a-9c0ec418390c
* title: Where does your code go?
##### !question
The java code of your application should go under the _____ folder.
##### !end-question
##### !answer
src
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 3fc55d64-5eb9-4418-a29a-861fe11c64a2
* title: Package names
##### !question
Package names should be named:
##### !end-question
##### !options
* the same as the computers they will be installed on
* a randomized set of characters like a GUID
* like domain names but in reverse order
##### !end-options
##### !answer
like domain names but in reverse order
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 44c799d7-8d0a-4549-ba2c-84bf37093aa8
* title: Checking Gradle version
##### !question
What is the command for checking the current version of Gradle installed?
##### !end-question
##### !answer
/(gradle.*-v)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 02fdb8ef-dee2-4587-a285-b593ff6fcd7a
* title: Creating a Java application with Gradle
##### !question
To create a new java application using Gradle use the following command (what goes in the blank):

`gradle init --type _________`
##### !end-question
##### !answer
/(java-application)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 7583b560-0bbe-4a40-8738-e8fce0dd6da3
* title: Compilation Question 1
##### !question
Which command would you use to **compile** your code?
##### !end-question
##### !options
* `java`
* `javac`
* `build-java`
##### !end-options
##### !answer
`javac`
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 856a9194-63b8-4239-baec-7d67e16b02a1
* title: Compilation Question 2
##### !question
Which command would you use to **run** your code?
##### !end-question
##### !options
* `java`
* `javac`
* `run-java`
##### !end-options
##### !answer
`java`
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: c46940cf-eed7-434f-8714-a13c331e7393
* title: What is the class-path?
##### !question
Which of these describes the purpose of the class-path?
##### !end-question
##### !options
* It describes the directory where projects are built to
* It describes the directory where artifacts for deployment go
* It tells the Java command where to find all the classes
##### !end-options
##### !answer
It tells the Java command where to find all the classes
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 3a9d0cd9-96bf-4bcc-afd8-c1862b866a5a
* title: Gradle build file
##### !question
The name of the file Gradle uses to store build information is: 
##### !end-question
##### !answer
/(build.gradle)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: code-snippet
* language: java
* id: fb8de343-fb1f-4fa1-af70-727e8d201eca
* title: Variables
### !question
Define a variable of type `String` named `helloWorld` with initial value of "Hello World".
### !end-question
### !setup
```java
import java.io.IOException;

class VariableChallenge {

    public static String run() {
        // Start Student Code
```

### !end-setup
### !placeholder

// Create variable helloWorld & assign value of "Hello World"

### !end-placeholder
### !tests
```java
        // End Student Code
        return helloWorld;
    }
}

public class SnippetTest {

    @Test
    public void fooIsBar() {
        assertEquals("Hello World", VariableChallenge.run(), "Value of variable 'helloWorld'");
    }

}
```
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: f09c5114-2d82-4812-9063-667617cb90d2
* title: Primitive types
##### !question
### Question
Which of the following is __not__ a valid Java primitive type?
##### !end-question
##### !options
* `char`
* `boolean`
* `string`
* `int`
##### !end-options
##### !answer
`string`
##### !end-answer
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 7f70f5d2-922c-4f7a-99c7-5ec62981950d
* title: Multiple comparisons
### !question
In the space given below, declare and define the method `grade`. This method takes as input a student score and returns a letter grade based on that score. The grade boundaries (inclusive) are as follows:

| Lower Bound | Upper Bound | Grade |
|-------------|-------------|-------|
|     90      |     100+    |   A   |
|     80      |      89     |   B   |
|     70      |      79     |   C   |
|     60      |      69     |   D   |
|      0      |      59     |   F   |

_Note_: remember to attempt this challenge in your Java playground first and then paste your answer below. Do not write it directly in the editor.
### !end-question
### !setup
class VariableChallenge {
### !end-setup
### !placeholder
String grade(int input) {
  // Implement your solution
}
### !end-placeholder
### !tests
}

// public test class name **must** be `SnippetTest` to match the generated file name
public class SnippetTest {

    VariableChallenge solution = new VariableChallenge();

    @Test
    public void zeroReturnsF() {
        int score = 0;
        assertEquals("F", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void fiftyNineReturnsF() {
        int score = 59;
        assertEquals("F", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void sixtyReturnsD() {
        int score = 60;
        assertEquals("D", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void sixtyNineReturnsD() {
        int score = 69;
        assertEquals("D", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void seventyReturnsC() {
        int score = 70;
        assertEquals("C", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void seventyNineReturnsC() {
        int score = 79;
        assertEquals("C", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void eightyReturnsB() {
        int score = 80;
        assertEquals("B", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void eightyNineReturnsB() {
        int score = 89;
        assertEquals("B", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void ninetyReturnsA() {
        int score = 90;
        assertEquals("A", solution.grade(score), "Grade for " + score);
    }

    @Test
    public void hundredReturnsA() {
        int score = 100;
        assertEquals("A", solution.grade(score), "Grade for " + score);
    }
}
### !end-tests
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 73a825b4-eae6-4f42-a479-783e7d2f50a0
* title: Using a for loop
### !question
Using a `for` loop, print the _even_ integers from 2 through 6 to the console.

_Note:_ remember to attempt this challenge in your Java playground first
and then paste your answer below. Do not write it directly in the editor.
### !end-question
### !setup
```java
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

// [to allow student to submit simple statements, wrap the submission
//  using the !setup and !tests sections; example below]
class ChallengeSolution {

    public static String run() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;

        System.setOut(ps);
```
### !end-setup
### !placeholder
```java
```
### !end-placeholder
### !tests
        System.out.flush();
        System.setOut(old);

        return baos.toString();
    }
}

public class SnippetTest {

    @Test
    public void verifyLoopOutput() {
        assertEquals("2\n4\n6\n", ChallengeSolution.run(),
                     "String produced by for loop");
    }

    @Test
    public void usedForLoop() {
        verifySourceContents(true, "for");
    }

    @Test
    public void notUsedWhileLoop() {
        verifySourceContents(false, "while");
    }

    private void verifySourceContents(boolean contains, String command) {
        String message = String.format("Solution uses '%s' loop", command);
        assertEquals(contains, RAW_SUBMISSION.matches("(?s).*\\b" + command + "\\s*\\(.*"), message);
    }
}
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: 859d66c6-7ff0-45bd-b2b4-3584fbf42b4f
* title: Comparing strings
##### !question
Given the following snippet, answer the question below.

```java
String firstGreeting = "Hello";
String secondGreeting = "Goodbye";
```
Which of the following options is the correct way to compare these two strings?
##### !end-question
##### !options
* `firstGreeting == secondGreeting`
* `firstGreeting === secondGreeting`
* `firstGreeting.equals(secondGreeting)`
* `firstGreeting.isEqual(secondGreeting)`
##### !end-options
##### !answer
`firstGreeting.equals(secondGreeting)`
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: bdd216b1-7085-4455-858f-a9c4db665086
* title: Comparing Integers
##### !question
Given the following snippet, answer the question below.

```java
Integer expectedCount = new Integer(25);
Integer actualCount = flowerModel.getPollenCount();
```
What is the correct way to compare these two Integers?
##### !end-question
##### !options
* `expectedCount == actualCount`
* `expectedCount === actualCount`
* `expectedCount.equals(actualCount)`
* `expectedCount.isEqual(actualCount)`
##### !end-options
##### !answer
`expectedCount.equals(actualCount)`
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 6aec036e-9c46-4c90-a638-dd29efbae65d
* title: Accessing arguments
##### !question
To access the arguments passed to the command line of a Java application use the ______ parameter.
##### !end-question
##### !answer
/(args)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

## Classes

### !challenge
* type: code-snippet
* language: java
* id: a8a17d79-de84-47ca-b587-bb715d95a53b
* title: Creating a Class
### !question
Create a class named `BankAccount` with properties named `name` and `balance`.  Do _not_ make the class public for this challenge.
### !end-question
### !placeholder

// paste your class here

### !end-placeholder
### !tests
```java
public class SnippetTest {
    @Test
    public void runMethodPassesAllTests() throws Throwable {
      Class bankAccountClass = getBankAccountClassOrFail();
      assertCorrectBankAccountFields(bankAccountClass);
    }

    private void assertCorrectBankAccountFields(Class bankAccountClass) {
        try {
            bankAccountClass.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            fail("Your BankAccount class should have a field called 'name'");
        }
        try {
            bankAccountClass.getDeclaredField("balance");
        } catch (NoSuchFieldException e) {
            fail("Your BankAccount class should have a field called 'balance'");
        }
    }

    private Class getBankAccountClassOrFail() {
      Class bankAccountClass = null;
      try {
          bankAccountClass = Class.forName("com.galvanize.BankAccount");
      } catch (ClassNotFoundException e) {
          fail("You must have a class named 'BankAccount'.");
      }
      return bankAccountClass;
    }
}
```
### !end-tests
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 5e3c0e09-fae5-434f-9c62-8bcc9c75f4ae
* title: A (mostly) functioning bank account
### !question
For this challenge, create a class named `BankAccount` in the space below.

The class should have the following methods and corresponding behavior:

  - `deposit(long cents)`: Adds cents to the bank account
  - `withdraw(long cents)`: Removes cents from the bank account
  - `balance()`: Returns the current balance on the bank account
  - `isOverDrawn()`: Returns true if the balance on the account is negative
### !end-question
### !setup
public class SnippetTest {
### !end-setup
### !placeholder
  //Implement the 'BankAccount' class here
### !end-placeholder
### !tests
   BankAccount account = new BankAccount();

   @BeforeEach
   void setAccountBalance() {
       long startingBalance = 12000;

       account.deposit(startingBalance);
   }

   @Test
   void depositAddsCentsToAccount() {
       long depositAmount = 12000;
       account.deposit(depositAmount);

       assertEquals(24000, account.balance(), "deposit() needs to add cents to balance");
   }

   @Test
    void withdrawRemovesCentsFromAccount() {

       long withdrawAmount = 10000;
       account.withdraw(withdrawAmount);

       assertEquals(2000, account.balance(), "withdraw() needs to remove cents from balance");
   }

   @Test
    void balanceReturnsAccountBalance() {
       assertEquals(12000, account.balance(), "balance() needs to return the account balance");
   }

   @Test
    void isOverDrawnReturnsTrueForNegativeBalance() {
       account.withdraw(13000);

       assertEquals(true, account.isOverDrawn(), "isOverDrawn() needs to return true for negative balances");
   }

   @Test
    void isOverDrawnReturnsFalseForPositiveBalance() {
       assertEquals(false, account.isOverDrawn(), "isOverDrawn() needs to return false for positive balances");
   }
}
### !end-tests
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 4bf472fe-dffe-48ff-8c07-3cc9f13d4043
* title: Using a constructor
### !question
Given the class `Order` below, declare a constructor that sets the order number and name.  When an order is created, it should also save the creation date (__hint__: use `LocalDateTime.now()`).

```java
class Order {
    private String orderNumber;
    private String name;
    private LocalDateTime createdDate;

    //constructor goes here

    public String getOrderNumber() {
      return orderNumber;
    }

    public String getName() {
      return name;
    }

    public LocalDateTime getCreatedDate() {
      return createdDate;
    }
}
```
### !end-question
### !setup
import java.time.LocalDateTime;
### !end-setup
### !placeholder
```java
class Order {
    private String orderNumber;
    private String name;
    private LocalDateTime createdDate;

    //your code goes here, do not change any existing code

    public String getOrderNumber() {
      return orderNumber;
    }

    public String getName() {
      return name;
    }

    public LocalDateTime getCreatedDate() {
      return createdDate;
    }
}
```
### !end-placeholder
### !tests
```java
public class SnippetTest {
    @Test
    public void orderConstructsWithANameAndOrderNumber() {
        Order fooBarOrder = new Order("foo", "bar");
        if (fooBarOrder.getOrderNumber() == "foo") {
            assertEquals("foo", fooBarOrder.getOrderNumber(), "orderNumber value");
            assertEquals("bar", fooBarOrder.getName(), "name value");
        } else {
            assertEquals("bar", fooBarOrder.getOrderNumber(), "orderNumber value");
            assertEquals("foo", fooBarOrder.getName(), "name value");
        }
    }
    @Test
    public void orderConstructsWithACreationDateTime() throws InterruptedException {
        Order fooBarOrder = new Order("foo", "bar");
        LocalDateTime fooBarCreation = fooBarOrder.getCreatedDate();
        Thread.sleep(1000);
        Order joeOneOrder = new Order("Joe", "One");

        assertTrue(fooBarCreation.equals(fooBarOrder.getCreatedDate()));
        assertTrue(fooBarCreation.isBefore(joeOneOrder.getCreatedDate()));
    }
}
```
### !end-tests
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 265b19db-a4de-4a20-9897-71d668cc3119
* title: Returning internal state
### !question
Write a public method named `bar` that returns the value of the `bar` field multiplied by 20.
### !end-question
### !setup
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Snippet {
    private int bar = 10;
### !end-setup
### !placeholder
```
    // declare your method here
```
### !end-placeholder
### !tests
```java

    public void setBar(int bar) {
      this.bar = bar;
    }
}

public class SnippetTest {
    @Test
    public void barReturnsBarTimes20() {
        Snippet instance = new Snippet();
        assertEquals(200, instance.bar(), instance.bar(), "the value of bar()");
        instance.setBar(3);
        assertEquals(60, instance.bar(), "the value of bar()");
    }

    @Test
    public void fooIsPublicAndHasIntReturn() {
        try {
            Method bar = Snippet.class.getDeclaredMethod("bar");
            assertEquals(int.class, bar.getReturnType(), "The return type of the bar method");
            assertEquals(true, Modifier.isPublic(bar.getModifiers()), "bar is public");
        } catch (NoSuchMethodException e) {
            fail("You must have a method named foo that takes an int as a param");
        }
    }
}
```
### !end-tests
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: da4f2fb4-42a8-4771-bc07-5222b06a85f2
* title: Using instanceof
### !question
 You are given the following class declarations:
 ```java
 class User implements Comparable, Cloneable {
 }

 class Employee extends User {
 }

 class Manager extends Employee {
 }

 class Customer extends User {
 }
 ```
 In the space given below, define and declare the following methods:
   - `boolean isEmployee(Object o)` - Returns true if the given object is an `Employee` object or a subclass of it.
   - `boolean isManager(Object o)` - Returns true if the given object is a `Manager` object.
   - `boolean isCustomer(Object o)` - Returns true if the given object is a `Customer` object.
   - `boolean isComparable(Object o)` - Returns true if the class of the given object implements the `Comparable` interface.

 _Note_: Recall that a subclass will also inherit the implementing interfaces from its superclass.
### !end-question
### !setup
import java.io.IOException;
import com.galvanize.util.*;

public class SnippetTest {
  class User implements Comparable, Cloneable {
    @Override
    public int compareTo(Object o) {
      return 0;
    }
  }

  class Employee extends User {
  }

  class Manager extends Employee {
  }

  class Customer extends User {
  }
### !end-setup
### !placeholder
// Implement the methods here
### !end-placeholder
### !tests
    ClassProxy _SnippetTest;
    InstanceProxy instance;

    @BeforeEach
    public void setup() {
      _SnippetTest = ClassProxy.of(this.getClass());
      instance = new InstanceProxy(this, _SnippetTest);
    }

    private void ensureMethodExists(String methodName) {
      _SnippetTest.ensureMethod(m -> m
          .named(methodName)
          .withParameters(Object.class)
          .returns(Boolean.TYPE));
    }


    @Test
    public void isEmployeeReturnsTrueForEmployee() {
      ensureMethodExists("isEmployee");
      Employee someEmployee = new Employee();
      assertEquals(true, instance.invoke("isEmployee", someEmployee), "Employee isEmployee");
    }

    @Test
    public void isEmployeeReturnsTrueForManager() {
      ensureMethodExists("isEmployee");
      Manager someManager = new Manager();
      assertEquals(true, instance.invoke("isEmployee", someManager), "Manager isEmployee");
    }

    @Test
    public void isEmployeeReturnsFalseForUser() {
      ensureMethodExists("isEmployee");
      User someUser = new User();
      assertEquals(false, instance.invoke("isEmployee", someUser), "User isEmployee");
    }

    @Test
    public void isEmployeeReturnsFalseForCustomer() {
      ensureMethodExists("isEmployee");
      Customer someCustomer = new Customer();
      assertEquals(false, instance.invoke("isEmployee", someCustomer), "Customer isEmployee");
    }

    @Test
    public void isManagerReturnsFalseForCustomer() {
      ensureMethodExists("isManager");
      Customer someCustomer = new Customer();
      assertEquals(false, instance.invoke("isManager", someCustomer), "Customer isManager");
    }

    @Test
    public void isManagerReturnsFalseForUser() {
      ensureMethodExists("isManager");
      User someUser = new User();
      assertEquals(false, instance.invoke("isManager", someUser), "User isManager");
    }

    @Test
    public void isManagerReturnsFalseForEmployee() {
      ensureMethodExists("isManager");
      Employee someEmployee = new Employee();
      assertEquals(false, instance.invoke("isManager", someEmployee), "Employee isManager");
    }

    @Test
    public void isManagerReturnsTrueForManager() {
      ensureMethodExists("isManager");
      Manager someManager = new Manager();
      assertEquals(true, instance.invoke("isManager", someManager), "Manager isManager");
    }

    @Test
    public void isCustomerReturnsTrueForCustomer() {
      ensureMethodExists("isCustomer");
      Customer someCustomer = new Customer();
      assertEquals(true, instance.invoke("isCustomer", someCustomer), "Customer isCustomer");
    }

    @Test
    public void isCustomerReturnsFalseForManager() {
      ensureMethodExists("isCustomer");
      Manager someManager = new Manager();
      assertEquals(false, instance.invoke("isCustomer", someManager), "Manager isCustomer");
    }

    @Test
    public void isComparableReturnsTrueForUser() {
      ensureMethodExists("isComparable");
      User someUser = new User();
      assertEquals(true, instance.invoke("isComparable", someUser), "User isComparable");
    }

    @Test
    public void isComparableReturnsTrueForEmployee() {
      ensureMethodExists("isComparable");
      Employee someEmployee = new Employee();
      assertEquals(true, instance.invoke("isComparable", someEmployee), "Employee isComparable");
    }

    @Test
    public void isComparableReturnsTrueForManager() {
      ensureMethodExists("isComparable");
      Manager someManager = new Manager();
      assertEquals(true, instance.invoke("isComparable", someManager), "Manager isComparable");
    }

    @Test
    public void isComparableReturnsTrueForCustomer() {
      ensureMethodExists("isComparable");
      Customer someCustomer = new Customer();
      assertEquals(true, instance.invoke("isComparable", someCustomer), "Customer isComparable");
    }

    @Test
    public void isComparableReturnsTrueForString() {
      ensureMethodExists("isComparable");
      assertEquals(true, instance.invoke("isComparable", "String literal"), "String isComparable");
    }
}
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: b590daf0-79bd-4099-b40d-0320d9ef6000
* title: Primary constructors
##### !question
### Question
Given the class below, which of the constructors is the primary constructor?
```
class Car {
    private int mileage;
    private String make;

    Car() {
        this("Unknown");
    }

    Car(String make) {
        this(0, make);
    }

    Car(int mileage, String make) {
        this.mileage = mileage;
        this.make = make;
    }
}
```
##### !end-question
##### !options
* `Car()`
* `Car(String make)`
* `Car(int mileage, String make)`
* none of the above
##### !end-options
##### !answer
`Car(int mileage, String make)`
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 53fc679c-2f4e-4a84-9438-5dbf72e65a9b
* title: RGR process
##### !question
Red-Green-Refactor is a process for doing:
##### !end-question
##### !options
* Team feedback
* Specification documents
* Story pointing
* Test-Driven Development
##### !end-options
##### !answer
Test-Driven Development
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: a4272305-b457-406c-b32b-e6f537845b04
* title: Rules of RGR
##### !question
The rule or rules to follow when using red-green-refactor is/are:
##### !end-question
##### !options
* Write _all_ of the tests your class will need before writing code
* Only write code in response to a failing test
* Make the tests pass with the simplest code possible
* Think about how you will implement your code before writing the test
* Write the proper implementation code as soon as it is clear
##### !end-options
##### !answer
* Only write code in response to a failing test
* Make the tests pass with the simplest code possible
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: b7c13ab4-8513-492f-ac04-a99ee843464d
* title: Non-covered code margin color
##### !question
When viewing the code that has been analyzed by the IntelliJ code coverage tool, code that has not been covered by the tests will be indicated with a margin color of:
##### !end-question
##### !options
* Blue
* Green
* Red
* Yellow
##### !end-options
##### !answer
Red
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 76fa03db-b70d-4ab7-98fd-7a61de335d1a
* title: Command to execute
##### !question
What is the command for running the code coverage report with Gradle?
##### !end-question
##### !answer
/(gradlew.*jacocoTestReport)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 79b223ca-cd8e-4b84-b576-3666c0849be2
* title: Casting from a specific to a general type
##### !question
Can a cast be done in reverse? In other words, can you cast from a more
_specific_ type to a more _general_ type, as shown below?

```java
Object myString = (Object) "Hi there!";
```
##### !end-question
##### !options
* No, this is not allowed and causes a compile-time error.
* The code compiles but it throws a run-time exception.
* Yes, this is done routinely.
* Yes, but it is unnecessary.
##### !end-options
##### !answer
Yes, but it is unnecessary.
##### !end-answer
### !end-challenge

## Algorithms

### !challenge
* type: multiple-choice
* id: 9cb01e47-9b42-4696-9a43-62e35c346cc2
* title: Instantiating Arrays
##### !question
### Question
Which of the following is a legal instantiation of a new `String` array?
##### !end-question
##### !options
* `stringArray = new String[];`
* `String[] stringArray = new String[10];`
* `String[] stringArray = ["Hello", "World"];`
* `String stringArray = new ["Hello", "World"];`
##### !end-options
##### !answer
`String[] stringArray = new String[10];`
##### !end-answer
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 8bab92fb-6e00-4014-84ce-8a5446692658
* title: Basic operations with ArrayLists
### !question
For the given method signature, write an implementation that takes an array of strings and returns an `ArrayList` of those strings sorted in alphabetical order.

_Note_: remember to attempt this challenge in your Java playground first and then paste your answer below. Do not write it directly in the editor.

### !end-question
### !setup
```java
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class ArrayListChallenge {
```
### !end-setup
### !placeholder
```java
// Implement the sortArray method below below
public ArrayList<String> sortArray(String[] inputArray) {

}
```
### !end-placeholder
### !tests
```java
}

public class SnippetTest {
  ArrayListChallenge challenge = new ArrayListChallenge();

   @Test
   public void sortArrayReturnsForSingleString() {

       ArrayList<String> result = challenge.sortArray(new String[]{"Apple"});

       assertEquals("Apple", result.get(0), "Array with single string ");
   }

   @Test
   public void sortArraySortsTwoElements() {
       ArrayList<String> result = challenge.sortArray(new String[]{"Bob", "Alice"});

       assertEquals("Alice", result.get(0), "Array with two strings ");
       assertEquals("Bob", result.get(1), "Array with two strings ");
   }

   @Test
   public void sortArrayWithStartingLetters() {
       ArrayList<String> result = challenge.sortArray(new String[]{"Alice", "Alex"});

       assertEquals("Alex", result.get(0), "Array with lexicographically close words ");
       assertEquals("Alice", result.get(1), "Array with lexicographically close words ");
   }
}
```
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: 7cc9d1eb-e5f1-475f-b91d-4610bf73214e
* title: Instantiating a HashMap
##### !question
### Question
Which of the following is a legal instantiation of a new `HashMap` containing
strings that can be looked up by keys that are arbitrary integers?
##### !end-question
##### !options
* `List<String> items = new ArrayList<>();`
* `HashMap items = new HashMap();`
* `HashMap<Integer, String> items = new HashMap<>();`
* `HashMap<String, Integer> items = new HashMap<>();`
##### !end-options
##### !answer
`HashMap<Integer, String> items = new HashMap<>();`
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 9470ee0f-4b38-43de-aaa2-22ad9262661d
* title: Big O performance of HashMap
##### !question
The following are a few examples Big O Notation from highest
performance to lowest. Which one of these describes how the running time of a
`HashMap` lookup varies with its size?
##### !end-question
##### !options
* O(1)
* O(log n)
* O(n)
* O(n<sup>2</sup>)
##### !end-options
##### !answer
O(1)
##### !end-answer
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 9a456906-eb8f-416d-a231-4d574a666f8b
* title: Basic operations with HashMap
### !question
For the given method signature, write an implementation that generates
a `HashMap`, adds the following two items, and returns this new `HashMap`.

* The string, "Airplane", associated with key 747
* The string, "Laphroaig", associated with key 10

_Note:_ remember to attempt this challenge in your Java playground first
and then paste your answer below. Do not write it directly in the editor.
### !end-question
### !setup
```java
// [include any imports specific to your tests]
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

// [to allow student to submit simple statements, wrap the submission
//  using the !setup and !tests sections; example below]
class HashMapChallenge {
```
### !end-setup
### !placeholder
```java
public HashMap<Integer, String> genHashMap() {

}
```
### !end-placeholder
### !tests
}

public class SnippetTest {
  HashMapChallenge challenge = new HashMapChallenge();

   @Test
   public void correctHashMapShouldBeReturned() {

       HashMap<Integer, String> result = challenge.genHashMap();

       assertEquals("Laphroaig", result.get(10), "Value for key 10");
       assertEquals("Airplane", result.get(747), "Value for key 747");
   }
}
### !end-tests
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 0752e567-4444-44f2-bdeb-1fe2f161d6bc
* title: Solving an accumulator problem
### !question
In the space below, define and implement a method called `toSentence`. It takes as input an array of strings (`String[]`) and returns a string that contains all the elements of the array joined by a comma, with the last element joined by "and".

  > - Input _[""]_ should return ""
  > - Input _[]_ should return ""
  > - Input _["Alice", "Bob"]_ should return "Alice and Bob"
  > - Input _["Alice", "Bob", "Carol"]_ should return "Alice, Bob and Carol"

_Note_: remember to attempt this challenge in your Java playground first and then paste your answer below. Do not write it directly in the editor.
### !end-question
### !setup
class AccumulatorChallenge {
### !end-setup
### !placeholder
// Define your toSentence method here
### !end-placeholder
### !tests
}

  // public test class name **must** be `SnippetTest` to match the generated file name
public class SnippetTest {

  AccumulatorChallenge accumulator = new AccumulatorChallenge();

  @Test
  public void toSentenceReturnsEmptyForEmptyArray() {
      String[] input = new String[0];

      assertEquals("", accumulator.toSentence(input), "Empty Array");
  }

  @Test
  public void toSentenceReturnsEmptyForArrayWithEmptyString() {
      String[] input = new String[]{""};

      assertEquals("", accumulator.toSentence(input),"Array with empty string");
  }

  @Test
  public void toSentenceReturnsResultForTwoWords() {
      String[] input = new String[]{"coffee", "bagels"};

      assertEquals("coffee and bagels", accumulator.toSentence(input), "Array with two words");
  }

  @Test
  public void toSentenceReturnsResultForThreeWords() {
      String[] input = new String[]{"class", "interface", "enum"};

      assertEquals("class, interface and enum", accumulator.toSentence(input), "Array with three words");
  }

  @Test
  public void toSentenceReturnsResultForArbitraryList() {
      String[] input = {"Frodo", "Sam", "Aragorn", "Gimli", "Boromir", "Legolas", "Gandalf", "Merry", "Pippin"};

      assertEquals("Frodo, Sam, Aragorn, Gimli, Boromir, Legolas, Gandalf, Merry and Pippin", accumulator.toSentence(input), "Array with arbitrary number of words");
  }
}
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: a40c2da9-73c9-4ead-9320-870b5f3a1c55
* title: Boxing and Generics
##### !question
### Question
How would you create a HashMap that maps primitive integers to booleans?
##### !end-question
##### !options
* `HashMap<Integer, Boolean> map = new HashMap<>();`
* `HashMap<Int, Bool> map = new HashMap<>();`
* `HashMap<int, bool> map = new HashMap<>();`
##### !end-options
##### !answer
`HashMap<Integer, Boolean> map = new HashMap<>();`
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: f3f6e660-4d32-4ccd-92fb-bc579059e166
* title: Lists
##### !question
Lists store items:
##### !end-question
##### !options
* as unique elements
* in an order
* as a key/value pair
* as document objects
##### !end-options
##### !answer
in an order
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: b9322706-6f1d-481c-bf09-a1c0120fbd72
* title: Sets
##### !question
Sets store items:
##### !end-question
##### !options
* as unique elements
* in an order
* as a key/value pair
* as document objects
##### !end-options
##### !answer
as unique elements
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: abc483fa-6556-4da9-8859-851d30b690f5
* title: Data type for crawling a webpage?
##### !question
Which data type makes the most sense to use for storing all of the URLS linked to on a webpage?
##### !end-question
##### !options
* LinkedList
* ArrayList
* LinkedHashMap
* HashMap
* LinkedHashSet
* HashSet
##### !end-options
##### !answer
LinkedHashSet
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: f12b95a7-f570-4775-82e1-08f83a370dd5
* title: Choosing a return type
##### !question
```java
public ???? makeInts() {
    ????<Integer> numList = new ArrayList<>();

    for(int i = 0; i < 100; i++) {
      numList.add(i);
    }

    return numList;
}
```

Given the above code, replace "????" with the best option below:
##### !end-question
##### !options
* `List<Integer>`
* `ArrayList<Integer>`
* `LinkedList<Integer>`
* `Map<Integer, String>`
##### !end-options
##### !answer
`ArrayList<Integer>`
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: d332971f-2417-4af5-bfdb-f20f999620af
* title: Choosing a parameter type
##### !question
```java
void HashMap<String, Integer> mapNameId(???? names) {
    HashMap<String, Integer> nameMap = new HashMap<String, Integer>;

    String name = names.pop();

    ...

    return nameMap;
}
```

Given above code, replace the "???" with the best option below:
##### !end-question
##### !options
* `ArrayList<String>`
* `List<Integer>`
* `LinkedList<String>`
* `Map<Integer, String>`
##### !end-options
##### !answer
`LinkedList<String>`
##### !end-answer
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 5be20142-cf79-4a72-8c08-c56bcb16515c
* title: Using a lambda
### !question
You are provided a list of strings named `fileNames` that looks like this:
```
["My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc"]
```

Write a `forEach` and pass it a lambda that _prints_ the filenames, but with spaces replaced with dashes (-), e.g., "My-Report.csv" and "The-Best-Deck.pdf".
### !end-question
### !setup
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SnippetTest {

    @Test
    public void LambdaAddsDashes() {  

        PrintStream original = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        class LambdaCatcher {
            List<String> words = new ArrayList<>(Arrays.asList("My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc"));

            public void forEach(Consumer<String> action) {
                words.forEach(action);
            }

            public List<String> getWords() {
                return words;
            }
        }

        LambdaCatcher fileNames = new LambdaCatcher();
### !end-setup
### !placeholder
// paste your code here
### !end-placeholder
### !tests
```java

        assertEquals("My-Report.csv\n" +
                  "The-Best-Deck.pdf\n" +
                  "Thanks-for-all-the-fishes.doc\n", outContent.toString(), "The file names");

        System.setOut(original);
    }
}
```
### !end-tests
### !end-challenge

## Organization

### !challenge
* type: short-answer
* id: 24f33b42-771e-4b47-ba78-bd0c2f3e352f
* title: Importing packages
##### !question
How would you import everything in the package `com.galvanize.components`?
##### !end-question
##### !answer
/import com\.galvanize\.components\.\*/
##### !end-answer
##### !placeholder
Answer here
##### !end-placeholder
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 1d279117-d21d-4e9c-8b54-0602f034303a
* title: Implementing an interface
### !question
Copy the following code into Intellij:

```java
public class Browser {
    private URI currentPage;
    private ArrayList<String> history;
    private LocalDateTime visitedAt;
    private HashMap<String, Integer> visitCount;
    private boolean on;
}
```

Make all of the imports work and paste them below.
### !end-question
### !placeholder
```
// Your imports go here
```
### !end-placeholder
### !tests
```java
public class SnippetTest {
    public class Browser {
        private URI currentPage;
        private ArrayList<String> history;
        private LocalDateTime visitedAt;
        private HashMap<String, Integer> visitCount;
        private boolean on;

        Browser() {
            this.on = true;
        }

        public boolean isOn() {
            return on;
        }
    }

    @Test
    public void browserClassCompiles() {
        assertEquals(true, new Browser().isOn(), "The browser class compiles");
    }
}
```
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: fb69ab66-ab51-45d8-b9bf-2a3a722cba83
* title: Protected
##### !question
### Question
Given the following package structure (all classes are `public`):

```
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── galvanize
│   │               ├── Application.java
│   │               ├── content
│   │               │   ├── Comment.java
│   │               │   └── Post.java
│   │               └── store
│   │                   ├── Product.java
│   │                   ├── Shipping.java
│   │                   ├── ecommerce
│   │                   │   └── DigitalProduct.java (subclass of product)
│   │                   └── orders
│   │                       ├── Order.java
│   │                       └── OrderItem.java
```

If you had a `protected` method in your `Product` class, what other classes would have visibility of this method?
##### !end-question
##### !options
* All classes
* Only `Shipping`
* `Shipping` and `DigitalProduct`
* Only `DigitalProduct`
* Only `Order`
* `Order` and `OrderItem`
* None of the above
##### !end-options
##### !answer
`Shipping` and `DigitalProduct`
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 0c9e8543-e13d-49ad-8183-b2cce7d24c1d
* title: Private
##### !question
### Question
Given the following package structure (all classes are `public`):

```
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── galvanize
│   │               ├── Application.java
│   │               ├── content
│   │               │   ├── Comment.java
│   │               │   └── Post.java
│   │               └── store
│   │                   ├── Product.java
│   │                   ├── Shipping.java
│   │                   ├── ecommerce
│   │                   │   └── DigitalProduct.java (subclass of product)
│   │                   └── orders
│   │                       ├── Order.java
│   │                       └── OrderItem.java
```

If you had a `private` method in your `Product` class, what other classes would have visibility of this method?
##### !end-question
##### !options
* All classes
* Only `Shipping`
* `Shipping` and `DigitalProduct`
* Only `DigitalProduct`
* Only `Order`
* `Order` and `OrderItem`
* None of the above
##### !end-options
##### !answer
None of the above
##### !end-answer
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: dc8358bb-4f5b-437c-bc70-27f939ef0d99
* title: Using enums
### !question
Given this class:
```java
class PhoneNumber {
  public enum Type {
    HOME, WORK, CELL
  }

  private Type type = Type.CELL;

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }
}
```

Declare a variable named `homePhone`, assign it to a new phone number, and then set its type to `HOME`.
### !end-question
### !setup
```java
class PhoneNumber {
  public enum Type {
    HOME, WORK, CELL
  }

  private Type type = Type.CELL;

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }
}

class EnumChallenge {

    public static PhoneNumber run() {
        // Start Student Code
```
### !end-setup
### !placeholder
// Add your statement here
### !end-placeholder
### !tests
```java
        // End Student Code
        return homePhone;
    }
}

public class SnippetTest {

    @Test
    public void verifyType() {
        assertEquals(PhoneNumber.Type.HOME, EnumChallenge.run().getType(), "'homePhone' should have a type of 'HOME'");
    }

}
```
### !end-tests
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 7079fab2-ce4c-4bde-ab1c-b113b1ae1860
* title: Implementing an interface
### !question
Given the following class:

```java
public interface Browseable {
    public void visit(URI uri);

    public URI getCurrentPage();
}
```

Create a class named `Crawler` that implements the interface in such a way that
when you call `visit` with a URI it changes the return value of the
`currentPage` method.  For the purposes of this exercise, do __not__ give the
class declaration a `public` access modifier.

_Note:_ remember to attempt this challenge in your Java playground first
and then paste your answer below. Do not write it directly in the editor.
### !end-question
### !setup
```java
import java.net.URI;
import java.net.URISyntaxException;

public class SnippetTest {
    public interface Browseable {
        public void visit(URI uri);

        public URI getCurrentPage();
    }
```
### !end-setup
### !placeholder
```
// Your class goes here
```
### !end-placeholder
### !tests
```java

    Crawler crawler = new Crawler();

    @Test
    public void theCrawlerClassImplementsBrowseable() {
        assertEquals(true, Browseable.class.isAssignableFrom(Crawler.class), "Expected your class to implement 'Browseable'");
    }

    @Test
    public void theVisitMethodSetsCurrentPage() {
        try {
            URI uri = new URI("www.google.com/unique1");
            crawler.visit(uri);
            assertEquals(uri, crawler.getCurrentPage(), "The value of getCurrentPage");
            URI uriTwo = new URI("www.google.com/otherUnique");
            crawler.visit(uriTwo);
            assertEquals(uriTwo, crawler.getCurrentPage(), "The value of getCurrentPage");
        } catch (URISyntaxException e) {
            fail("The URI didn't not work");
        }
    }

    @Test
    public void crawlerMethodsHaveOverrideAnnotation() {
        String[] rawAnnotations = RAW_SUBMISSION.split("@");

        if (rawAnnotations.length != 3
                || !rawAnnotations[1].startsWith("Override")
                || !rawAnnotations[2].startsWith("Override")) {
            fail("You should have @Override annotations on your methods");
        }
    }

}
```
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: 1c708ee3-5b1e-44cd-8403-b24e1d3fed13
* title: Calling static fields
##### !question
### Question
```
public class Foo {
    public static String BAR = "bar";

    public String getBar() {
        return "bar";
    }

    public static String doubleBar() {
        return BAR + BAR;
    }
}
```
Given the following code, how would I get the value of the static field `BAR`?
##### !end-question
##### !options
* `Foo.BAR`
* `new Foo().BAR`
* `Foo().BAR()`
* `Foo().BAR`
##### !end-options
##### !answer
`Foo.BAR`
##### !end-answer
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 36a7ff75-cfd4-4da5-8bb2-eedea9e1c18c
* title: Creating a nested static class
### !question
Given the following code, create a nested static class named `Currency` that constructs with an instance of the `Product` class and has a method named `getUSD`.  `getUSD` should return the money value as a string, such as `$8.31`.  Add a method to your `Product` class called `getCurrency` that returns an instance of the `Currency` class.
### !end-question
### !setup
```java
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
```
### !end-setup
### !placeholder
```java
class Product {
    Product(String name, int valueInCents) {
        this.name = name;
        this.valueInCents = valueInCents;
    }

    private String name;
    private int valueInCents;

    public String getName() {
        return name;
    }

    public int getValueInCents() {
        return valueInCents;
    }

    //declare your class here
}
```
### !end-placeholder
### !tests
```java
public class SnippetTest {
  @Test
  public void runMethodPassesAllTests() throws Throwable {
      Class productClass = getProductClassOrFail();
      Class currencyClass = getCurrencyClassOrFail(productClass);
      Constructor currencyConstructor = getCurrencyConstructorOrFail(currencyClass);
      Method getCurrencyMethod = getGetCurrencyMethodOrFail(productClass);
      Method getUSDMethod = getGetUSDMethodOrFail(currencyClass);
      Product dollarProduct = new Product("buck", 100);
      Product dollarFiftyProduct = new Product("buckFifty", 150);
      Object dollarCurrencyInstance = getCurrencyInstanceOrFail(currencyConstructor, dollarProduct);
      Object dollarFiftyCurrencyInstance = getCurrencyInstanceFromMethodOrFail(getCurrencyMethod, dollarFiftyProduct);
      assertGetUSDFunctionality(getUSDMethod, dollarCurrencyInstance);
      assertGetUSDFunctionalityViaReflection(getUSDMethod, dollarFiftyCurrencyInstance);
  }

  private Class getProductClassOrFail() {
      Class productClass = null;
      try {
          productClass = Class.forName("com.galvanize.Product");
      } catch (ClassNotFoundException e) {
          fail("You must have a class named 'Product', did you delete it?");
      }
      return productClass;
  }

  private Class getCurrencyClassOrFail(Class productClass) {
      Class currencyClass = null;
      for (Class innerClass : productClass.getDeclaredClasses()) {
          if (Modifier.isStatic(innerClass.getModifiers()) && innerClass.getName() == "com.galvanize.Product$Currency") {
              currencyClass = innerClass;
          }
      }
      if (currencyClass == null) {
          fail("Your 'Product' class must have a nested static class named 'Currency'.");
      }

      return currencyClass;
  }

  private Constructor getCurrencyConstructorOrFail(Class currencyClass) {
      Constructor currencyConstructor = null;
      try {
          currencyConstructor = currencyClass.getDeclaredConstructor(Product.class);
      } catch (NoSuchMethodException e) {
          fail("Your Currency class must have a constructor that accepts a product");
      }
      return currencyConstructor;
  }

  private Method getGetCurrencyMethodOrFail(Class productClass) {
      Method getCurrencyMethod = null;
      try {
          getCurrencyMethod = productClass.getMethod("getCurrency");
      } catch (NoSuchMethodException e) {
          fail("Your Currency class must have a method called getCurrency");
      }
      return getCurrencyMethod;
  }

  private Method getGetUSDMethodOrFail(Class currencyClass) {
      Method getUSDMethod = null;
      try {
          getUSDMethod = currencyClass.getMethod("getUSD");
      } catch (NoSuchMethodException e) {
          fail("Your Currency class must have a method called getCurrency");
      }
      return getUSDMethod;
  }

  private Object getCurrencyInstanceOrFail(Constructor currencyConstructor, Object product) {
      Object currencyInstance = null;
      try {
          currencyInstance = currencyConstructor.newInstance(product);
      } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
          fail("Could not construct a currency, do you have a constructor that takes a product?");
      }
      return currencyInstance;
  }

  private Object getCurrencyInstanceFromMethodOrFail(Method getCurrencyMethod, Object product) {
      Object currencyInstance = null;
      try {
          currencyInstance = getCurrencyMethod.invoke(product);
      } catch (IllegalAccessException | InvocationTargetException e) {
          fail("Could not construct a currency, do you have a constructor that takes a product?");
      }
      return currencyInstance;
  }

  private void assertGetUSDFunctionality(Method getUSD, Object currencyInstance) {
      try {
          assertEquals("$1.00", getUSD.invoke(currencyInstance), "getUSD value");
      } catch (InvocationTargetException| IllegalAccessException e) {
          fail("Could not call the getUSD method");
      }
  }

  private void assertGetUSDFunctionalityViaReflection(Method getUSD, Object currencyInstance) {
      try {
          assertEquals("$1.50", getUSD.invoke(currencyInstance), "getUSD value");
      } catch (InvocationTargetException| IllegalAccessException e) {
          fail("Could not call the getUSD method");
      }
  }
}
```
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: 0ee1afc9-8a1e-448d-a4cd-354ea2fdc5bb
* title: Libraries
##### !question
### Question
Given the following class:
```
public class LightSaber {

    private static float EFFICIENCY = 10.0f;

    private float charge = 100.0f;
    private long jediSerialNumber;
    private String color = "green";

    public LightSaber(long jediSerialNumber){
        this.jediSerialNumber = jediSerialNumber;
    }

    public float getCharge() {
        System.out.println(charge);
    }

    public long getJediSerialNumber() {
        return jediSerialNumber;
    }

    public String getColor() {
        return color;
    }

    public void use(float minutes) {
        charge -= (EFFICIENCY / 60.0f) * minutes;
    }

    public float getRemainingMinutes() {
        return ((charge/EFFICIENCY)*60);
    }

    public void recharge(){
        charge = 100.0f;
    }
}
```

Which code needs to be refactored?
##### !end-question
##### !options

*
  ```java
  public float getRemainingMinutes() {
      return ((charge/EFFICIENCY)*60);
  }
  ```

*
  ```java
  public float getCharge() {
      System.out.println(charge);
  }
  ```

*
  ```java
  public LightSaber(long jediSerialNumber){
      this.jediSerialNumber = jediSerialNumber;
  }
  ```

*
  ```java
  public String getColor() {
        return color;
  }
  ```
##### !end-options
##### !answer
```java
public float getCharge() {
    System.out.println(charge);
}
```
##### !end-answer
### !end-challenge

## Exceptions

### !challenge
* type: multiple-choice
* id: 89c11a1c-3697-4bbb-b88f-3e0c186cf356
* title: Catch block
##### !question
### Question
Given the code sample below:
```java
public static void doIt(int bar) {
    int foo = 0;
    int baz = 0;

    try {
        foo = bar / baz;
    } catch (NullPointerException ex) {
        System.out.println("Something blew up!");
    } finally {
        System.out.println("Done");
    }

    System.out.println("foo: " + foo);
}

doIt(5);

```

What is the output when `bar` is `5`?
##### !end-question
##### !options
*
 ```
 Done
 Something blew up!
 ```

*
 ```
 Done
 Exception in thread "main" java.lang.ArithmeticException: / by zero
   at com.galvanize.exceptions.Application.main(Application.java:9)
 foo: 0
 ```

*
 ```
 Done
 foo: 2
 ```

*
 ```
 Done
 Exception in thread "main" java.lang.ArithmeticException: / by zero
   at com.galvanize.exceptions.Application.main(Application.java:9)
 ```
##### !end-options
##### !answer
```
Done
Exception in thread "main" java.lang.ArithmeticException: / by zero
  at com.galvanize.exceptions.Application.main(Application.java:9)
```
##### !end-answer
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: 7512f4a7-fbf8-445f-a958-8f63c041aa96
* title: Working with try, catch, and finally
### !question
Write a `try` / `catch` / `finally` block that does the following:

* Makes a call to the method `run` on the variable `riskyProcess` passing the parameter `input` (Note: the `riskyProcess` variable is provided for you)

* Catches a `NullPointerException` and prints "encountered null pointer"

* Catches an `IndexOutOfBoundsException` and prints "index out of bounds"

* Always prints "Done", no matter what

Given this code:

```java
result = riskyProcess.run(input);
System.out.println("Done"); // always print this, no matter what
```

Your objective is to make all unit tests pass by utilizing `try` / `catch` / `finally`. You must handle all exceptions thrown by the `riskyProcess.run` method.
### !end-question
### !setup
```java
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ExceptionsChallenge {

    static String doIt(String input, RiskyProcess riskyProcess) {
       String result = "";
```
### !end-setup
### !placeholder
```java
result = riskyProcess.run(input);
System.out.println("Done"); // always print this, no matter what
```
### !end-placeholder
### !tests
```java
      // Tests section
      return result;
    }
}

interface RiskyProcess {
    String run(String input);
}

public class SnippetTest {
    private static final PrintStream ORIGINAL_OUT = System.out;

    public static final String FOO = "foo";
    public static final String NO_EXCEPTIONS = "no exceptions";
    public static final String CATCHES_NULL_POINTER_EXCEPTION = "Should handle NullPointerException and print message per instructions";
    public static final String CATCHES_INDEX_OUT_OF_BOUNDS_EXCEPTION = "Should handle IndexOutOfBoundsException and print message per instructions";
    public static final String DONE = "Done";
    public static final String INDEX_OUT_OF_BOUNDS = "index out of bounds";
    public static final String ENCOUNTERED_NULL_POINTER = "encountered null pointer";
    public static final String HIT_A_RUNTIME_EXCEPTION = "hit a runtime exception";
    public static final String FINALLY_ALWAYS_RUNS = "finally always runs";
    public static final String FINALLY_PRINTS_DONE = "Finally prints 'Done'";

    private ByteArrayOutputStream outputByteArray;

    @BeforeEach
    public void overrideSystemOut() {
        outputByteArray = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputByteArray));
    }

    @AfterEach
    public void resetSystemOut() {
       System.setOut(ORIGINAL_OUT);
    }

    // happy path no exceptions: verify finally
    @Test
    @DisplayName(NO_EXCEPTIONS)
    public void noExceptions() {
        RiskyProcess riskyProcess = input -> input;

        String result = ExceptionsChallenge.doIt(FOO, riskyProcess);
        verifyFinally();
        assertEquals(FOO, result);
    }

    // caught exception: verify catches null pointer exception and verify finally
    @Test
    @DisplayName(CATCHES_NULL_POINTER_EXCEPTION)
    public void catchesNullPointerException() {
        RiskyProcess riskyProcess = input -> {
            throw new NullPointerException(CATCHES_NULL_POINTER_EXCEPTION);
        };

        ExceptionsChallenge.doIt(FOO, riskyProcess);

        int indexOfOutput = getIndexForOutput(ENCOUNTERED_NULL_POINTER);
        assertEquals(true, 0 == indexOfOutput, "Prints message for handling NullPointerException");
        verifyFinally();
    }

    // catches index out of bounds exception and verify finally
    @Test
    @DisplayName(CATCHES_INDEX_OUT_OF_BOUNDS_EXCEPTION)
    public void catchesIndexOutOfBoundsException() {
        RiskyProcess riskyProcess = input -> {
            throw new IndexOutOfBoundsException(CATCHES_INDEX_OUT_OF_BOUNDS_EXCEPTION);
        };

        ExceptionsChallenge.doIt(FOO, riskyProcess);

        int indexOfOutput = getIndexForOutput(INDEX_OUT_OF_BOUNDS);
        assertEquals(true, 0 == indexOfOutput, "Prints message for handling IndexOutOfBoundsException");
        verifyFinally();
    }

    @Test
    @DisplayName(FINALLY_ALWAYS_RUNS)
    public void finallyAlwaysRuns() {
        RiskyProcess riskyProcess = input -> {
            throw new RuntimeException(HIT_A_RUNTIME_EXCEPTION);
        };

        try {
            ExceptionsChallenge.doIt(FOO, riskyProcess);
        } catch (RuntimeException e) {
            verifyFinally();
        }
    }

    private int getIndexForOutput(String output) {
        String indexOutOfBoundsMessage = outputByteArray.toString();
        String [] strings = indexOutOfBoundsMessage.split("\n");
        List<String> stringsList = Arrays.stream(strings)
            .collect(Collectors.toList());

        return stringsList.indexOf(output);
    }

    private void verifyFinally() {
        String output = outputByteArray.toString();
        String [] strings = output.split("\n");
        List<String> stringsList = Arrays.stream(strings)
            .collect(Collectors.toList());

        int indexForFinallyOutput = getIndexForOutput(DONE);

        assertEquals(true, (stringsList.size() - 1) == indexForFinallyOutput, FINALLY_PRINTS_DONE);
        assertEquals(DONE, stringsList.get(indexForFinallyOutput));
    }
}
```
### !end-tests
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: c4981134-ebb3-4b90-a080-e8a9a0bf4fb8
* title: Throw a custom exception
### !question
Create a custom `static` exception class called `IceCreamException` that extends
`Exception`. Then throw a new `IceCreamException` in the `public static void run()` method with the message, "Sorry, no vanilla left".
### !end-question
### !setup
// [include any imports specific to your tests]
import java.io.IOException;

// [to allow student to submit simple statements, wrap the submission
//  using the !setup and !tests sections; example below]
public class SnippetTest {

    // Start Student Code
### !end-setup
### !placeholder
// define IceCreamException class here

public static void run() {
     // throw your IceCreamException here
}
### !end-placeholder

### !tests
// public test class name **must** be `SnippetTest` to match the generated file name

    @Test
    public void someTest() {
        IceCreamException exception = assertThrows(IceCreamException.class, () -> run());
        assertEquals("Sorry, no vanilla left", exception.getMessage());
    }
}
### !end-tests
### !end-challenge

### !challenge
* type: multiple-choice
* id: 31575f28-22ee-477e-b50f-9d8e97af103c
* title: Testing exceptions with try/catch
##### !question
In the following test, what happens if the `registerVoter` method _doesn't_ throw
any exception?

```java
@Test
public void voterRegistrationThrowsVoterRegistrationException() {
    VoterRegistration voterRegistration = new VoterRegistration();
    Voter underAgeVoter = new Voter(17);

    try {
        voterRegistration.registerVoter(underAgeVoter);
    } catch (VoterRegistrationException e) {
        assertEquals("Voter is under the legal voting age", exception.getMessage());
    } catch (Exception e) {
        fail("Expected to throw VoterRegistrationException, but did not.");
    }
}
```
##### !end-question
##### !options
* It fails to compile
* The test passes
* The test fails
* The test throws a `RuntimeException`
##### !end-options
##### !answer
The test passes
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: f20c3307-0dac-4129-bb29-1360931212f0
* title: Handling checked exceptions
##### !question
What are two ways you can handle a checked exception in your code?
##### !end-question
##### !options
* Throw your own custom exception that inherits from `Exception` or define a `throws` clause in your method declaration
* Specify a `throws` clause in the method declaration or using `try` / `catch` in the method body
* Implement the `Throwable` interface or use `try` / `catch` in the method body
* Add a `throws` clause to your method for `Exception` and re-throw the `Exception` in a `RuntimeException`
##### !end-options
##### !answer
Specify a `throws` clause in the method declaration or using `try` / `catch` in the method body
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: f9cb7b20-369c-4c6f-9262-d9f0778ba6aa
* title: Closing the resource
##### !question
When using try with resources we still need to close the resource inside of the `finally` block.
##### !end-question
##### !options
* True
* False
##### !end-options
##### !answer
False
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 2f858020-b504-4e98-af32-3fbe82d46e7b
* title: Invoking a method
##### !question
Each time you invoke a method in Java it creates a new:
##### !end-question
##### !options
* Operation thread
* Disk resource
* Stack frame
* Memory reference call
##### !end-options
##### !answer
Stack frame
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: e64a17dc-910a-405e-8d82-505b218b7a69
* title: Stored primitives
##### !question
Primitives are stored on the:
##### !end-question
##### !options
* Stack
* Heap
* Disk
* CPU
##### !end-options
##### !answer
Stack
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: c8152bc4-9b5a-420b-828c-d0ca428e6e58
* title: Variables pane
##### !question
______ is what appears in the Variables pane while debugging.
##### !end-question
##### !options
* Control flow
* Call stack
* Executing code
* State
##### !end-options
##### !answer
State
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 71677836-d973-4f78-8a4c-1457a4a10010
* title: Creating objects
##### !question
When creating an object:
##### !end-question
##### !options
* it will exist on the stack with a hash code reference added to the heap
* it will exist on the heap with a hash code reference added to the stack
* it will exist in a CPU thread and remain until cleaned up by garbage collection
* it will exist on the hard disk and remain until cleaned up by garbage collection
##### !end-options
##### !answer
it will exist on the heap with a hash code reference added to the stack
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 7cee1aa7-ff5e-46a9-b0e2-7621c6c09faa
* title: The stack trace contains
##### !question
When an error occurs the stack trace will show you:
##### !end-question
##### !options
* each fully qualified class name
* each variable used
* each method called
* each parameter used
* each filename
* each line of code executed
* each library imported
* type of exception
##### !end-options
##### !answer
* each fully qualified class name
* each method called
* each filename
* each line of code executed
* type of exception
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->