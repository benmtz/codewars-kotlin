package solution

import org.junit.Test
import kotlin.test.assertEquals

class Dec2FactTest {

  private fun testing1(nb: Long, expect: String) {
    val actual: String = Dec2Fact.dec2FactString(nb)
    assertEquals(expect, actual)
  }

  private fun testing2(str: String, expect: Long) {
    val actual: Long = Dec2Fact.factString2Dec(str)
    assertEquals(expect, actual)
  }

  @Test
  fun basicTests1() {
    testing1(36288000L, "A0000000000")
    testing1(2982L, "4041000")
    testing1(463L, "341010")

  }

  @Test
  fun basicTests2() {
    testing2("341010", 463L)
    testing2("4042100", 2990L)
    testing2("27A0533231100", 1273928000L)

  }
}
