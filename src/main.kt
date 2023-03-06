import OperationClass.Subtraction
import OperationClass.Sum

fun main() {
    println("Pilih operasi dibawah ini: ")
    println("1. Pertambahan (+)")
    println("2. Pengurangan (-)")
    println("3. Pembagian (/)")
    println("4. Modulo (%)")
    println("5. Perkalian (*)")
    print("Pilih Operasi: ")
    val operasi = readln().toInt()
    print("Masukan Angka ke-1: ")
    val number1 = readln().toDouble()
    print("Masukan Angka ke-2: ")
    val number2 = readln().toDouble()


    val hasil = when(operasi){
        1 -> Sum().sumNumber(number1, number2)
        2 -> Subtraction().subtractionNumber(number1, number2)
    }
}