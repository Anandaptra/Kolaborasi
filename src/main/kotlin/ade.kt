fun main() {
    //tugas kolab kalku sederhana
    print("Masukkan Angka Pertama : ")
    val angkaPertama = readLine()!!.toDouble()

    print("Masukkan Angka Kedua : ")
    val angkaKedua = readLine()!!.toDouble()

    print("Masukkan operator (+, -, *, /): ")
    val operator = readLine()

    val Hasil: Double?

    when (operator){
        "+" -> Hasil = angkaPertama + angkaKedua
        "-" -> Hasil = angkaPertama - angkaKedua
        "*" -> Hasil = angkaPertama * angkaKedua
        "/" -> Hasil = angkaPertama / angkaKedua
        else -> {
            println("Operator Tidak Valid")
            return }
    }

    println("Hasil $angkaPertama $operator $angkaKedua = $Hasil")
}