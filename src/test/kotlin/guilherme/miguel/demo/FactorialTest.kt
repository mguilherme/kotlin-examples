package guilherme.miguel.demo

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class FactorialTest : StringSpec({

    "should retrieve the factorial for a number" {
        forall(
            row(4, 24),
            row(7, 5040),
            row(10, 3628800)
        ) { n, expectedResult ->
            n.factorial() shouldBe expectedResult
        }
    }

})
