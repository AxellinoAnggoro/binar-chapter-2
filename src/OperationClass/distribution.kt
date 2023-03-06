package OperationClass

class distribution {
    fun bagi(angka1: Int, angka2: Int): Int {
        if (angka2 == 0) {
            println("Tidak bisa membagi dengan angka nol")
        }
        return angka1 / angka2

    }
}