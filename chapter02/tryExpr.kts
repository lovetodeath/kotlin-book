fun tryExpr(blowup: Boolean): Int {
    return try {
        if (blowup) {
            throw RuntimeException("fail")
        }
        2
    } catch (ex: Exception) {
        4
    } finally {
        //...
    }
}
println(tryExpr(false))
println(tryExpr(true))