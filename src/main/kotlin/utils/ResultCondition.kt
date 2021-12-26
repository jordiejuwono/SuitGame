package utils

class ResultCondition {
    fun setResultCondition(handOne: String, handTwo: String) {
        //Konfirmasi input yang dimasukkan kedua pemain
        println("Pemain 1 = ${handOne[0].uppercase() + handOne.substring(1)}")
        println("========VS========")
        println("Pemain 2 = ${handTwo[0].uppercase() + handTwo.substring(1)}")
        println()
        println("Hasil:")

        if (handOne == handTwo) {
            println("DRAW!")
        } else if (handOne == "batu" && handTwo == "gunting") {
            println("Pemain 1 MENANG!")
        } else if (handOne == "gunting" && handTwo == "kertas") {
            println("Pemain 1 MENANG!")
        } else if (handOne == "kertas" && handTwo == "batu") {
            println("Pemain 1 MENANG!")
        } else {
            println("Pemain 2 MENANG!")
        }
    }
}