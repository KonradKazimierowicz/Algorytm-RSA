fun czyPierwsza(n: Int): Boolean {
    if (n < 2) {
        return false
    }
    var i = 2
    while (i * i <= n) {
        if (n % i == 0) {
            return false
        }
        i++
    }
    return true
}

fun generujPierwsze(): Int {
    var pierwsza = (10000..20000).random()
    while (!czyPierwsza(pierwsza)) {
        pierwsza++
    }
    return pierwsza
}

fun nwd(a:Int,b:Int): Int {
    var x = a
    var y = b
    while (y!=0){
        val temp = y
        y = a %y
        x = temp
    }
    return x
}

fun main(args: Array<String>) {
    var p = generujPierwsze()
    var q = generujPierwsze()

    var n:Int = p*q
    var k:Int = (p-1)*(q-1)
    var e = (0..20000).random() % k +2

    while (nwd(k,e)!=1 && !czyPierwsza(e)){
        e++
    }
    println(e)
    println("${p}, ${q}")
}