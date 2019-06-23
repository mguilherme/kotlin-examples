package guilherme.miguel.demo

import guilherme.miguel.demo.Morse.morseToText
import guilherme.miguel.demo.Morse.textToMorse
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MorseTest : StringSpec({

    "Should translate the given text to Morse code" {
        textToMorse("SOS SOS") shouldBe "... --- ...  ... --- ..."
    }

    "Should translate the given Morse code to Test" {
        morseToText("... --- ...  ... --- ...") shouldBe "sos sos"
    }

})