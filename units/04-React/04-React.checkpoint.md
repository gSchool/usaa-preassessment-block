# # React Skills Assessment

## Components

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 55ce4b25-5ace-4fe3-96f8-368eb9f559e5
* title: What does JSX do?
##### !question
JSX allows you to:
##### !end-question
##### !options
* Write smaller components
* Write HTML in JavaScript
* Reference other libraries is a simplified format
##### !end-options
##### !answer
Write smaller components
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

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
* type: short-answer
* id: a6768c32-2f17-41c9-8f92-b33c28dccbc7
* title: ReactElement
##### !question

How many ReactElement objects are created by this code?

```javascript
const isHealthy = false;
let message;

if (isHealthy) {
  message = <p>Yuck!</p>;
}
else {
  message = <p>Delicious!</p>;
}

const element = <div>
  {message}
</div>;
```

##### !end-question
##### !answer
2
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
* type: checkbox
* id: d9d6a72b-f6c4-4fe1-a590-76032adcd8c4
* title: Create React components
##### !question
Select the steps that are required to create a React component
##### !end-question
##### !options
* Within that React element reference the other component by wrapping it in self-closing HTML tags
* Define a function that returns a single React element
* Use JSX to define the component
* Export the function with export default
* Import React
##### !end-options
##### !answer
* Define a function that returns a single React element
* Export the function with export default
* Import React
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: b75a1f5c-6dac-488d-902b-647eab17681e
* title: Symbol
##### !question
What is the `?` symbol called?
##### !end-question
##### !options
* Unary operator
* If/Else operator
* Ternary operator
##### !end-options
##### !answer
Ternary operator
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
* type: multiple-choice
* id: 20ef127d-d4cc-4b1e-97ff-c759d8703eee
* title: Why map?
##### !question
Why do we use the map method in React?
##### !end-question
##### !options
* To filter data before using it
* To ensure the proper constraints to the data
* To convert data arrays to JSX arrays
##### !end-options
##### !answer
To convert data arrays to JSX arrays
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
* id: 049cf0ef-c6aa-4769-9e76-9462e712d22c
* title: Equivalent components?
##### !question
These components are equivalent.

```javascript
const MessageComponent = ({ message }) => (
  <div>The message is { message }</div>
)
```

```javascript
import React from 'react'

class ColorComponent extends React.Component {
  render() {
    return (
      <div>The message is { this.props.message }</div>
    )
  }

}
```

##### !end-question
##### !options
* True
* False
##### !end-options
##### !answer
True
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 0e7e7966-7070-4eab-a799-cd6fd38a606f
* title: Connecting state and presentation
##### !question
__________ refers to the process of establishing a connection between a user interface's state and presentation.
##### !end-question
##### !answer
/(data binding)/i
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
* id: 595b1a8f-fb7b-490f-8a58-82eefc38ddbc
* title: What is state?
##### !question
State in a React component is:
##### !end-question
##### !options
* only available in function components
* an object
* ignored by the render method
* used by React classes
* never altered directly
* how you pass data from parent components to child components
* a functional pattern
##### !end-options
##### !answer
* an object
* used by React classes
* never altered directly
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
* type: checkbox
* id: 50d34a56-7b03-4985-9d8b-e84e05c1b8db
* title: Common steps for wiring up a form
##### !question
What are the steps commonly used to wire up a form in a react component?
##### !end-question
##### !options
* Split the form controls into their own separate child components
* Leverage the Redux library to handle all state management of the form
* Add change handlers to the form controls that set internal state of the component
* Add a change handler to the form that binds directly to the state object
* Add handler to the form submit button that uses the state stored in the component
##### !end-options
##### !answer
* Add change handlers to the form controls that set internal state of the component
* Add handler to the form submit button that uses the state stored in the component
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

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: d34fb2cc-c4d0-4533-837e-923b0fdaae33
* title: setState()
##### !question
Calling `setState()` causes React to re-render the component.
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
* id: 586ed452-4032-492f-a2ee-cba8d9723925
* title: Component that manages state
##### !question
A component that manages persisted state is often referred to as:
##### !end-question
##### !options
* A persistence component
* A parent component
* A stateless component
* A stateful component
##### !end-options
##### !answer
* A stateful component
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 01505f97-96f5-47b5-a568-31d5e6184e5e
* title: Calculations vs. State
##### !question
As a general rule:
##### !end-question
##### !options
* If you can store it in state, then compute it first and store the result
* If it originated as state, then use state again
* If you can compute it, then compute it

##### !end-options
##### !answer
If you can compute it, then compute it
##### !end-answer
### !end-challenge

<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 0aacd3d1-1197-4068-a280-d005b4412c49
* title: When to use state
##### !question
As a general rule:
##### !end-question
##### !options
* Only duplicate state when there are performance issues
* Never duplicate state
* Creating state is cheap and should be done whenever possible
##### !end-options
##### !answer
Only duplicate state when there are performance issues
##### !end-answer
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
* type: multiple-choice
* id: 7ff3b08e-aa0e-47e6-a1e6-09d1f504c3b0
* title: Add a spinner
##### !question
To use a spinner during an async call when the page already contains data, first set the fetching flag to true, then make the async fetch call, and finally:
##### !end-question
##### !options
* when the fetching call is complete you set the fetching flag back to false
* you use the `componentDidMount` method to update the state
* use the then method from the return promise of fetch to call the render method on the component
##### !end-options
##### !answer
when the fetching call is complete you set the fetching flag back to false
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
* id: a1f4c873-83ab-45a2-9717-5a42edbf3631
* title: Different domains require
##### !question
When the client application exists on a different domain from the server side API you must:
##### !end-question
##### !options
* use fully qualified domain names to reference the server side API
* use environment variable for all API calls
* use a proxy server to make your server side API calls
##### !end-options
##### !answer
use fully qualified domain names to reference the server side API
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 83b03cbb-9d54-4433-8cc1-42c765555350
* title: React environment variable prefix
##### !question
Environment variables that are used in React applications must be prefixed with:
##### !end-question
##### !options
* REACT_APP_
* reactApp
* ReactApp
* _React_App_
##### !end-options
##### !answer
REACT_APP_
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

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 2e16e3e3-58b1-427c-baad-b47791d92951
* title: React making direct call?
##### !question
When the proxy is enabled in a React application, the React application will make a direct call to the server side API.
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

