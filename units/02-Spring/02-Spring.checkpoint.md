# Spring Skills Assessment

## Intro to Spring

### !challenge
* type: multiple-choice
* id: 2242e778-b2d5-43f1-9726-fb5c542ec521
* title: Spring vs Spring Boot 1
##### !question
Which one would allow you to have your app auto-restart during development?
##### !end-question
##### !options
* Spring
* Spring Boot
##### !end-options
##### !answer
Spring Boot
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 1167b4a3-c2a5-4bdc-8d7a-796688b33e52
* title: Spring vs Spring Boot 3

##### !question
Which one provides the IoC container?
##### !end-question

##### !options
* Spring
* Spring Boot
##### !end-options

##### !answer
Spring
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 4e2b0fd0-18dc-45a7-ba29-4272b0901de2
* title: Steps for getting started
##### !question
The steps to create, start, and verify a Spring Boot application is working are:
##### !end-question
##### !options
* Build and run the project
* Check your app with curl
* Visit http://start.spring.io/
* Install IntelliJ
* Create an account with spring initializr
* Select the dependencies you need on spring initializr
* Click "Generate Project" on spring initializr
* Unzip the project and cd into it
##### !end-options
##### !answer
* Visit http://start.spring.io/
* Select the dependencies you need on spring initializr
* Click "Generate Project" on spring initializr
* Unzip the project and cd into it
* Build and run the project
* Check your app with curl
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

## Request and Response

### !challenge
* type: short-answer
* id: be3750fb-34d7-4ef1-a770-263a16495013
* title: Hash
##### !question
What is the path of this URL?

```
https://example.com/app/#/orders/2
```
##### !end-question
##### !answer
/^\/app\/$/
##### !end-answer
##### !placeholder
Enter the path
##### !end-placeholder
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 550b76f3-77db-4aa1-b5b2-8d2ca09af53b
* title: Steps for running spring mvc tests
##### !question
Which steps must you take to set up a test class for running spring mvc tests?
##### !end-question
##### !options
* Add `@RunWith` annotation to the class
* Add `@WebMvcTest` annotation to the class
* Add `@MockMvc` annotation to the class
* Add `@RunWith` annotation to each method in the class
* Add `MockMvc` filed with `@Autowired` annotation
##### !end-options
##### !answer
* Add `@RunWith` annotation to the class
* Add `@WebMvcTest` annotation to the class
* Add `MockMvc` filed with `@Autowired` annotation
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 80960193-df86-43b1-b76e-99171d0f2862
* title: WebMvcTest annotation
##### !question
The `@WebMvcTest` annotation tells Spring:
##### !end-question
##### !options
* include the full IoC container context when loading
* load the minimal configuration to test the controller
* build the entire MVC application to run a proper integration test
##### !end-options
##### !answer
load the minimal configuration to test the controller
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 9f9f9ed5-3999-4a22-8124-d9cf4c358b82
* title: Endpoint Question #1
##### !question
Given the following code:

```java
@RestController
public class QuestionsController {
    @PostMapping("/question")
    public String getQuestion() {
        return "Nailed it!";
    }
}
```

And the following HTTP request:

```
GET /question HTTP/1.1
host: example.com
```

What will the response be?
##### !end-question
##### !options
- A 200 OK with "Nailed it!" in the body
- A 404 Not Found
- A 405 Method Not Allowed
- A 500 Server Error
##### !end-options
##### !answer
A 405 Method Not Allowed
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 05c92ddd-b6ea-48a4-bdce-582da0ece694
* title: Endpoint Question #3
##### !question
Given the following code:

```java
// imports here

public class QuestionsController {
    @GetMapping("/about/team")
    public String myMethod() {
        return "Nailed it!";
    }
}
```

And the following HTTP request:

```
GET /about/team HTTP/1.1
host: example.com
```

What will the response be?
##### !end-question
##### !options
- A 200 OK with "Nailed it!" in the body
- A 404 Not Found
- A 405 Method Not Allowed
- A 500 Server Error
##### !end-options
##### !answer
A 404 Not Found
##### !end-answer
### !end-challenge

### !challenge
* type: short-answer
* id: 476172e9-2071-4f6e-b25f-2a03c636b46f
* title: Endpoints Question #6
##### !question
Write the `@*Mapping` annotation that would properly handle the following HTTP requests:

