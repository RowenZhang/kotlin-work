// Task 5.2.2: conversion of marks into grades, using a function
fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    for (argument in args) {
        val mark = argument.toInt()
        val result = grade(mark)

        println("$mark is a $result")
    }
}