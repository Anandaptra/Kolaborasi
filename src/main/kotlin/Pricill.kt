fun main(){
   // println("Hai, aku pricil")
    print("Masukkan angka pertama: ")
    val angka1 = readLine()!!.toDouble()

    print("Masukkan angka kedua: ")
    val angka2 = readLine()!!.toDouble()

    print("Masukkan operator (+, -, *, /): ")
    val operasi = readLine()

    val hasil: Double?

    when (operasi) {
        "+" -> hasil = angka1 + angka2
        "-" -> hasil = angka1 - angka2
        "*" -> hasil = angka1 * angka2
        "/" -> hasil = angka1 / angka2
        else -> {
            println("Operator yang dimasukkan tidak valid")
            return
        }
    }

    println("Hasil dari $angka1 $operasi $angka2 adalah $hasil")
}