fun main(args: Array<String>) {

    val list = IntArray(10) { readLine()!!.toInt() }
    for (x in list.indices) { if ( list[x] < 1) list[x] = 1 }
    for (i in list.indices) println("X[$i] = ${list[i]}")

}