```
GET /survey/questions HTTP/1.1
host: example.com
```

```
POST /survey/questions HTTP/1.1
host: example.com
```
##### !end-question
##### !placeholder
@GetMapping("/foo")
##### !end-placeholder
##### !answer
@RequestMapping("/survey/questions")
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 1d150a3e-dc88-47c2-aef4-dd73420bf822
* title: Querystring Question #1
##### !question
## Question #1
Which technique would be the most appropriate for the following scenario?

You are implementing an endpoint where users can send in arbitrary values, and you need to store them all.

For example, your endpoint would need to accept the following:

- `/your-endpoint?method=cash&price=12.05`
- `/your-endpoint?item=CD&artist=Sondheim`
##### !end-question
##### !options
- Defining a method with individual `@RequestParam` parameters
- Defining a method with a `Map<String,String>` parameter
- Defining a method with a custom object parameter
##### !end-options
##### !answer
Defining a method with a `Map<String,String>` parameter
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 2780f64f-d708-4529-adce-839ac64be274
* title: GET request
##### !question
If the following GET request is being made to the API:

```text
http://localhost:3000/blog/121/post/82
```

What is the correct string literal that should go inside the `@GetMapping()` method in the code below to receive that request?

```java
@GetMapping(/* What goes here? */)
public String getPostForBlog(@PathVariable int blogId, @PathVariable int postId) {
    return String.format("blogId is %d; postId is %d", blogId, postId);
}
```
##### !end-question
##### !answer
/(/blog/{blogId}/post/{postId})
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: b2300ba3-b99a-4ab0-8891-3cd529139522
* title: Testing form data
##### !question
When testing form data, make sure to:
##### !end-question
##### !options
* use `post` instead of `get`
* use `put` instead of `get`
* add the correct `browserType`
* add the correct `contentType`
* add `vars`
* add `param`s
##### !end-options
##### !answer
* use `post` instead of `get`
* add the correct `contentType`
* add `param`s
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: c892eb59-6da8-47cd-95ae-f0e13a36995e
* title: Access request body
##### !question
What are the different ways you can access the request body?
##### !end-question
##### !options
* As a String
* As an array
* As a HashMap of form params
* As a custom class
##### !end-options
##### !answer
* As a String
* As a HashMap of form params
* As a custom class
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 8edce170-a1d0-4a7f-9a42-ccc2720098cd
* title: Custom class parameter
##### !question
Which annotation is used to pass the body of a request to a custom class parameter?
##### !end-question
##### !options
* `@ParamBody`
* `@BodyParam`
* `@RequestBody`
* `@RequestParam`
##### !end-options
##### !answer
`@RequestBody`
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 03d768c6-5b7d-4f8e-a90a-eadadb5529dd
* title: HTTP Annotations 2
##### !question
Which annotation would you use to access the part of the HTTP request indicated by `^^^`?

```
GET /people/32/addresses HTTP/1.1
Host: example.com
Accept: application/json
        ^^^^^^^^^^^^^^^^
Content-Type: application/json
```
##### !end-question
##### !options
* @RequestParam
* @RequestBody
* @PathVariable
* @RequestCookie
* @RequestHeader
##### !end-options
##### !answer
@RequestHeader
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: ef3f0775-d57d-4b4e-a978-0c9cf030ec62
* title: HTTP Annotations 3
##### !question
Which annotation would you use to access the part of the HTTP request indicated by `^^^`?

```
GET /people/32/addresses?filter=active HTTP/1.1
                                ^^^^^^
Host: example.com
Accept: application/json
Content-Type: application/json
```

##### !end-question
##### !options
* @RequestParam
* @RequestBody
* @PathVariable
* @RequestCookie
* @RequestHeader
##### !end-options
##### !answer
@RequestParam
##### !end-answer
### !end-challenge

## JSON Endpoints

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 5fd41069-6ced-4932-b548-84b429c8835f
* title: Using jsonPath
##### !question
Which of these is a valid test that uses jsonPath?

**A**:
```java
@Test
public void testDeveloper() throws Exception {
    this.mvc.perform(
            get("/json/simple-object")
                    .accept(MediaType.APPLICATION_JSON_UTF8)
                    .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.jobTitle", "Developer"));
}
```

