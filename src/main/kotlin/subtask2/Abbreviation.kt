package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {

        val s = a.toLowerCase().replace("[^${b.toLowerCase()}]".toRegex(), "")
        return if(s.equals(b, ignoreCase = true)) "YES" else "NO"

    }

}
