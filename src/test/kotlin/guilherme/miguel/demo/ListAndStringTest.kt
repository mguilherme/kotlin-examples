package guilherme.miguel.demo

import guilherme.miguel.demo.ListAndString.createFrame
import guilherme.miguel.demo.ListAndString.createIntList
import io.kotlintest.data.forall
import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class ListAndStringTest : StringSpec({

    "should retrieve a list of its digits" {
        createIntList(2342) shouldContainExactly listOf(2, 3, 4, 2)
    }

    "check if a string is palindrome" {
        forall(
            row("wow", true),
            row("radar", true),
            row("level", true),
            row("refer", true),
            row("dog", false),
            row("table", false)
        ) { str, expectedResult ->
            str.isPalindrome() shouldBe expectedResult
        }
    }

    val expectedFrame = """
        *********
        * Hello *
        * World *
        * in    *
        * a     *
        * frame *
        *********
        """.trimIndent()

    "should retrieve a list of strings in a rectangular frame" {
        createFrame(listOf("Hello", "World", "in", "a", "frame")) shouldBe expectedFrame
    }

})