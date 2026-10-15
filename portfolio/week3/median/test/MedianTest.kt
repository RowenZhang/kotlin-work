// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here

    //This test checks whether the function correctly returns the only element when the list contains one value.
    "Median when size=1" {
        median(listOf(5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    //This test checks whether the function correctly calculates the average of two elements.
    "Median when size=2" {
        median(listOf(3.0f, 8.0f)) shouldBe (5.5f plusOrMinus tolerance)
    }

    //This test checks whether the function sorts an unsorted list and returns the middle value.
    "Median when size=3" {
        median(listOf(9.0f, 2.0f, 5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    //This test checks whether the function sorts an unsorted list and correctly calculates the average of the two middle values.
    "Median when size=4" {
        median(listOf(8.0f, 3.0f, 7.0f, 2.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }
})
