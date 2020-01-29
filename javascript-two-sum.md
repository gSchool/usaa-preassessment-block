# Two Sum

## Task

Given an array of `number`s, return the `indices` of the two numbers that add up to the `target`.

## Specification

`twoSum(numbers, target)`

### Parameters
`numbers`: `number[]` - a list of possible summands

`target`: `number` - the sum that a pair of elements in the array should equal

### Return Value
`number[]` - an array containing exactly two indices into `numbers` identifying those elements whose sum equals `target`

## Examples

| Inputs | Return Value |
|------------|--------------|
| numbers = [ 3, 5, 0, -4, 8, 11 ], target = 7 | [ 3, 5 ] |
| numbers = [ 2, 2, 12 ], target = 4           | [ 0, 1 ]      |


<!--BEGIN CHALLENGE-->
### !challenge
* type: code-snippet
* language: javascript
* id: 1063536d-7365-49a0-acee-fda9ecdb242a
* title: Two Sum
### !question

## Two Sum
Implement the `twoSum` function.
* assume all inputs will have exactly one solution
* assume the inputs will always be valid (an array of two or more numbers and a number)
* the same element (index) cannot be used twice
* the same number _can_ be used twice as long as it appears twice in the input array
* return the pair of indices as an array

### !end-question
### !placeholder
```js
function twoSum(numbers, target) {
    // your code here
} 
```
### !end-placeholder
### !tests
```js

describe('twoSum', function() {
    it("finds the indices of the pair of numbers that adds up to target", function() {
        expect(twoSum([1, 2, 3], 4)).to.have.lengthOf(2).and.to.include.members([0,2])
        expect(twoSum([4, 5, 1, 8], 6)).to.have.lengthOf(2).and.to.include.members([1,2])
        expect(twoSum([-15, -36, 3, 6, 1, 9], 10)).to.have.lengthOf(2).and.to.include.members([4,5])
        expect(twoSum([-2, -6, 3, 0, 6, 1, -9], -11)).to.have.lengthOf(2).and.to.include.members([0,6])
        expect(twoSum([13, 3, 1, -8, 2, 3], 6)).to.have.lengthOf(2).and.to.include.members([1,5])
    })
})

```
### !end-tests
### !explanation
### !end-explanation
### !end-challenge
<!--END CHALLENGE-->