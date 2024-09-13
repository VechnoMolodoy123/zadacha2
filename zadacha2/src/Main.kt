fun main() {
    print("Введите строку символов: ")
    val input = readlnOrNull() ?: ""

    // Использование библиотеки groupingBy и eachCount для группировки символов и подсчета их количества
    val groupAndCount = input.groupingBy { it }.eachCount()

    // Сортировка по алфавиту при помощи toSortedMap
    val sortedGroupAndCount = groupAndCount.toSortedMap()

    // Вывод результата
    for ((char, count) in sortedGroupAndCount) {
        println("$char -> $count")
    }
}