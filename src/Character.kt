fun main(args: Array<String>) {
    var charA : Char = 'A'
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    var strA: String = charA.toString()
    println("kini CharA sudah menjadi String = "+strA)
}