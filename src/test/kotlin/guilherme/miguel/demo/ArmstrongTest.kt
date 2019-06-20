package guilherme.miguel.demo

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class ArmstrongTest : StringSpec({

    "check if number is armstrong" {
        forall(
            row(153, true),
            row(371, true),
            row(9474, true),
            row(54748, true),
            row(100, false)
        ) { n, expectedResult ->
            n.isArmstrong() shouldBe expectedResult
        }
    }

})
