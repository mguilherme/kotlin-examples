package guilherme.miguel.demo

import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.specs.StringSpec

class ListAndStringTest : StringSpec({

    "Should retrieve a list of its digits" {
        2342.toIntList() shouldContainExactly listOf(2, 3, 4, 2)
    }

})