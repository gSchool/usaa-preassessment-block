# # React Skills Assessment

## Components

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: e0abc528-13ee-4847-9428-f2d028b7749b
* title: Adding classes
##### !question
When writing a JSX tag, use ______ instead of class to add the class attribute.
##### !end-question
##### !answer
/className
##### !end-answer
##### !placeholder
[Type your answer here]
##### !end-placeholder
##### !explanation
Remember, JavaScript is a case sensitive language so className works but classname or ClassName don't.
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 6e342de6-f736-4226-8dcb-c8b43b74dec9
* title: What is a functional component?
##### !question
A functional component is a component that:
##### !end-question
##### !options
* is anonymous
* requires state and props parameters
* uses lifecycle hooks for event performing actions
* returns a single React element
##### !end-options
##### !answer
returns a single React element
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 2df78a2c-67d0-4fd2-8d7a-87a3fb5965de
* title: Use of Props
##### !question
What are props used for?
##### !end-question
##### !options
* Embedding components
* Keeping data
* Setting attributes
* Passing data
##### !end-options
##### !answer
Passing data
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 3e6ffcac-002e-470a-aa46-057a3199780a
* title: Destructuring
##### !question
Which of these is properly using destructuring?

A:
```javascript
const PrintMessage = ({props}) => (
  <span>Hello {message}.</span>
);
```

B:
```javascript
const PrintMessage = ({message}) => (
  <span>Hello {message}.</span>
);
```

C:
```javascript
const PrintMessage = {(message)} => (
  <span>Hello {message}.</span>
);
```

D:
```javascript
const PrintMessage = ({props.message}) => (
  <span>Hello {message}.</span>
);
```

##### !end-question
##### !options
* A
* B
* C
* D
##### !end-options
##### !answer
B
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: aca3f160-7585-402d-a3bb-865bd19c04f5
* title: Data type from map
##### !question
What data type is returned from the map method?
##### !end-question
##### !options
* List
* Array
* Object
* String
##### !end-options
##### !answer
Array
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: cdd8dd36-ce52-4a03-9740-bc3ea130142d
* title: Characteristics of a Class component
##### !question
Which characteristics are attributable to Class components?
##### !end-question
##### !options
* A JavaScript class that extends React.Component
* Uses react hooks
* Has a render method
* Returns a single React Element
* Uses the arrow syntax
##### !end-options
##### !answer
* A JavaScript class that extends React.Component
* Has a render method
* Returns a single React Element
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 904fc82c-87c5-48b2-88d1-196a520e2eec
* title: Handling events
##### !question
Which of these is valid code that handles an event?

A:
```javascript
class App extends Component {
    handleClick() {
        console.log("Hello World!");
    }

    render() {
        return (
            <div>Hello World!</div>
            <button onClick={handleClick()}>Log Hello World</button>
        );
    }
}
```

B:
```javascript
class App extends Component {
    handleClick() {
        console.log("Hello World!");
    }

    render() {
        return (
            <div>Hello World!</div>
            <button onClick={this.handleClick}>Log Hello World</button>
        );
    }
}
```

C:
```javascript
class App extends Component {
    handleClick() {
        console.log("Hello World!");
    }

    render() {
        return (
            <div>Hello World!</div>
            <button onClick={handleClick}>Log Hello World</button>
        );
    }
}
```

D:
```javascript
class App extends Component {
    handleClick() {
        console.log("Hello World!");
    }

    render() {
        return (
            <div>Hello World!</div>
            <button onClick={this.handleClick()}>Log Hello World</button>
        );
    }
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
B
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: b6cb92ea-6626-4c02-9113-5fe14e2b04ae
* title: Updating state
##### !question
Given the code below, which line of code would change the message property of state to "Hello Galvanize!" in the position indicated.

```javascript
class App extends Component {
    state = { message: "Hello World!" };

    handleClick() {
        console.log(this.state.message);
    }

    changeMessage = () => {
        // What code goes here?
    }

