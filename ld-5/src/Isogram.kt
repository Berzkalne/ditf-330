class Isogram {
    fun isIsogram(word: String): Boolean {
        return word.toLowerCase()
                .filter { it.isLetter() }
                .groupBy { it }
                .all { it.value.size == 1 }
    }
}
