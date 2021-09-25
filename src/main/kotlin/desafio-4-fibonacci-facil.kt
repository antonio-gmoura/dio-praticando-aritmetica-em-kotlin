fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    var num = arrayOf(0, 1, 1)

    for (i in 0..(n-1)) {
        if (i > 1) {
            num[2] = num[0] + num[1]
            num[0] = num[1]
            num[1] = num[2]
        } else {
            num[2] = num[i]
        }
        print(num[2].toString() + " ")
    }
    println()

}