package players

abstract class InputPlayer(private val player: String) {
    fun printPlayerNumber() {
        print("Masukkan $player: ")
    }

    abstract fun inputPlayerHand(): String
}