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

// Nomor 1

        // Input berat dan tinggi badan dari pengguna
        print("Masukkan berat badan Anda (kg): ")
        val weight = readLine()!!.toDouble()

        print("Masukkan tinggi badan Anda (cm): ")
        val height = readLine()!!.toDouble() / 100

        // Hitung BMI dan tampilkan hasilnya
        val bmi = weight / (height * height)
        println("BMI Anda adalah $bmi")

        // Berikan keterangan berdasarkan kategori BMI
        when {
            bmi < 17 -> println("Kekurangan berat badan tingkat berat")
            bmi >= 17 && bmi <= 18.5 -> println("Kekurangan berat badan tingkat rendah")
            bmi >= 18.5 && bmi <= 25 -> println("Normal")
            bmi >= 25 && bmi <= 27 -> println("Kelebihan berat badan tingkat ringan")
            bmi > 27 -> println("Kelebihan berat badan tingkat berat")
            else -> println("Masukan input yang sesuai")
        }


}

