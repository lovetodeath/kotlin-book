fun computeSqrt(n: Double): Double {
    if(n >= 0) {
        return Math.sqrt(n)
    } else {
        throw RuntimeException("No negative please")
    }
}