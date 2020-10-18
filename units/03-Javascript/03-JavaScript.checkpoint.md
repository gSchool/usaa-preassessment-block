# Javascript Skills Assessment

## Primitive Types

### !challenge

* type: code-snippet
* language: javascript
* id: c8ea5740-07aa-4c06-bd6b-938a581c84a3
* title: Primitive Types Checkpoint A
* standard_uuids: WD-DgkEAAUBDwM

### !question

Assign the correct values to the following variables to build a Madlib! For hints (and the final Madlib), check the test output.

### !end-question

### !placeholder

```js
var madeUpName; // Make sure to include a space. (e.g. 'James Bond')
var personInPositionOfPower; // a string
var nationality; // e.g. 'American'
var countryName;
var preciousItem;
var vehicleName;
var aCelebrity;
var occupationName;
var numberA; // a number
var numberB; // a number
var adverbA;
var adverbB;
var verbBaseForm;
var verbPastTenseA;
var verbPastTenseB;
var verbPastTenseC;
var verbPastTenseD;
var adjectiveA;
var adjectiveB;
var adjectiveC;
var color;
var liquidBeverage;
var travelRelatedNounPlural;
var numberLessThanSix; // a number less than six but greater than 0
var numberBetween1And60; // a number less than 60 but greater than 0
var partOfBody;
var partOfBodyPlural;
```

### !end-placeholder

### !tests

```js
describe('Madlib Game A', function () {
  const name = madeUpName.split(' ')
    .map(el => el[0].toUpperCase() + el.slice(1).toLowerCase())
    .join(' ')
  const pseudonym = madeUpName.split(' ')
    .map(el => el.toLowerCase().split('').reverse().join(''))
    .map(el => el[0].toUpperCase() + el.slice(1).toLowerCase())
    .join(' ')

  console.log(`
    Hello. The name's ${name}.

    I'm ${nationality} at heart, but my ${personInPositionOfPower} has sent me to the Americas before. I noticed ${numberA} things about the Americas. One, they are ambitious. Two, they are ${adverbA} rude. ${numberB}, they are clever enough to ${verbBaseForm} even my tricks and plans. ${adverbB}, I managed to smuggle the ${preciousItem} I needed from the Americas. Now the SISMI has sent me to a desert. Not just any desert.

    The ${countryName} Desert.

    I ${verbPastTenseA} the brick wall as I slid toward the ${adjectiveA} building. My private ${vehicleName} had landed me half a mile away and now I was running into the airport. I noticed a ${color} blur run past at a ${adjectiveB} pace. I ${verbPastTenseB} and quickly turned in my passport and ${travelRelatedNounPlural}. The passport said my name was ${pseudonym}. My disguise.

    Now I was on the plane. To look ${adjectiveC}, I picked up a magazine from the seat pocket in front of me. I pretended to be ${aCelebrity}, and I buried my ${partOfBody} in the pages so that the ${occupationName} next to me would get ${liquidBeverage}. He did, and I chuckled. They fall for it every time.

    I put down the magazine. The ${occupationName} next to me with the bowler hat was asleep. ${liquidBeverage} dripped from the corner of his mouth. I cringed and ${verbPastTenseC} my watch. ${numberLessThanSix} 'til six. I had an hour and ${numberBetween1And60} minutes until my landing. I laid back and closed my ${partOfBodyPlural}. An hour. I chuckled again and ${verbPastTenseD} in my seat. My adventure was already unraveling.`
  )

  it('should appropriately assign values to variables', function () {
    const err = `You must assign values to all of the above variables.`
    const values = [madeUpName, personInPositionOfPower, nationality, countryName, preciousItem, vehicleName, aCelebrity, occupationName, numberA, numberB, adverbA, adverbB, verbBaseForm, verbPastTenseA, verbPastTenseB, verbPastTenseC, verbPastTenseD, adjectiveA, adjectiveB, adjectiveC, color, liquidBeverage, travelRelatedNounPlural, numberLessThanSix, numberBetween1And60, partOfBody, partOfBodyPlural]

    values.forEach(value => expect(typeof value, err).to.not.be.undefined)
  })

  it('should have a complete madeUpName', function () {
    const err = `Your madeUpName must include at least one space.`
    expect(madeUpName.split(' ').length, err).to.be.above(1)
  })

  it('should have numbers where specified', function () {
    const err = `The following variables must be numbers: numberA, numberB, numberLessThanSix, numberBetween1And60`
    const values = [numberA, numberB, numberLessThanSix, numberBetween1And60]

    values.forEach(value => expect(value, err).to.be.a('number'))
  })

  it('numberLessThanSix and numberBetween1And60 should fit their constraints', function () {
    expect(numberLessThanSix, `numberLessThanSix should be less than six but greater than 0`).to.be.above(0)
    expect(numberLessThanSix, `numberLessThanSix should be less than six but greater than 0`).to.be.below(6)

    expect(numberBetween1And60, `numberBetween1And60 should be less than sixty but greater than one`).to.be.above(0)
    expect(numberBetween1And60, `numberBetween1And60 should be less than sixty but greater than one`).to.be.below(60)
  })
})
```

### !end-tests

### !end-challenge

<!-- Question -->

### !challenge

* type: code-snippet
* language: javascript
* id: c310d502-9c87-4e42-a989-686e0cf5f465
* title: Primitive Types Checkpoint B
* standard_uuids: WD-DgkEAAUBDwM

### !question

Assign the variables to values so that the following statements evaluate as described:

```js
// Expression A
(x + y) > z || a == b || ((l || m) && n) // resolves to true

