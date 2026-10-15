fun median(dataset: List<Float>): Float {
    require(dataset.isNotEmpty())

    val sorted = dataset.sorted()
    val middle = sorted.size / 2

    if (sorted.size % 2 == 0) {
        return (sorted[middle - 1] + sorted[middle]) / 2
    }
    else {
        return sorted[middle]
    }
}