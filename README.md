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