// Expression B
!!n && (x + y + z) && a // resolves to false

// Expression C
m[n].length + n === 1 // resolves to true
```

### !end-question

### !placeholder

```js
var a;
var b;
var l;
var m;
var n;
var x;
var y;
var z;
```

### !end-placeholder

### !tests

```js
describe('Complex Comparisons', function () {
  describe('Expression A', function () {
    it('should resolve to true', function () {
      const actual = ((x + y) > z || a == b || ((l || m) && n))
      expect(actual, 'Expression A is currently false!').to.be.ok
    })

    it('should resolve to false', function () {
      const actual = (!!n && (x + y + z) && a)
      expect(actual, 'Expression B is currently false!').to.not.be.ok
    })

    it('should resolve to true', function () {
      const actual = (m[n].length + n === 1)
      expect(actual, 'Expression C is currently false!').to.be.ok
    })
  })
})
```

### !end-tests

### !end-challenge

## Data Structures

### !challenge

* type: code-snippet
* language: javascript
* id: 68023D2D-9BED-4BA1-965F-C133EA2989FB
* title: Data Structures Checkpoint
* standard_uuids: WD-Aw0MCQwHCgs

### !question

Your friends are ordering some food, so why not use your new found knowledge
of JavaScript datatypes to structure it? Given the foods, people, and orders
arrays, use native array methods to fully populate the orders array.

To start you off, we've shown you how to record Milly is ordering pizza, and ice cream.

*Note* the order property should always be an array, even if the person is ordering one thing.

Add the following orders - in this order - to the orders array

1. George orders sushi
1. Sally orders steak and sushi
1. Ken orders steak and ice cream

### !end-question

### !placeholder

```js
var foods = ['pizza', 'sushi', 'steak', 'ice cream']
var people = ['Milly', 'George', 'Sally', 'Ken']
var orders = []

