package guilherme.miguel.demo

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MorseTest : StringSpec({

    "Should translate the given text to Morse code" {
        Morse.textToMorse("SOS SOS") shouldBe "...---.../...---..."
    }

})