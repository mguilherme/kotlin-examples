# Kotlin Examples
This project is a small showcase for what can be done in Kotlin with small algorithms.
For each one please check the respective unit test.

## Armstrong
An Armstrong number is the one that equals the sum of its digits raised to the power of the number of digits in that number which is to be checked. To be more clear, let the number be __n__ and the number of digits be __x__. We represent the number as __nx nx-1 nx-2...n3 n2 n1 where n1, n2, n3...nx__ are single digits __0-9__. __n__ is an Armstrong number if

`(n1)^x + (n2)^x + (n3)^x + (nx-1)^x + (nx)^x = n`

153, 371, 9474 and 54748 are few Armstrong numbers.

* `153 = 1^3 + 5^3 + 3^3`
* `371 = 3^3 +7^3 +1^3`
* `9474 = 9^4 + 4^4 +7^4 + 4^4`
* `54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5`

## Fibonacci
In mathematics, the Fibonacci numbers or Fibonacci series or Fibonacci sequence are the numbers in the following integer sequence:
`0 1 1 2 3 5 8 13 21 34 55 89 144 233 377, ...`

By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.

## FizzBuzz
Write some code that prints out the following for a contiguous range of numbers:
the number **'fizz'** for numbers that are multiples of 3, **'buzz'** for numbers that   are multiples of 5, **'fizzbuzz'** for numbers that are multiples of 15, e.g. if I run   the program over a range from 1-20 I should get the following output: `1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz`.

## TDD Password Verifier
Create a Password verifications class called __PasswordVerifier__.

1. Add the following verifications to a master function called `verify()`
    1. password should be larger than 8 chars
    2. password should not be null
    3. password should have one uppercase letter at least
    4. password should have one lowercase letter at least
    5. password should have one number at least

Each one of these should throw an exception with a different message of your choosing.

## Prime numbers
A prime number (or a prime) is a natural number __greater than 1__ that has no positive divisors other than __1 and itself__.

A natural number greater than 1 that is not a prime number is called a composite number.
For example, 5 is prime, as only 1 and 5 divide it, whereas 6 is composite, since it has the divisors 2 and 3 in addition to 1 and 6.

The fundamental theorem of arithmetic establishes the central role of primes in number theory: any integer greater than 1 can be expressed as a product of primes that is unique up to ordering. This theorem requires excluding 1 as a prime.