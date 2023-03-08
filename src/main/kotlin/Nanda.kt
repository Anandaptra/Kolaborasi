fun main() {
    print("Masukkan angka pertama: ")
    val angka1 = readLine()!!.toInt()

    print("Masukkan angka kedua: ")
    val angka2 = readLine()!!.toInt()

    print("Operasi (+, -, *, /): ")
    val operator = readLine()

    val hasil = when (operator) {
        "+" -> angka1 + angka2
        "_" -> angka1 - angka2
        "*" -> angka1 * angka2
        "/" -> angka1 / angka2
        else -> throw IllegalArgumentException("tidak valid")
    }

    println("Hasil : $angka1 $operator $angka2 = $hasil")
}