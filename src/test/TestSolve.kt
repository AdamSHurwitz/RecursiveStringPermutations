package test

import allPerm
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestSolve {

    private fun testCases() = Stream.of(
            TestCase("abc", setOf("abc", "bac", "bca", "acb", "cab"))
    )

    @ParameterizedTest
    @MethodSource("testCases")
    fun `TestParam`(test: TestCase) {
        printAssert(allPerm(test.input, 0, hashSetOf()), test.expect)
        Assertions.assertThat(allPerm(test.input, 0, hashSetOf())).isEqualTo(test.expect)
    }
}