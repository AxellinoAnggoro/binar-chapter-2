package OperationClass

class distribution {
    fun bagi(angka1: Double, angka2: Double): String {
        if (angka2 == 0.0) {
            return "Tidak bisa membagi dengan angka nol"
        }
        return (angka1 / angka2).toString()

    }
}