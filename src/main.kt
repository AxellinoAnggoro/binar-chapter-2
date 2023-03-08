import OperationClass.Multiply
import OperationClass.Subtraction
import OperationClass.Sum
import OperationClass.distribution

fun main() {

    print("Masukkan angka pertama: ")
    val angkaPertama = readLine()!!.toDouble()
    print("Masukkan angka kedua: ")
    val angkaKedua = readLine()!!.toDouble()
    print("Pilih operator (+, -, *, /): ")
    val operator = readLine()

    val hasil = when (operator) {
        "+" -> Sum().sumNumber(angkaPertama, angkaKedua)
        "-" -> Subtraction().subtractionNumber(angkaPertama, angkaKedua)
        "/"-> distribution().bagi(angkaPertama, angkaKedua)
        "*"-> Multiply().multiplyNum(angkaPertama, angkaKedua)
        else -> 0.0
    }
    println("Hasil : $hasil")
}
