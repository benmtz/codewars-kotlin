object StockList {
  fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {

    // Building of a <Char, Int> Map
    val bookCount = lstOfArt.map {
      it.split(" ").let {
        Pair(it[0][0], it[1].toInt())
      }
    }.groupBy { it.first }.mapValues { it.value.sumBy { it.second } }

    if (lstOfCat.all { bookCount.get(it[0]) == null }) {
      // Special rule : if no book then return an empty string
      return "";
    } else {
      // Applying to lstOfCat and formatting
      return lstOfCat.map {
        "(${it} : ${bookCount.get(it[0]) ?: 0})"
      }.joinToString(" - ")
    }

  }
}
