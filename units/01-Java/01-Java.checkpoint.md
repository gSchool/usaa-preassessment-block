# Java Skills Assessment

This assessment is to help determine which courses need to be taken and not an evaluation of your job performance.  If you do not know the answer to the question please do not try to research the answer, just leave it blank.  Guessing on a question or researching the answer could skew the results that help us identify what materials to cover.

## Introduction to Java

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: fe037ef6-536c-4e33-937a-9c0ec418390c
* title: Where does your code go?
* topics: Java
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
* topics: Java
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
* topics: Gradle
##### !question
What is the command for checking the current version of Gradle installed?
##### !end-question
##### !answer
/(gradle.*-v|gradle.*-version)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 7583b560-0bbe-4a40-8738-e8fce0dd6da3
* title: Compilation Question
* topics: Java
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
* title: Compilation Question
* topics: Java
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
* topics: Java
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
* topics: Gradle
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
* topics: Java
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
* topics: Java
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
* id: 73a825b4-eae6-4f42-a479-783e7d2f50a0
* title: Using a for loop
* topics: Java
### !question
Using a `for` loop, print the _even_ integers from 2 through 6 to the console.
### !end-question
### !setup
```java
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

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
* topics: Java
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

## Classes

### !challenge
* type: code-snippet
* language: java
* id: a8a17d79-de84-47ca-b587-bb715d95a53b
* title: Creating a Class
* topics: Java
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
* topics: Java
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
* topics: Java
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

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 53fc679c-2f4e-4a84-9438-5dbf72e65a9b
* title: RGR process
* topics: TDD
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
* topics: TDD
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

### !challenge
* type: multiple-choice
* id: 79b223ca-cd8e-4b84-b576-3666c0849be2
* title: Casting from a specific to a general type
* topics: Java
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
* topics: Java
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
* topics: Java
### !question
For the given method signature, write an implementation that takes an array of strings and returns an `ArrayList` of those strings sorted in alphabetical order.
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
* topics: Java
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
* topics: Algorithms
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
* topics: Java
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

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: f3f6e660-4d32-4ccd-92fb-bc579059e166
* title: Lists
* topics: Java
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
* topics: Java
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

### !challenge
* type: code-snippet
* language: java
* id: 5be20142-cf79-4a72-8c08-c56bcb16515c
* title: Using a lambda
* topics: Java
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
* topics: Java
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
* topics: Java
### !question
```java
public class Browser {
    private URI currentPage;
    private ArrayList<String> history;
    private LocalDateTime visitedAt;
    private HashMap<String, Integer> visitCount;
    private boolean on;
}
```

Add all of the import statements required for the code above to work into the input below.
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
* topics: Java
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
* topics: Java
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
* id: 7079fab2-ce4c-4bde-ab1c-b113b1ae1860
* title: Implementing an interface
* topics: Java
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
* topics: Java
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
* topics: Java
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

## Exceptions

### !challenge
* type: multiple-choice
* id: 89c11a1c-3697-4bbb-b88f-3e0c186cf356
* title: Catch block
* topics: Java
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

**A**:
```text
Done
Something blew up!
```

**B**:
```text
Done
Exception in thread "main" java.lang.ArithmeticException: / by zero
  at com.galvanize.exceptions.Application.main(Application.java:9)
foo: 0
```

**C**:
```
Done
foo: 2
```

**D**:
```
Done
Exception in thread "main" java.lang.ArithmeticException: / by zero
  at com.galvanize.exceptions.Application.main(Application.java:9)
```
##### !end-question
##### !options
* A
* B
* C
* D
##### !end-options
##### !answer
D
##### !end-answer
### !end-challenge

### !challenge
* type: code-snippet
* language: java
* id: c4981134-ebb3-4b90-a080-e8a9a0bf4fb8
* title: Throw a custom exception
* topics: Java
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
* topics: Java
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

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: f9cb7b20-369c-4c6f-9262-d9f0778ba6aa
* title: Closing the resource
* topics: Java
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
* topics: Java
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
* topics: Java
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
* id: 71677836-d973-4f78-8a4c-1457a4a10010
* title: Creating objects
* topics: Java
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
