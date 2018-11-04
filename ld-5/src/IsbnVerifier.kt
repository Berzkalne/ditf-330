class IsbnVerifier {
    fun isValid(input: String): Boolean = input
            .toLowerCase()
            .filter { it.isDigit() || it == 'x' }
            .apply { if ((length != 10) || ((indexOf('x') != 9) && (indexOf('x') != -1))) return false }
            .map { if (it == 'x') 10 else Character.getNumericValue(it) }
            .mapIndexed { idx, it -> it * (10 - idx) }.sum() % 11 == 0
}
