import OperationClass.Multiply
import OperationClass.Subtraction
import OperationClass.Sum
import OperationClass.distribution

fun main() {
    println("Pilih operasi dibawah ini: ")
    println("1. Pertambahan (+)")
    println("2. Pengurangan (-)")
    println("3. Pembagian (/)")
    println("4. Perkalian (*)")
    print("Pilih Operasi: ")
    val operasi = readln().toInt()

    if(operasi > 4){
        println("Operasi yang anda pilih tidak ada!!!")
    }else{
        print("Masukan Angka ke-1: ")
        val number1 = readln().toDouble()
        print("Masukan Angka ke-2: ")
        val number2 = readln().toDouble()
        val hasil = when(operasi){
            1 -> Sum().sumNumber(number1, number2)
            2 -> Subtraction().subtractionNumber(number1, number2)
            3 -> distribution().bagi(number1, number2)
            4 -> Multiply().multiplyNum(number1, number2)
            else -> "Daftar operasi yang anda pilih tidak ada!!!"
        }
        println("Hasil : $hasil")
    }
}