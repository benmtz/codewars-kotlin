import kotlin.math.pow

fun parseDataset(data: String): Map<String, List<Double>> {
  val parsed = HashMap<String, List<Double>>()
  data.split("\n").map { it.split(":") }.forEach {
    parsed.put(
        it.get(0),
        it.get(1)?.split(",").map { it.replace(Regex("[a-zA-Z]+ "), "").toDouble() }
    )
  }
  return parsed
}
fun mean(town:String, strng:String):Double {
  return parseDataset(strng).get(town)?.let {
    it.sum() / it.size
  } ?: -1.0;
}
fun variance(town:String, strng:String):Double {
  return parseDataset(strng).get(town)?.let {
    val townMean = mean(town, strng)
    it.map { (it - townMean).pow(2)}.sum() / it.size
  } ?: -1.0
}