## Redux

### !challenge
* type: multiple-choice
* id: f97f7eab-4c10-47be-b045-cef6f987d718
* title: Reducer Review 1
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
* id: a9476049-93d5-4b65-8544-e80acce546e0
* title: Reducer Review 2
##### !question
When the app is initially started, which case in the reducer function's switch statement will run?
##### !end-question
##### !options
* `default`
* `initialState`
* `state`
* `action`
##### !end-options
##### !answer
`default`
##### !end-answer
### !end-challenge

### !challenge
* type: multiple-choice
* id: 4ebcc152-7c15-41d2-8c1c-1d0a61183c59
* title: React-Redux Review 2
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
##### !explanation
Correct! The `Provider` component does NOT filter store data.
##### !end-explanation
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: e18f28a6-9807-4ee0-88d0-4e37049bbd95
* title: A store accepts
##### !question
A store can accept:
##### !end-question
##### !options
* The reducer
* Initial state
* JSX
* Thunk middleware
* React component
##### !end-options
##### !answer
* The reducer
* Initial state
* Thunk middleware
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

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
* id: dc007e8b-6f45-4a6c-aa4b-d1a19bbcd3b0
* title: Example #1
##### !question
The code below is an example of:

```js
import thunkMiddleware from 'redux-thunk'
import { createStore, applyMiddleware } from 'redux'
import rootReducer from './reducers'
import logger from 'redux-logger'

const store = createStore(
  rootReducer,
  applyMiddleware(
    thunkMiddleware,
    logger,
  )
)

export default store
```
##### !end-question
##### !options
* action creator
* redux store
* reducer
* mapStateToProps
* mapDispatchToProps
##### !end-options
##### !answer
redux store
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

### !challenge
* type: multiple-choice
* id: f873dee5-65c5-4feb-8c04-7c0a733cffc9
* title: Which router package is incorrect?
##### !question
In the list of router packages below, which is not one of the three main router packages
##### !end-question
##### !options

* `react-router-native`
* `react-router`
* `react-router-mobile`
* `react-router-dom`

##### !end-options
##### !answer
`react-router-mobile`
##### !end-answer
##### !explanation
Correct! There is no package called `react-router-mobile`
##### !end-explanation
### !end-challenge

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

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: da1ba557-7bdc-4bd5-9e87-bc8e55fe3c10
* title: URL with a hash
##### !question
When loading a URL that contains a hash, the server will:
##### !end-question
##### !options
* Gets the full path including what comes after the hash
* Sometimes get the same path depending on what comes after the hash
* Always get the same path regardless of what comes after the hash
* Interprets the path differently based on a query string
##### !end-options
##### !answer
Always get the same path regardless of what comes after the hash
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

### !challenge
* type: multiple-choice
* id: 3e190c96-ad82-435f-8558-52c018fa0e78
* title: BrowserRouter vs. HashRouter
##### !question
True or false: `HashRouter` is the best option if you have a server that will handle dynamic requests.
##### !end-question
##### !options

* true
* false

##### !end-options
##### !answer
false
##### !end-answer
##### !explanation
That's correct. `HashRouter` should be primarily used for static website that only serves files it knows about. `BrowserRouter` would be the better option in this case.
##### !end-explanation
### !end-challenge

### !challenge
* type: multiple-choice
* id: 7f1ec1d7-f1f2-4551-96bd-b4ab06b089f9
* title: Where does React Router get the hash portion of the url from?
##### !question
For the `HashRouter` to work, it needs access to the hash portion of the url. Where does that come from?
##### !end-question
##### !options

* `window.location.hashes`
* `window.history.hash`
* `window.match.hash`
* `window.location.hash`
* `window.history.hashes`

##### !end-options
##### !answer
`window.location.hash`
##### !end-answer
##### !explanation
Correct! `window.location.hash` is where the `HashRouter` gets the hash portion of the url from.
##### !end-explanation
### !end-challenge

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
##### !explanation
That's correct! None of the above. For any of those to render, the url would have to match the path exactly.
##### !end-explanation
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
##### !explanation
Correct! The `Switch` component will only render one `Route` component at a time.
##### !end-explanation
### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: c9fc0096-706f-469d-b75f-09c86e9f8bfe
* title: Navigating routes
##### !question
What are the ways that React-Router can navigate routes?
##### !end-question
##### !options
* Query parameters
* Hash references
* Link components
* Using history methods
##### !end-options
##### !answer
* Link components
* Using history methods
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: e4adfcd7-224d-44f7-80f4-877f33ec66be
* title: Redirect method
##### !question
Which method on the history API will redirect the user to another route?
##### !end-question
##### !answer
/(push)
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