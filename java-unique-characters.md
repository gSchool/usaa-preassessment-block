# Java Programming

### !instructor
A simple exercise to see how well a candidate can quickly come up with a readable and efficient solution; candidates will most likely solve it using a single loop.
### !end-instructor

## Task

Write a program to determine if a string contains all unique characters.
Return `true` if it does and `false` otherwise.

The string may contain any of the 128 ASCII characters.

## Specification

`Challenge.hasUniqueChars(str)`

### Parameters
`str`: `String` - The string that may or may not contain all unique characters

### Return Value
`boolean` - `true` if all characters in the string are unique

## Examples

| Input String | Return Value |
|--------------|--------------|
| "abcdefg"    | `true`       |
| "abbcdefg"   | `false`      |

### !challenge
* type: custom-snippet
* language: java
* id: 8fb697dd-90a1-49d1-8bb7-ced94128ab5f
* title: All Characters are Unique
* docker_directory_path: /unique-characters-snippet

### !question

Implement the `hasUniqueChars` method.

### !end-question

### !placeholder

```java
class Challenge {
    public static boolean hasUniqueChars(String str) {
        
    }
}
```
### !end-placeholder

### !rubric
* should return `false` when all are *not* unique
* should return `true` when all are unique
### !end-rubric

### !end-challenge

<!--END CHALLENGE-->
