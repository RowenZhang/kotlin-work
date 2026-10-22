// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    // Write your unit tests here

    "Can create a Money" {
        val m = Money(1, 50)

        m.euros shouldBe 1
        m.cents shouldBe 50
    }

    "Can create a different Money" {
        val m = Money(2, 99)

        m.euros shouldBe 2
        m.cents shouldBe 99
    }

    "Cannot create Money with negative euros" {
        shouldThrow<IllegalArgumentException> {
            Money(-1, 50)
        }
    }

    "Cannot create Money with negative cents" {
        shouldThrow<IllegalArgumentException> {
            Money(1, -1)
        }
    }

    "Cannot create Money with too many cents" {
        shouldThrow<IllegalArgumentException> {
            Money(1, 100)
        }
    }

    "Can add euros" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50)
        Money(1, 50) + Money(2, 0) shouldBe Money(3, 50)
    }

    "Can add cents" {
        Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
    }

    "Can carry cents into euros" {
        Money(2, 99) + Money(0, 1) shouldBe Money(3, 0)
    }
})
