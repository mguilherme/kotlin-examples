package guilherme.miguel.demo

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class PigLatinTest : StringSpec({

    "should translate from English to Pig Latin" {
        "The quick brown fox".toPigLatin() shouldBe "Hetay uickqay rownbay oxfay"
    }

    "should translate from Pig Latin to English" {
        "Hetay uickqay rownbay oxfay".toEnglish() shouldBe "The quick brown fox"
    }

})