    render() {
        return (
            <div>Hello World!</div>
            <button onClick={this.changeMessage}>Change Message</button>
            <button onClick={this.handleClick}>Log Hello World</button>
        );
    }
}
```
##### !end-question
##### !options
* setState(prevState => ({message: "Hello Galvanize!"}));
* this.setState(prevState => ({state.message: "Hello Galvanize!"}));
* setState(prevState => ({state.message: "Hello Galvanize!"}));
* this.setState(prevState => ({message: "Hello Galvanize!"}));
##### !end-options
##### !answer
this.setState(prevState => ({message: "Hello Galvanize!"}));
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: caba2414-779b-4a68-a3da-b43d76a2db33
* title: Default submit behavior
##### !question
The default behavior when submitting a form is:
##### !end-question
##### !options
* Send a POST request with the form values as query parameters
* Send a GET request with the form values as query parameters
* Send a POST request with the form values in the body
##### !end-options
##### !answer
* Send a GET request with the form values as query parameters
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

## Fetching Data
<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 5d52a2ba-c67e-4faf-b7af-334715b80f8b
* title: Fill in the blank
##### !question
React has component ________ methods that are called at different parts of the React component life time.  One of which is called the `componentDidMount` method.
##### !end-question
##### !answer
/(life.*cycle)/i
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: d4336d5b-cbdd-4690-8ec6-ddd415a27ea2
* title: When is it called?
##### !question
When will React call the  `componentDidMount` method:
##### !end-question
##### !options
* Just before the component mounts
* Just after the component mounts
* Just after the user engages with the component
* First, before any other methods are called
##### !end-options
##### !answer
Just after the component mounts
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: d2c544b7-7a08-4af3-b466-fbd3ded422e5
* title: Async
##### !question
The async keyword requires the ________ keyword to be used in the method.
##### !end-question
##### !options
* sync
* fetch
* then
* await
##### !end-options
##### !answer
await
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 57109fa7-2b75-4cff-985f-86830895ddd1
* title: Make HTTP requests
##### !question
We use the _______ method to request data from an HTTP source.
##### !end-question
##### !answer
/(fetch)/i
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

## Deployment

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 221e99f9-a2ae-41e1-9e62-c3630826ecfb
* title: Building a project
##### !question
Select the items that will be created when you build your React application:
##### !end-question
##### !options
* compress zip file
* HTML file
* minified javascript file
* fonts needed by the app
* images needed by the app
##### !end-options
##### !answer
* HTML file
* minified javascript file
* fonts needed by the app
* images needed by the app
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 5a093d38-3551-4230-a696-f68f3d3aa70d
* title: Deploying to different domains
##### !question
When deploying a React client side application to a different domain than the server side app:
##### !end-question
##### !options
* You need environment specific configuration variables when building the client side application
* You must keep the client side application in a separate git repository from the server side application
* You must create separate CI pipelines for the server side and client side applications
* You must specify the full domain location of the API in the fetch call
* The server must have Cross Origin Resource Sharing configured
##### !end-options
##### !answer
* You need environment specific configuration variables when building the client side application
* You must specify the full domain location of the API in the fetch call
* The server must have Cross Origin Resource Sharing configured
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: a5449fe7-3a99-4465-98d2-b7e9f25245f7
* title: React proxy server
##### !question
If the React application is on the same domain as the server side API and is integrated with a proxy server, when a user makes a request to a react application that doesn't have a route for handling the request:
##### !end-question
##### !options
* React will return a 404 error
* The Node server will return a 500 error
* Node will pass the request to the API server
##### !end-options
##### !answer
Node will pass the request to the API server
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

## Redux

### !challenge
* type: multiple-choice
* id: f97f7eab-4c10-47be-b045-cef6f987d718
* title: Reducer Review
##### !question
What are the two parameters (not necessarily in order) that the reducer function will accept?
##### !end-question
##### !options
* `state` and `action creator`
* `action` and `reducer`
* `action` and `state`
* `state` and `reducer`
##### !end-options
##### !answer
`action` and `state`
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 4ebcc152-7c15-41d2-8c1c-1d0a61183c59
* title: React-Redux Review
##### !question
What does `Provider` not do?
##### !end-question
##### !options
* Provides the store for components to connect to
* Provides the `connect` method for components to us
* Filters the content to only what the application needs
* Contain a new instance of the store
##### !end-options
##### !answer
Filters the content to only what the application needs
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 1b1417db-8485-43ec-a5dd-91f8b34da5db
* title: Connect function
##### !question
The `connect()` function takes the parameters of:
##### !end-question
##### !options
* mapStateToProps
* mapDispatchToProps
* connecting component
* parent component
##### !end-options
##### !answer
* mapStateToProps
* mapDispatchToProps
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 0b9d88f9-e003-4004-a9fc-7ab2fe1f2cdd
* title: a new state object
##### !question
Each case statement of the reducer should return:
##### !end-question
##### !options
* an action creator
* a higher order component
* a new state object
##### !end-options
##### !answer
a new state object
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 8d83bb9e-79b4-475e-a439-36a9cd3e1d54
* title: Code example
##### !question
The code below is an example of:

```javascript
export const DOMAIN_THING_REQUEST_STARTED = 'DOMAIN_THING_REQUEST_STARTED'
export const DOMAIN_THING_REQUEST_SUCCESS = 'DOMAIN_THING_REQUEST_SUCCESS'
export const getThings = () => {
  return async (dispatch) => {
    dispatch({ type: DOMAIN_THING_REQUEST_STARTED })
    const response = await request(`/api/things`)
    const json = await response.json()
    dispatch({
      type: DOMAIN_THING_REQUEST_SUCCESS,
      someExtraData: json,
    })
  }
}
```
##### !end-question
##### !options
* mapDispatchToProps
* mapStateToProps
* an action creator
* a reducer
##### !end-options
##### !answer
an action creator
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 656181f4-dfe8-4023-8e6d-8a0ea89e6a52
* title: Example #2
##### !question
The code below is an example of:

```javascript
function items(state = { all: [] }, action) {
  switch (action.type) {
    case ITEMS_RECEIVED:
      return {
        ...state,
        all: action.items
      }
    case ITEM_CREATED:
      return {
        ...state,
        all: [
          action.item,
          ...state.all,
        ]
      }
    default:
      return state
  }
}
```
##### !end-question
##### !options
* a reducer
* a store
* mapDispatchToProps
* mapStateToProps
##### !end-options
##### !answer
a reducer
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 4a44f964-803b-4509-a920-76825423e41b
* title: Application state
##### !question
Redux stores all of the application state in one place, called the _________.
##### !end-question
##### !answer
/(store)/i
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

## React router

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 3d698edc-8678-48b1-8791-4a33bd6b15ca
* title: HTTP requests
##### !question
When making an HTTP request to a server the following things happen:
##### !end-question
##### !options
* The server parses the request
* The client parses the request
* The server requests info from the client
* The server reads the path
* The server creates a response
* The client creates a response
##### !end-options
##### !answer
* The server parses the request
* The server reads the path
* The server creates a response
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 7320a7ff-e55c-4643-9a0e-b96058774f9a
* title: Which route will not render?
##### !question
If you were to navigate to `/example/1/things`, which of these routes would render?
##### !end-question
##### !options

* `<Route exact path="/example" component={Example} />`
* `<Route exact path="/example/1" component={Example} />`
* `<Route exact path="/example/2" component={Example}  />`
* None of the above

##### !end-options
##### !answer
None of the above
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 27d819b6-3cd5-4836-9029-20ebe1d9f8d0
* title: `Switch`
##### !question
True or False: The `Switch` statement can render more than one `Route` component at a time
##### !end-question
##### !options
* True
* False
##### !end-options
##### !answer
False
##### !end-answer
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: d4e4f923-35d7-423a-8aa7-804e1a150ddb
* title: Wildcard route
##### !question
A wildcard route must have a:
##### !end-question
##### !options
* Higher precedent than all other routes
* Lower precedent than all other routes
* A static page to render
* A redirect response to the correct page
##### !end-options
##### !answer
Lower precedent than all other routes
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->
