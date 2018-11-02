object WordCount {
    fun phrase(phrase: String): Map<String, Int> {
        return phrase.toLowerCase()
                .split(Regex("[^a-zA-Z0-9']+"))
                .filter { it.isNotEmpty() }
                .map { it.removeSurrounding("'", "'") }
                .groupBy { it }
                .mapValues { it.value.size }
    }
}