orders.push({ name: people[0], order: [foods[0], foods[3]] })
```

### !end-placeholder

### !tests

```js
describe('orders array', function() {

  it('has Milly\'s order', function() {
    expect(orders[0]).to.eql({ name: 'Milly', order: ['pizza', 'ice cream'] })
  })

  it('has George\'s order', function() {
    expect(orders[1]).to.eql({ name: 'George', order: ['sushi'] })
  })

  it('has Sally\'s order', function() {
    expect(orders[2]).to.eql({ name: 'Sally', order: ['steak', 'sushi'] })
  })

  it('has Ken\'s order', function() {
    expect(orders[3]).to.eql({ name: 'Ken', order: ['steak', 'ice cream'] })
  })

  it('has all of the correct orders', function() {
    expect(orders).to.eql([
      { name: 'Milly', order: ['pizza', 'ice cream'] },
      { name: 'George', order: ['sushi'] },
      { name: 'Sally', order: ['steak', 'sushi'] },
      { name: 'Ken', order: ['steak', 'ice cream'] }
    ])
  })

})
```

### !end-tests

### !end-challenge

## Iterations and Conditionals

### !challenge

* type: code-snippet
* language: javascript
* id: 52127B66-EEE9-46A3-99B3-6115673CAE36
* title: Iterations & Conditionals A
* standard_uuids: WD-Cg8AAgcEAQo

### !question

Write a program that prints the numbers from 1 to 100.

* For multiples of three print “Fizz” instead of the number
* For the multiples of five print “Buzz” instead of the number
* For numbers which are multiples of both three and five print “FizzBuzz”

When you are finished, set the done variable to true and we will evaluate
your work.

### !end-question

### !placeholder

```js
var done = false
// your code here
```

### !end-placeholder

### !tests

```js
describe('fizzbuzz', function() {

    it("has done set to true", function() {
      expect(done).to.eq(true)
    })

})
```

### !end-tests

### !end-challenge

<!--BEGIN CHALLENGE-->
### !challenge
* type: code-snippet
* language: javascript
* id: 233483f6-980b-4f1f-9cef-78d2ee93c3ea
* title: [A short title]
### !question
Complete all of the steps in the comments of this code:
### !end-question
### !setup
### !end-setup
### !placeholder
```js

function question0 (array) {
  // Write a for loop that will print only even numbers from an array:
  // For example: question0([ 5, 20, 11, 42, 2, 19 ]) >> [ 20, 42, 2 ]
}

function question1 (array) {
  // Write a for loop that doubles each number in the following array. If the
  // resulting number is greater than 12, print it to the console:
  // For example: [ 2, 4, 8, 16 ] would print the numbers 16 and 32
}

function question2 (array) {
  // Write a for loop to iterate over every element in the following array:
  // [ 'Mon', 'Tues', 'Wed', 'Thurs', 'Fri', 'Sat', 'Sun' ]
  //
  // Using a switch statement, do the following:
  // - If the day is on a weekend, print "Yay, it's the weekend!"
  // - If the day is Friday, print "Almost there..."
  // - If the day is Monday, print "I hate Mondays more than Garfield."
  // - Otherwise, print "Everybody's working for the weekend."
}
```
### !end-placeholder
### !tests
```js
const assert = chai.assert;
var sinon = require('mocha-sinon');

function stubFn() { this.sinon.stub(console, 'log') }

describe('Test results', () => {

  beforeEach(stubFn);

  it('question0', () => {
    var input = [ 5, 20, 11, 42, 2, 19 ];
    var expected = [ 20, 42, 2 ];
    question0(input);

    assert.equal(console.log.callCount, expected.length, "console.log not called the correct number of times.");
    expected.forEach(num => assert.isTrue(console.log.calledWith(num)), "Values not properly passed to console.log.");
  })

  it('question1', () => {
    const input = [ 2, 4, 8, 16 ];
    const expected = [ 16, 32 ];
    question1(input)

    assert.equal(console.log.callCount, expected.length, "console.log not called the correct number of times.");
    expected.forEach(num => assert.isTrue(console.log.calledWith(num)), "Values not properly passed to console.log.");
  })

  it('question2', () => {
    const input = [ 'Mon', 'Tues', 'Wed', 'Thurs', 'Fri', 'Sat', 'Sun' ];
    question2(input);

    assert.equal(console.log.callCount, input.length, "console.log not called the correct number of times.");
    assert.isTrue(console.log.calledWith('I hate Mondays more than Garfield.'), "Incorrect value printed.");
    assert.isTrue(console.log.calledWith('Everybody\'s working for the weekend.'), "Incorrect value printed.");
    assert.isTrue(console.log.calledWith('Almost there...'), "Incorrect value printed.");
    assert.isTrue(console.log.calledWith('Yay, it\'s the weekend!'), "Incorrect value printed.");
  })
})

