object DoubleSort {
  fun dbSort(a: Array<Any>): Array<Any> {
    val numbers: List<Int> = a.filterIsInstance<Int>().sorted()
    val words = a.filterIsInstance<String>().sorted()
    return (numbers + words).toTypedArray()
  }
}
