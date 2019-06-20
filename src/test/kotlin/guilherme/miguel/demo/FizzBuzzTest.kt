package guilherme.miguel.demo

import guilherme.miguel.demo.FizzBuzz.fizzbuzz
import guilherme.miguel.demo.FizzBuzz.transform
import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class FizzBuzzTest : StringSpec({

    "should retrieve fizzbuzz numbers" {
        forall(
            row(1, "1"),
            row(3, "fizz"),
            row(5, "buzz"),
            row(15, "fizzbuzz")

        ) { n, expectedResult ->
            fizzbuzz(n) shouldBe expectedResult
        }
    }

    "should print the fizzbuzz numbers from 1 to 20" {
        transform(1..20)
        { fizzbuzz(it) } shouldBe "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"
    }

})