```
### !end-tests
### !explanation
### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

## Functions

### !challenge

* type: code-snippet
* language: javascript
* id: BB49300F-B507-4CC5-B1A4-C8D40283A1E7
* title: Functions Checkpoint A
* standard_uuids: WD-CAYKDAkEDQ4

### !question

Strings are intense if they end in three or more more ! marks.
However, having ! marks anywhere but the end makes for a non-intense
string

Intense Strings
* Hello!!!
* This is an intense string!!!!

Non-intense strings
* Hello
* This is ! not an intense string!!!!
* Also not intense!!

Implement the intenseString function below, where it will return true
when an intense string is passed in, and false otherwise.

### !end-question

### !placeholder
```js
function intenseString(str) {
  // your code here
}
```

### !end-placeholder

### !tests

```js
describe('intenseString', function() {

    it("can detect intense strings", function() {
      expect(intenseString('Hello!!!')).to.equal(true)
      expect(intenseString('Intense strings!!!!!')).to.equal(true)
    })
    it("can detect non-intense strings", function() {
      expect(intenseString('')).to.equal(false)
      expect(intenseString('Intense strings!')).to.equal(false)
      expect(intenseString('Intense strings!!')).to.equal(false)
      expect(intenseString('!Intense! strings!!!')).to.equal(false)
    })

})
```

### !end-tests

### !end-challenge

<!-- Question -->

### !challenge

* type: code-snippet
* language: javascript
* id: 69803030-E0EF-46AF-B064-B2D25B81F83D
* title: Functions Checkpoint Mean
* standard_uuids: WD-CAYKDAkEDQ4

### !question

Implement the functions below for [mean](https://www.khanacademy.org/math/statistics-probability/summarizing-quantitative-data/mean-median-basics/a/mean-median-and-mode-review).

### !end-question

### !placeholder

```js
function mean(numbers) {
  // your code here
}
```

### !end-placeholder

### !tests

```js
describe('mean function', function() {

    it("can compute the mean", function() {
      expect(mean([10, 10, 15, 20, 20])).to.equal(15)
    })

})
```

### !end-tests

### !end-challenge


### !challenge

* type: code-snippet
* language: javascript
* id: 5D8D2429-0052-45A7-8DF2-22CF44A60A51
* title: Functions Checkpoint median
* standard_uuids: WD-CAYKDAkEDQ4

### !question

Implement the functions below for [median](https://www.khanacademy.org/math/statistics-probability/summarizing-quantitative-data/mean-median-basics/a/mean-median-and-mode-review).

### !end-question

### !placeholder

```js
function median(numbers) {
  // your code here
}
```

### !end-placeholder

### !tests

```js
describe('median function', function() {

    it("can compute the median of an odd numbered list", function() {
      expect(median([10, 10, 15, 20, 20])).to.equal(15)
    })
    it("can compute the median of an even numbered list", function() {
      expect(median([10, 10, 15, 20, 20, 21])).to.equal(17.5)
    })

})
```

### !end-tests

### !end-challenge


### !challenge

* type: code-snippet
* language: javascript
* id: 9D977B3B-1C84-4F81-838F-A977D612ED6D
* title: Functions Checkpoint Mode
* standard_uuids: WD-CAYKDAkEDQ4

### !question

Implement the functions below for [mode](https://www.khanacademy.org/math/statistics-probability/summarizing-quantitative-data/mean-median-basics/a/mean-median-and-mode-review).

### !end-question

### !placeholder

```js
function mode(numbers) {
  // your code here
}
```

### !end-placeholder

### !tests

```js
describe('mean, median, mode functions', function() {

    it("can compute the mode", function() {
      expect(mode([10, 10, 15, 20])).to.equal(10)
    })

})
```

### !end-tests

### !end-challenge

## Debugging

### !challenge

* type: multiple-choice
* id: c703daca-2b8b-49cd-b6af-f2efa771fc5f
* title: Syntax Errors

##### !question

Take a look at the following error. Choose the option below that would fix the error.

![image of a syntax error](./images/syntax-error.png)

##### !end-question

##### !options

* `var student = { 'name': 'Summer' 'age': 28 }`
* `var student === { name: 'Summer' age: 28 }`
* `var student = { name: 'Summer', age: 28 }`
* `var student === { name: 'Summer', age: 28 }`

##### !end-options

##### !answer

`var student = { name: 'Summer', age: 28 }`

##### !end-answer

### !end-challenge

### !challenge

* type: code-snippet
* language: javascript
* id: 1a03a7b3-0065-490a-8b74-9f9d36a5247c
* title: Wolf Fencing

### !question

The following code has a couple of bugs! The function will be given a list of products like the following:

```js
var products = [
  { id: 1, name: `Marmot Featherless Hybrid Insulated Jacket - Women's`, price: 9597 },
  { id: 2, name: `Patagonia Micro Puff Vest - Women's`, price: 11940 },
  { id: 3, name: `Mountain Hardwear StretchDown Jacket - Men's`, price: 16497 },
  { id: 4, name: `Patagonia Down Sweater Jacket - Men's`, price: 16030 }
]
```

You should be able to give it an ID and it returns the appropriate object. Unfortunately, it's not working at the moment. Use your debugging skills to fix the function and get the tests to pass.

**Note: If you're having a hard time logging within Learn, feel free to copy the function over to a tool like repl.it.**

### !end-question

### !placeholder

```js
function findById (products, id) {
  var result = null
  for (product of products) {
    if (product.id === id) {
      result === product
    }
  }
}
```

### !end-placeholder

### !tests

```js
describe('findById()', function() {
  it('returns null if the id cannot be found', function () {
    const products = [
      { id: 1, name: `Marmot Featherless Hybrid Insulated Jacket - Women's`, price: 9597 },
      { id: 2, name: `Patagonia Micro Puff Vest - Women's`, price: 11940 },
      { id: 3, name: `Mountain Hardwear StretchDown Jacket - Men's`, price: 16497 },
      { id: 4, name: `Patagonia Down Sweater Jacket - Men's`, price: 16030 }
    ]
    const actual = findById(products, 10)
    expect(actual).to.be.null
  })
  it('returns a product when given a matching id', function () {
    const products = [
      { id: 1, name: `Marmot Featherless Hybrid Insulated Jacket - Women's`, price: 9597 },
      { id: 2, name: `Patagonia Micro Puff Vest - Women's`, price: 11940 },
      { id: 3, name: `Mountain Hardwear StretchDown Jacket - Men's`, price: 16497 },
      { id: 4, name: `Patagonia Down Sweater Jacket - Men's`, price: 16030 }
    ]
    const actual = findById(products, 1)
    const expected = products[0]
    expect(actual).to.deep.equal(expected)
  })
})
```
### !end-tests

### !explanation

### !end-explanation

### !end-challenge

## ES6

### !challenge

* type: code-snippet
* language: javascript
* id: bdb74da8-148d-411c-8417-460b6114b31c
* title: Convert to ES6

### !question

The following code currently works... but it's not using ES6 syntax! Convert the code below so that it still works but uses only ES6 features.

### !end-question

### !placeholder

```js
function petsList (pets) {
  pets = pets || []
  var lis = ''
  for (var i = 0; i < pets.length; i++) {
    var pet = pets[i]
    lis += petListItem(pet.name, pet.kind)
  }

  return '<ul class="list-group">' + lis + '</ul>'
}

