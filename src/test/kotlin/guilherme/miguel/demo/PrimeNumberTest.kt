package guilherme.miguel.demo

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class PrimeNumberTest : StringSpec({

    "check if number is prime" {
        forall(
            row(0, false),
            row(1, false),
            row(2, true),
            row(3, true),
            row(4, false),
            row(5, true),
            row(6, false),
            row(7, true),
            row(8, false),
            row(9, false),
            row(10, false),
            row(11, true)

        ) { n, result ->
            n.isPrime() shouldBe result
        }
    }

})