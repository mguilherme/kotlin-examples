package guilherme.miguel.demo

import guilherme.miguel.demo.PasswordVerifier.verify
import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class PasswordVerifierTest : StringSpec({

    "should throw an IllegalArgumentException" {
        forall(
            row(null, "password should not be null"),
            row("ab", "password should be larger than 8 chars"),
            row("aaaaaaaaaa", "password should have one uppercase letter at least"),
            row("AAAAAAAAAA", "password should have one lowercase letter at least"),
            row("aaaaaAAAAA", "password should have one number at least")

        ) { str, msg ->
            val exception = shouldThrow<IllegalArgumentException> { verify(str) }

            exception.message shouldBe msg
        }
    }

})