function petListItem (petName, petKind) {
  var name = petName || 'Anonymous'
  var kind = petKind || 'Unknown'
  return '<li class="list-group-item">' + name + ' (' + kind + ')</li>'
}
```

### !end-placeholder

### !tests

```js
describe('ES6 Checkpoint', function () {
  describe('petListItem()', function () {
    it('returns an li element for a given pet', function () {
      const pet = { id: 0, name: 'Mickey', kind: 'Mouse' }
      const actual = petListItem(pet.name, pet.kind)
      const expected = `<li class="list-group-item">Mickey (Mouse)</li>`
      expect(actual).to.equal(expected)
    })
    it('defaults the name to "Anonymous" if no name is given', function () {
      const pet = { id: 0, kind: 'Mouse' }
      const actual = petListItem(pet.name, pet.kind)
      const expected = `<li class="list-group-item">Anonymous (Mouse)</li>`
      expect(actual).to.equal(expected)
    })
    it('defaults the kind to "Unknown" if no kind is given', function () {
      const pet = { id: 0, name: 'Mickey' }
      const actual = petListItem(pet.name, pet.kind)
      const expected = `<li class="list-group-item">Mickey (Unknown)</li>`
      expect(actual).to.equal(expected)
    })
    it('defaults the name to "Anonymous" and kind to "Unknown" if no name or kind is entered', function () {
      const actual = petListItem()
      const expected = `<li class="list-group-item">Anonymous (Unknown)</li>`
      expect(actual).to.equal(expected)
    })
  })

  describe('petsList()', function () {
    before(function () {
      this.pets = [
        { id: 1, name: 'Ellie', kind: 'Cat' },
        { id: 2, name: 'Poe', kind: 'Dog' },
        { id: 3, name: 'Rocket', kind: 'Raccoon' },
        { id: 4, name: 'Steve', kind: 'Snake' },
        { id: 5, name: 'Lilly', kind: 'Cat' }
      ]
    })
    it('returns a ul element with the given pets', function () {
      const actual = petsList(this.pets)
      const expected = `<ul class="list-group"><li class="list-group-item">Ellie (Cat)</li><li class="list-group-item">Poe (Dog)</li><li class="list-group-item">Rocket (Raccoon)</li><li class="list-group-item">Steve (Snake)</li><li class="list-group-item">Lilly (Cat)</li></ul>`
      expect(actual).to.equal(expected)
    })
    it('returns an empty ul element if no pets are given', function () {
      const actual = petsList()
      const expected = `<ul class="list-group"></ul>`
      expect(actual).to.equal(expected)
    })
  })

  describe('ES6 Conversion', function () {
    const functions = [ petListItem, petsList ]
    functions.forEach(fn => {
      describe(`${fn.name}()`, function () {
        const fnString = fn.toString()
        it('should not concatenate strings with the + operator', function () {
          const actual = fnString.match(/\'(.*)?\+|\+(.*)?\'/g)
          expect(actual, 'Do not use the + character to concatenate strings').to.be.null
        })

        it('should not include the keyword var', function () {
          const actual = fnString.match(/var/g)
          expect(actual, 'Do not use the var keyword').to.be.null
        })

        it('should not include the keyword function', function () {
          const actual = fnString.match(/function/g)
          expect(actual, 'Do not use the function keyword').to.be.null
        })

        it('should use default parameters and not declare defaults in the function body', function () {
          const actual = fnString.match(/\=.*\|\|/g)
          expect(actual, 'Should use default parameters').to.be.null
        })
      })
    })
  })
})
```

### !end-tests

### !end-challenge
