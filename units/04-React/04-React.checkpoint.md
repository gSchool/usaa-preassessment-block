# # React Skills Assessment

This assessment is to help determine which courses need to be taken and not an evaluation of your job performance.  If you do not know the answer to the question please do not try to research the answer, just leave it blank.  Guessing on a question or researching the answer could skew the results that help us identify what materials to cover.

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 6e342de6-f736-4226-8dcb-c8b43b74dec9
* title: What is a functional component?
* topics: React
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
* id: 3e6ffcac-002e-470a-aa46-057a3199780a
* title: Destructuring
* topics: React, JavaScript
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
* topics: React, JavaScript
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
* id: 904fc82c-87c5-48b2-88d1-196a520e2eec
* title: Handling events
* topics: React
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
* topics: React
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
* id: d4336d5b-cbdd-4690-8ec6-ddd415a27ea2
* title: When is it called?
* topics: React
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
* topics: JavaScript
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
* topics: React, JavaScript
##### !question
We use the javascript _______ method to request data from an HTTP source.
##### !end-question
##### !answer
/fetch/
##### !end-answer
##### !placeholder
[Type your answer here...]
##### !end-placeholder
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: a5449fe7-3a99-4465-98d2-b7e9f25245f7
* title: React proxy server
* topics: React
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
* id: 0b9d88f9-e003-4004-a9fc-7ab2fe1f2cdd
* title: a new state object
* topics: React, Redux
##### !question
Each case statement of a redux reducer should return:
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
* topics: React, Redux
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
* title: Example
* topics: React, Redux
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

### !challenge
* type: multiple-choice
* id: 27d819b6-3cd5-4836-9029-20ebe1d9f8d0
* title: `Switch`
* topics: React
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
* topics: React
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
