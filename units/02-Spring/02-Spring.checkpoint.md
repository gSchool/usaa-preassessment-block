# Spring Skills Assessment

This assessment is to help determine which courses need to be taken and not an evaluation of your job performance.  If you do not know the answer to the question please do not try to research the answer, just leave it blank.  Guessing on a question or researching the answer could skew the results that help us identify what materials to cover.

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 80960193-df86-43b1-b76e-99171d0f2862
* title: WebMvcTest annotation
* topics: Spring
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
* id: 05c92ddd-b6ea-48a4-bdce-582da0ece694
* title: Endpoint Question
* topics: Spring
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
* title: Endpoints Question
##### !question
Write the correct `@*Mapping` annotation that would handle both of the following HTTP requests:

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
[Type your answer here]
##### !end-placeholder
##### !answer
/\@RequestMapping\(.*\"\/survey\/questions\"\)/
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 8edce170-a1d0-4a7f-9a42-ccc2720098cd
* title: Custom class parameter
* topics: Spring
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
* title: HTTP Annotations
* topics: Spring
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

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 5fd41069-6ced-4932-b548-84b429c8835f
* title: Using jsonPath
* topics: Spring
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
* type: checkbox
* id: 00ed2e82-87a8-494e-882c-709c31db8dc6
* title: JSON represents
* topics: Spring, JSON
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
* topics: Spring, JSON
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
* topics: Spring, JSON
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
* type: checkbox
* id: 749ce5bc-5b20-4c4b-82cc-9536089a292a
* title: Accessing JSON data
* topics: Spring
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
* type: multiple-choice
* id: 4d676fda-7e9d-4e0f-be84-f9e75bce922e
* title: Which error?
* topics: Spring
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

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 2e38ac7a-8cfa-4c80-9f9a-e25887259610
* title: JPA meaning
* topics: Spring
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
* topics: Spring
##### !question
What is the property in the `application.properties` file that specifies the connection string to the database?
##### !end-question
##### !answer
/spring\.datasource\.url/
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
* id: 3eb4412a-ce3e-401c-8320-8ae002ccecc6
* title: Primary key field
* topics: Spring
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
* id: 1e8006fd-e5ec-42d8-a02c-844a0e34dda0
* title: JPA repositories
* topics: Spring
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
* topics: Spring
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
* type: short-answer
* id: a178142a-71a7-4bad-b70d-60c0e2030d0d
* title: Updating records with JPA
* topics: Spring
##### !question
The ________ function on a JPA repository will update a record on the database.
##### !end-question
##### !answer
/save/
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 914ee522-9d16-49bf-9a1c-763fc4de2b6f
* title: Example code
* topics: Spring
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
* title: Example code
* topics: Spring
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
* topics: Spring
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
* id: 0805de50-d77e-454f-a9f7-07a279c499cb
* title: @Bean annotation instances
* topics: Spring
##### !question
By default every instance created by the `@Bean` annotation is a(n) _________ instance.
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
* type: checkbox
* id: af8f7748-cf71-41eb-80c4-e36f81e170f1
* title: Rest Templates are responsible for
* topics: Spring
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
