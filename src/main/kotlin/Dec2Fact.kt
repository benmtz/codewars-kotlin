package solution

object Dec2Fact {

  fun fact(n: Int): Int {
    return n * fact(n - 1);
  }

  fun dec2FactString(n: Long): String {
    var facts = mutableListOf(1);
    var candidate = 1;
    var currentFactorial = 0;
    while (candidate * currentFactorial < n) {
      facts.add(candidate * currentFactorial)
    }
    // your code
    return ""
  }

  fun factString2Dec(str: String): Long {
    return str.split("")
        .reversed()
        .map {it.toLong()}
        .mapIndexed { index, s -> s.toLong() * fact(index) }
        .sum()
  }
}