**B**:
```java
@Test
public void testDeveloper() throws Exception {
    this.mvc.perform(
            get("/json/simple-object")
                    .accept(MediaType.APPLICATION_JSON_UTF8)
                    .contentType(MediaType.APPLICATION_JSON_UTF8))
                    .jsonPath("$.jobTitle", "Developer")
            .andExpect(status().isOk());
}
```

**C**:
```java
@Test
public void testDeveloper() throws Exception {
    String response = this.jsonPath("$.jobTitle", is("Developer"));
    this.mvc.perform(
            get("/json/simple-object")
                    .accept(MediaType.APPLICATION_JSON_UTF8)
                    .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());
}
```

**D**:
```java
@Test
public void testDeveloper() throws Exception {
    this.mvc.perform(
            get("/json/simple-object")
                    .accept(MediaType.APPLICATION_JSON_UTF8)
                    .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.jobTitle", is("Developer")));
}
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
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 0e5c4381-61cf-48ee-b0ea-124266f24ae0
* title: Automatic serialization?
##### !question
If you use the `@RequestMapping` annotation on your Controller class, all you need to do is return an object from your route method, and Spring will automatically serialize it to JSON for you.
##### !end-question
##### !options
* True
* False
##### !end-options
##### !answer
True
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 7bfbf4ae-7361-4966-b0c2-31c0a8242587
* title: JSON and class property names
##### !question
JSON property names must match their class property name counterparts in order to be converted.
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
* type: short-answer
* id: d015d3b5-5aaa-4064-bef7-6e801bfe4cc4
* title: What does JSON stand for?
##### !question
JSON stands for:
##### !end-question
##### !answer
/(java.*script.*object.*notation)/i
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 00ed2e82-87a8-494e-882c-709c31db8dc6
* title: JSON represents
##### !question
JSON can represent:
##### !end-question
##### !options
* Objects
* Arrays
* Numbers
* Strings
* Booleans
* Nulls
##### !end-options
##### !answer
* Objects
* Arrays
* Numbers
* Strings
* Booleans
* Nulls
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 6887760f-e3ca-4daa-aa89-48154aa535a3
* title: Separating properties from values
##### !question
Which symbol(s) are used to separate properties from values in JSON?
##### !end-question
##### !options
* ;
* :
* ,
* .
* []
* {}
* =
##### !end-options
##### !answer
:
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 681fac04-09b6-45fc-a57b-66ced874b044
* title: Defining arrays
##### !question
Which symbol(s) are used to define arrays in JSON?
##### !end-question
##### !options
* ;
* :
* ,
* .
* []
* {}
* =
##### !end-options
##### !answer
[]
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: a2f2ad40-779f-4fad-baec-6ed1b858bf35
* title: Overriding property names
##### !question
What is the annotation used to override the default name of a property when converting a Java object to JSON?
##### !end-question
##### !answer
/(JsonProperty)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 4d2339fd-96c0-4497-b6df-77fd62a474f2
* title: Fill the mock object body
##### !question
Use the ________ method to set the content type of a mock request.
##### !end-question
##### !answer
/(contentType)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 749ce5bc-5b20-4c4b-82cc-9536089a292a
* title: Accessing JSON data
##### !question
What steps are necessary to access JSON data in a REST Controller?
##### !end-question
##### !options
* Import the JSONDeserializer class
* Define a parameter with a custom class type
* Define a string parameter for the JSON
* Annotate the parameter with `@RequestBody`
##### !end-options
##### !answer
* Define a parameter with a custom class type
* Annotate the parameter with `@RequestBody`
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: bb00589b-675a-4b8c-9023-0f185b01a6be
* title: Immutable classes
##### !question
Immutable classes have:
##### !end-question
##### !options
* No setters
* No getters
* Only private access modifiers
* Only default access modifiers
* Only final fields
##### !end-options
##### !answer
* No setters
* Only final fields
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 70d9d311-f5c7-462d-bb77-40bdd3626770
* title: Immutable with Jackson
##### !question
For Jackson to work with immutable objects you must:
##### !end-question
##### !options
* Annotate constructor with `@JsonCreator`
* Annotate each field with `@JsonProperty`
* Annotate constructor parameters with `@JsonProperty`
* Annotate the class with `@JsonCreator`
##### !end-options
##### !answer
* Annotate constructor with `@JsonCreator`
* Annotate constructor parameters with `@JsonProperty`
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 377ff93a-f81e-45c5-9c7d-9dd4b165e5fd
* title: Annotation for views
##### !question
In your controller methods, you can indicate which view you'd like to use with the ________ annotation.
##### !end-question
##### !answer
/(JsonView)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 4d676fda-7e9d-4e0f-be84-f9e75bce922e
* title: Which error?
##### !question
If the `Content-Type` header is not set correctly you may get a:
##### !end-question
##### !options
* 400 status error
* 404 status error
* 408 status error
* 415 status error
##### !end-options
##### !answer
415 status error
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

## CRUD APIs

### !challenge
* type: short-answer
* id: 033a86e1-938e-4285-8a46-dab7eb042b3f
* title: MySQL Connect CL
##### !question
How would you connect to a database named "husky" with a user named "collie" from the command line?

Assume there is no password required.
##### !end-question
##### !answer
/mysql -u *collie husky/
##### !end-answer
##### !placeholder
mysql...
##### !end-placeholder
### !end-challenge

### !challenge
* type: short-answer
* id: cfdbd336-a31f-441b-99a0-90afed85d40d
* title: MySQL REPL Describe
##### !question
From within the `mysql` REPL, how would you list all columns from the `books` table?

> NOTE: don't forget the semi-colon
##### !end-question
##### !answer
/desc(ribe)? books;/
##### !end-answer
##### !placeholder
##### !end-placeholder
### !end-challenge

### !challenge
* type: short-answer
* id: 51e6c898-af69-4266-8831-4f7ac942f4af
* title: MySQL File
##### !question
How would you run a file named `init.sql` as root on a database named `inventory`?
##### !end-question
##### !answer
/mysql -u *root inventory \< init\.sql/
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 2e38ac7a-8cfa-4c80-9f9a-e25887259610
* title: JPA meaning
##### !question
JPA stands for:
##### !end-question
##### !options
* Java Persistence API
* Java Program API
* Java Performance API
##### !end-options
##### !answer
Java Persistence API
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 07326d1d-2c75-4e20-b148-f73eb7c4595b
* title: Connection string property
##### !question
What is the property in the `application.properties` file that specifies the connection string to the database?
##### !end-question
##### !answer
/(spring.datasource.url)
##### !end-answer
##### !placeholder
[Placeholder text]
##### !end-placeholder
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 3eb4412a-ce3e-401c-8320-8ae002ccecc6
* title: Primary key field
##### !question
Which annotations should be added to the primary key field of an entity?
##### !end-question
##### !options
* @PrimaryKey
* @Id
* @PK
* @GeneratedValue
* @AutoIncrement
* @GUID
##### !end-options
##### !answer
* @Id
* @GeneratedValue
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: d85798d8-f8c2-4f63-9c5a-3a3042531dce
* title: Add dependency to build.gradle
##### !question
Given the following artifact information, which line should be added to the dependencies section of the `build.gradle` file to add this artifact as a dependency?

```json
"happy-hour" : {
  "groupId" : "org.galvanize.cloud",
  "artifactId" : "wine-glass",
  "scope" : "compile",
  "bom" : "cloud-bom"
}
```
##### !end-question
##### !options
* compile('org.galvanize.cloud:wine-glass')
* compile('wine-glass:org.galvanize.cloud')
* compile('org.galvanize.cloud:cloud-bom')
* cloud-bom('org.galvanize.cloud:wine-glass')
##### !end-options
##### !answer
compile('org.galvanize.cloud:wine-glass')
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 8831adb8-0dad-4884-9680-7dcf91f40e27
* title: Config Order
##### !question
### Who wins?
Given the following `application.properties` file:

```
service.apiToken=123
```

And your app has been run with:

```
SPRING_APPLICATION_JSON='{"service":{"apiToken":"abc"}}' ./gradlew bootRun
```

What will the value of the `service.apiToken` be in the app?
##### !end-question
##### !options
* 123
* abc
* 123abc
* abc123
##### !end-options
##### !answer
abc
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 1e8006fd-e5ec-42d8-a02c-844a0e34dda0
* title: JPA repositories
##### !question
JPA repositories are:
##### !end-question
##### !options
* POJO's
* Interfaces
* Enums
* Abstract classes
* Static classes
##### !end-options
##### !answer
Interfaces
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 9c33a7c3-48f2-4a1b-a2db-504cebfb6b36
* title: Second JPA repository type parameter
##### !question
The second type parameter of a JPA repository is for:
##### !end-question
##### !options
* setting the configuration class
* setting the controller class
* setting the entity class
* setting the primary key type
##### !end-options
##### !answer
setting the primary key type
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 0486af4d-a5d1-4666-8a61-8f9bd2fe16bb
* title: JPA repository discovery
##### !question
When Spring data JPA discovers an interface that extends CrudRepository it will:
##### !end-question
##### !options
* Throws an exception if there is no Java class that implements the interface
* Triggers a warning if there is no Java class that implements the interface
* Puts an instantiated class that implements the interface into an application context
* Generates the SQL statements required to update the SQL server with the repository schema
##### !end-options
##### !answer
Puts an instantiated class that implements the interface into an application context
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 2ba12145-b309-4b2e-af40-0bfdc1d587a4
* title: DDL-AUTO Prod

##### !question
### Which is best?

Which ddl-auto setting is most appropriate for production?
##### !end-question

##### !options
* create
* create-drop
* validate
* update
##### !end-options

##### !answer
validate
##### !end-answer

##### !explanation
If "none" were an option, that could work too
##### !end-explanation
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: a178142a-71a7-4bad-b70d-60c0e2030d0d
* title: Updating records with JPA
##### !question
The ________ function on a JPA repository will update a record on the database.
##### !end-question
##### !answer
/(save)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 85ae4120-c299-4f8d-811d-1f92a3056423
* title: Executing native queries
##### !question
The ________ annotation enables JPA to execute native queries when the simpler queries aren't enough.
##### !end-question
##### !answer
/(Query)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 5901c4fa-d80b-4d7b-825d-0d1d6f75a192
* title: Return list of addresses based on city
##### !question
Assume there is a table called Addresses with the following field names:

* Id
* PersonId
* Address1
* Address2
* City
* State
* Zip

What should the method name be on this repository to return a list of addresses with a given city from the Address table.

```java
public interface AddressRepository extends CrudRepository<Address,Long> {
    List<Address> ___________(String city);  // Fill in the blank method name
}
```
##### !end-question
##### !answer
/(findByCity)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

## IoC and Configuration

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 914ee522-9d16-49bf-9a1c-763fc4de2b6f
* title: Example code #1
##### !question
The code below is an example of:

```java
@RestController
public class CommentController {

