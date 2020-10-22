# Spring Skills Assessment

This assessment is to help determine which courses need to be taken and not an evaluation of your job performance.  If you do not know the answer to the question please do not try to research the answer, just leave it blank.  Guessing on a question or researching the answer could skew the results that help us identify what materials to cover.

## Request and Response

### !challenge
* type: short-answer
* id: be3750fb-34d7-4ef1-a770-263a16495013
* title: Hash
* topics: Spring
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
* topics: Spring
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

### !challenge
* type: multiple-choice
* id: 1d150a3e-dc88-47c2-aef4-dd73420bf822
* title: Querystring Question
* topics: Spring
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
* topics: Spring
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
/\/blog\/{blogId}\/post\/{postId}/
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

## JSON Endpoints

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
* type: checkbox
* id: bb00589b-675a-4b8c-9023-0f185b01a6be
* title: Immutable classes
* topics: Java
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
* topics: Spring
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

## CRUD APIs

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
* id: d85798d8-f8c2-4f63-9c5a-3a3042531dce
* title: Add dependency to build.gradle
* topics: Gradle
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
* type: multiple-choice
* id: 0486af4d-a5d1-4666-8a61-8f9bd2fe16bb
* title: JPA repository discovery
* topics: Spring
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
* topics: Spring
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
### !end-challenge

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
* type: short-answer
* id: 5901c4fa-d80b-4d7b-825d-0d1d6f75a192
* title: Return list of addresses based on city
* topics: Spring
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
/findByCity/
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
* type: short-answer
* id: e772dd0c-4537-4ad1-8b0f-ec8a1a12e8d1
* title: Mocking a bean inside a test
* topics: Spring
##### !question
In order to isolate a test to just a controller, you can use the `@WebMvcTest` annotation on the test class and _________ to mock an autowired service class.
##### !end-question
##### !answer
/^(@)?MockBean/
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 5661f1b3-ce7a-4f06-b3d1-9eee1fbfddbf
* title: Annotation for gathering configuration settings
* topics: Spring
##### !question
Add the ________ annotation to a class to fill it with configuration settings?
##### !end-question
##### !answer
/ConfigurationProperties/
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: a2b25a9d-f8c8-4109-b095-a13cb797aeec
* title: Spring actuator information route
* topics: Spring
##### !question
With Spring actuator installed, which route must you navigate to in order to view information on memory, processors, uptime, and other metrics about your app and system?
##### !end-question
##### !answer
/metrics/i
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

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 75d56b12-a4dc-42d7-8106-426238eaca55
* title: Application.properties file
* topics: Spring
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
/blogService\.url/
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->
