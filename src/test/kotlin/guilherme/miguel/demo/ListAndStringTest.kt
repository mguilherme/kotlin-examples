package guilherme.miguel.demo

import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class ListAndStringTest : StringSpec({

    "Should retrieve a list of its digits" {
        2342.toIntList() shouldContainExactly listOf(2, 3, 4, 2)
    }

    "Should translate from English to Pig Latin" {
        "The quick brown fox".toPigLatin() shouldBe "Hetay uickqay rownbay oxfay"
    }

    "Should translate from Pig Latin to English" {
        "Hetay uickqay rownbay oxfay".toEnglish() shouldBe "The quick brown fox"
    }

})