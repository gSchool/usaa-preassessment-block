# Java Skills Assessment

This assessment is to help determine which courses need to be taken and not an evaluation of your job performance.  If you do not know the answer to the question please do not try to research the answer, just leave it blank.  Guessing on a question or researching the answer could skew the results that help us identify what materials to cover.

## Introduction to Java

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
/build[.]gradle/
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
* id: 1c708ee3-5b1e-44cd-8403-b24e1d3fed13
* title: Calling static fields
* topics: Java
##### !question
### Question

Given the following code, how would you get the value of the static field `BAR`?

```java
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
