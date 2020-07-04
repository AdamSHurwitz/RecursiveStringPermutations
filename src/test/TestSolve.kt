package test

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestSolve {
    @Test
    @Order(1)
    fun `First test`() {
        printAssert(18, 18)
        assertThat(18).isEqualTo(18)
    }

    @Nested
    inner class `First nested test` {
        @Test
        @Order(2)
        fun `First inner test`() {
            printAssert(18, 18)
            assertThat(18).isEqualTo(18)
        }
        @Test
        @Order(3)
        fun `Second inner test`() {
            printAssert(18, 18)
            assertThat(18).isEqualTo(18)
        }
    }
}