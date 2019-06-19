package guilherme.miguel.demo

import guilherme.miguel.demo.Fibonacci.fibonacci
import guilherme.miguel.demo.Fibonacci.transform
import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class FibonacciTest : StringSpec({

    "check fibonacci number" {
        forall(
            row(0, 0),
            row(1, 1),
            row(2, 1),
            row(3, 2),
            row(4, 3),
            row(5, 5),
            row(6, 8),
            row(7, 13),
            row(8, 21),
            row(9, 34),
            row(10, 55)
        ) { n, result ->
            fibonacci(n) shouldBe result
        }
    }

    "should print the fibonacci numbers from 0 to 10" {
        transform(0..10) { fibonacci(it) } shouldBe "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55"
    }

})