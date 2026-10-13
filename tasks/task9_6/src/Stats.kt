// Task 9.6: variance() function
fun variance(dataset: List<Double>): Double {
    require(dataset.size >= 2) {
        "At least two values are required"
    }

    val mean = dataset.average()

    val sumSquaredDev = dataset.sumOf {
        (it - mean) * (it - mean)
    }

    return sumSquaredDev / (dataset.size - 1)
}