    @PostMapping("/comment")
    public Comment createComment(Comment comment) {
        BlogService blogServ = new BlogService();

        blogServ.appendComment(
            comment.getBlogId(),
            comment.getPostId(),
            comment.getCommentPoster(),
            comment.getSubject(),
            comment.getBody()
        );

        return blogServ.getCommentWithId(comment);
    }
}
```
##### !end-question
##### !options
* Property injection
* Constructor injection
* Inversion of control container
* Separation of concerns
* Hard coded dependency
##### !end-options
##### !answer
Hard coded dependency
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: d2d2ea7a-2313-4adf-ab1b-95d829d184d7
* title: Example code #2
##### !question
The code below is an example of:

```java
@RestController
public class CommentController {

    private final BlogService blogServ;

    public CommentController(BlogService blogServ) {
        this.blogServ = blogServ;
    }

    @PostMapping("/comment")
    public Comment createComment(Comment comment) {

        this.blogServ.appendComment(
            comment.getBlogId(),
            comment.getPostId(),
            comment.getCommentPoster(),
            comment.getSubject(),
            comment.getBody()
        );

        return this.blogServ.getCommentWithId(comment);
    }
}
```
##### !end-question
##### !options
* Property injection
* Constructor injection
* Inversion of control container
* Separation of concerns
* Hard coded dependency
##### !end-options
##### !answer
Constructor injection
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 8f479d3f-91df-40b3-8ec7-f3c725d1ff6b
* title: Add to application context
##### !question
Select the annotations that cause an instance of the class to be added to the application context.
##### !end-question
##### !options
* `@Service`
* `@Inject`
* `@Autowired`
* `@RestController`
* `@Component`
* `@AppContext`
* `@Resource`
##### !end-options
##### !answer
* `@Service`
* `@RestController`
* `@Component`
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: eb79b0e2-745c-4514-9390-88ef9671ea18
* title: @Autowired fields
##### !question
Fields that are `@Autowired` must be public in order to get their dependency.
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
* id: 789d7bcc-4b58-4ea6-80cb-9a57bbfe7640
* title: @Autowired final fields
##### !question
`@Autowired` fields can be marked as final.
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
* id: 0805de50-d77e-454f-a9f7-07a279c499cb
* title: @Bean annotation instances
##### !question
By default every instance created by the `@Bean` annotation is a(n) instance:
##### !end-question
##### !options
* Transient
* Singleton
* Scoped
* Autowired
##### !end-options
##### !answer
Singleton
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: e772dd0c-4537-4ad1-8b0f-ec8a1a12e8d1
* title: Mocking a bean inside a test
##### !question
In order to isolate a test to just a controller, you can use the `@WebMvcTest` annotation on the test class and _________ to mock an autowired service class.
##### !end-question
##### !answer
/(MockBean)
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 5661f1b3-ce7a-4f06-b3d1-9eee1fbfddbf
* title: Annotation for gathering configuration settings
##### !question
Add the ________ annotation to a class to fill it with configuration settings?
##### !end-question
##### !answer
/(ConfigurationProperties)
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: a2b25a9d-f8c8-4109-b095-a13cb797aeec
* title: Spring actuator information route
##### !question
With Spring actuator installed, which route must you navigate to in order to view information on memory, processors, uptime, and other metrics about your app and system?
##### !end-question
##### !answer
/(metrics)/i
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

## RestTemplates

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: af8f7748-cf71-41eb-80c4-e36f81e170f1
* title: Rest Templates are responsible for
##### !question
Rest Templates are responsible for:
##### !end-question
##### !options
* Sending requests to web servers
* Converting Java object to JSON
* Managing service injections
* Logging all http traffic
* Parsing responses from web servers
##### !end-options
##### !answer
* Sending requests to web servers
* Parsing responses from web servers
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 17962ada-23ee-43df-823e-c868886ae642
* title: Body of a response
##### !question
Use the ________ method to get the contents of the body of a ResponseEntity.
##### !end-question
##### !options
* `body()`
* `content()`
* `getBody()`
* `getContent()`
##### !end-options
##### !answer
`getBody()`
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 23c2ead4-89ba-4589-a1ce-043fde05b4aa
* title: Using getForObject
##### !question
```java
return this.restTemplate.getForObject("https://api.github.com/zen", String.class);
```

The code above will:
##### !end-question
##### !options
* Make an HTTP request with the verb POST
* Make an HTTP request with the verb GET
* Take the response body as a String and return it
* Return the status code of the POST request
##### !end-options
##### !answer
* Make an HTTP request with the verb GET
* Take the response body as a String and return it
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 3dd433a6-bfc1-41b1-b65e-5a4014150fbd
* title: Deserializing to a generic
##### !question
In order to deserialize a response to a generic type:
##### !end-question
##### !options
* Use a custom type that implements the List interface
* Use the ParameterizedTypeReference type
* Use the ParseListResponse type
* Use a custom type that implements the ParsedListResponse interface
##### !end-options
##### !answer
Use the ParameterizedTypeReference type
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 75d56b12-a4dc-42d7-8106-426238eaca55
* title: Application.properties file
##### !question
```java
@ConfigurationProperties("blogService")
public class BlogServiceConfig {
    private String url;

    public String getURL() { return this.url; }
    public void setURL(String url) { this.url = url; }
}
```

Assuming the code above, what is the name of the property that must be added to the application.properties file to set the URL value?
##### !end-question
##### !answer
/(blogService\.url)
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 62ac5626-9a3d-475a-ad28-6074b3b9f8b4
* title: Service class dependency
##### !question
The service class depends on a ____________ object in order to make requests to an API.
##### !end-question
##### !options
* RestTemplate
* Controller
* Repository
* Configuration
##### !end-options
##### !answer
RestTemplate
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 6d44121b-bb12-4db9-8066-f2377a1042e4
* title: Why mock?
##### !question
What are the reasons for mocking the API service?
##### !end-question
##### !options
* Test cannot rely on the data being received from an outside API
* Test could cause rate limits to be reached
* Tests will be slower due to network limitations
* Difficult to test edge cases
##### !end-options
##### !answer
* Test cannot rely on the data being received from an outside API
* Test could cause rate limits to be reached
* Tests will be slower due to network limitations
* Difficult to test edge cases
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->