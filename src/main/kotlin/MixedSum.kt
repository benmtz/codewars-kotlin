public class MixedSum {

    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {
        return mixed.fold(0, {acc, any -> acc + if (any is String) any.toInt() else if (any is Int) any else 0});
    }
}
